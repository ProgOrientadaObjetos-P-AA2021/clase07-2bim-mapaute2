/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author usuario
 */
public class TransporteMaritimo extends Transporte {
    private String cooperativaTransMaritimo;

    public void establecerCooperativaTransMaritimo(String n) {
        cooperativaTransMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaTransMaritimo() {
        return cooperativaTransMaritimo;
    }
    
}
