package com.example.DesfioItauJunior.Controllers;


import com.example.DesfioItauJunior.Dtos.TransacoesDto;
import com.example.DesfioItauJunior.Services.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacao")
public class TransacoesController {

    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    public HttpStatus CreateTransacao(@RequestBody TransacoesDto transacoesDto){
        return transacoesService.CreateTransacao(transacoesDto);
    }

    @DeleteMapping
    public HttpStatus DeleteTransacoes(){
        return transacoesService.DeleteTransacoes();
    }

}
