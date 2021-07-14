/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {  
        
        /*TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        
        ArrayList<Transporte> lista = new ArrayList();
        
        lista.add(bus);
        lista.add(taxi);
        
        tipos.establecerTransportes(lista);
        
        //tipos.establecerTransporteBus(bus);
        //tipos.establecerTransporteTaxi(taxi);
        
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        */
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia t3 = new TransporteTransvia();
        t3.establecerCooperativaTransTrans("a");
        t3.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerCooperativaTransArereo("B");
        aereo.establecerTarifa();
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerCooperativaTransMaritimo("M");
        mar.establecerTarifa();
    
        TiposTransporte tipos = new TiposTransporte();
        
        ArrayList<Transporte> lista = new ArrayList();
        
        lista.add(bus);
        lista.add(taxi);
        lista.add(t3);
        lista.add(aereo);
        lista.add(mar);
        
        tipos.establecerTransportes(lista);
        
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
    }
}
