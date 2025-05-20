package com.example.DesfioItauJunior.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EstatisticasModel {

    private Integer count = 0;
    private Double sum = 0.0;
    private Double avg = sum/count;
    private Double min = Double.POSITIVE_INFINITY;
    private Double max = 0.0;

    public void AdicionarContagem(){
        count++;
    }
    public void AdicionarSoma(Double valor){
        sum += valor;
    }

    public void ResetarValor() {
        count = 0;
        sum = 0.0;
        avg = 0.0;
        min = Double.POSITIVE_INFINITY;
        max = 0.0;
    }
    public void Media(){

    }

}
