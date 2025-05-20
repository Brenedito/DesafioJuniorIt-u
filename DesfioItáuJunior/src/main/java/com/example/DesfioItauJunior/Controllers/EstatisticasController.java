package com.example.DesfioItauJunior.Controllers;

import com.example.DesfioItauJunior.Models.EstatisticasModel;
import com.example.DesfioItauJunior.Services.EstatisticasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatistica")
public class EstatisticasController {

    @Autowired
    private EstatisticasService estatisticasService;

    @GetMapping
    public EstatisticasModel GetEstatisticas() {
        return estatisticasService.GetEstatisticas();
    }
}
