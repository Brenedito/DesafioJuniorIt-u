package com.example.DesfioItauJunior.Services;

import com.example.DesfioItauJunior.Dtos.TransacoesDto;
import com.example.DesfioItauJunior.Models.TransacaoModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import java.time.OffsetDateTime;

import java.util.ArrayList;

@Service
public class TransacoesService {

    public ArrayList<TransacaoModel> transacoes = new ArrayList<>();




    public HttpStatus CreateTransacao(TransacoesDto transacaodto){

        if(transacaodto.valor() == null || transacaodto.dataHora() == null){
//            throw new CorpoTransacaoInvalidoException("O Corpo da transação é inválido");
            return HttpStatus.BAD_REQUEST;
        }
        if(!OffsetDateTime.now().isAfter(transacaodto.dataHora())){
//            throw new DataHoraInvalidoException("A data da transação é inválida");
            return HttpStatus.UNPROCESSABLE_ENTITY;
        }
        if(transacaodto.valor() < 0){
//            throw new ValorInvalidoException("O valor da transação é Negativo");
            return HttpStatus.UNPROCESSABLE_ENTITY;
        }


        TransacaoModel currentTransacao = new TransacaoModel();
        currentTransacao.setValor(transacaodto.valor());
        currentTransacao.setDataHora(transacaodto.dataHora());
        transacoes.add(currentTransacao);
        return HttpStatus.CREATED;
    }

    public HttpStatus DeleteTransacoes(){
        transacoes.clear();
        return HttpStatus.OK;
    }
}
