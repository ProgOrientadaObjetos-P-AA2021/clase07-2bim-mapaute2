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
public class TransporteTransvia extends Transporte{
    private String cooperativaTransTrans;

    public void establecerCooperativaTransTrans(String n) {
        cooperativaTransTrans = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 100.00 + 60.50;
    }

    public String obtenerCooperativaTransTrans() {
        return cooperativaTransTrans;
    }
    
}
