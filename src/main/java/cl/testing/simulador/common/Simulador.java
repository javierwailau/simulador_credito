/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.common;

import java.util.Date;

/**
 *
 * @author Franco
 */
public class Simulador {
    private String rut;
    private int monto;
    private int cuotas;
    private Date fechaVencimiento;
    private String seguro;
    private double interesMensual;
    private double valorCuota;
    
    public void calcular(){
        valorCuota = (monto/((1/interesMensual)*(1-1/Math.pow(1+interesMensual,cuotas))));
    }
    
    
}