/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea2consumer;

/**
 *
 * @author Lichita
 */
public class Aerolinea2WSConsumer {

    public static Boolean registrarBoleto(java.lang.String persona, java.lang.String paquete, java.lang.String numPersonas, java.lang.Integer idVuelo) {
        aerolinea2consumer.AerolineaAviancaws service = new aerolinea2consumer.AerolineaAviancaws();
        aerolinea2consumer.Aerolineaws port = service.getAerolineawsPort();
        return port.registrarBoleto(persona, paquete, numPersonas, idVuelo);
    }

    public static java.util.List<aerolinea2consumer.Vuelo> retrieveVuelosByPara(java.lang.String inicio, java.lang.String fin, java.lang.String origen, java.lang.String destino, java.lang.String numPer) {
        aerolinea2consumer.AerolineaAviancaws service = new aerolinea2consumer.AerolineaAviancaws();
        aerolinea2consumer.Aerolineaws port = service.getAerolineawsPort();
        return port.retrieveVuelosByPara(inicio, fin, origen, destino, numPer);
    }
    
}
