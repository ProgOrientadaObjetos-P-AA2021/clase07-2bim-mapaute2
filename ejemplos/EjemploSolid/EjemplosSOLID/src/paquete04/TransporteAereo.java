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
public class TransporteAereo extends Transporte {
    private String cooperativaTransArereo;

    public void establecerCooperativaTransArereo(String n) {
        cooperativaTransArereo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 5.500 + 0.35;
    }

    public String obtenerCooperativaTransArereo() {
        return cooperativaTransArereo;
    }
    
}
