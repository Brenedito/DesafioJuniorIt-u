package com.example.DesfioItauJunior.Services;

import com.example.DesfioItauJunior.Models.EstatisticasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class EstatisticasService {

    @Autowired
    private TransacoesService transacoesService;


    private EstatisticasModel Estatistica = new EstatisticasModel();

    //Tenho noção que essa não é a melhor forma de solucionar esse problema, pensei em fazer usando o array já existente
    //do transacoesservice, porém iria envolver diferentes For's e a chance de da algum erro aumentaria ainda mais.
    public EstatisticasModel GetEstatisticas() {
        Estatistica.ResetarValor();
        transacoesService.transacoes.forEach(transacoes -> {
            if(transacoes.getDataHora().isAfter(OffsetDateTime.now().minusMinutes(1))){
                Estatistica.AdicionarContagem();
                Estatistica.AdicionarSoma(transacoes.getValor());
                if(Estatistica.getMin()>transacoes.getValor()){
                    Estatistica.setMin(transacoes.getValor());
                }
                if(Estatistica.getMax()<transacoes.getValor()){
                    Estatistica.setMax(transacoes.getValor());
                }
                Estatistica.setAvg(Estatistica.getSum()/Estatistica.getCount());
            }
        });
        return Estatistica;
    }
}
