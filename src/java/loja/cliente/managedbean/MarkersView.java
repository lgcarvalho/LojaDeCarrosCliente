/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.cliente.managedbean;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean
public class MarkersView implements Serializable {

    private static final long serialVersionUID = 4181328649283923056L;

    private MapModel caminhoDoMar = new DefaultMapModel();
    private MapModel vilaScarpelli = new DefaultMapModel();
    private MapModel matriz = new DefaultMapModel();
    private MapModel rudgeRamos = new DefaultMapModel();
    private MapModel saoPedro = new DefaultMapModel();
    
    @PostConstruct
    public void init() {

        //Shared coordinates
        LatLng coord1 = new LatLng(-23.665605, -46.566337);
        LatLng coord2 = new LatLng(-23.673180, -46.542855);
        LatLng coord3 = new LatLng(-23.679682, -46.460845);
        LatLng coord4 = new LatLng(-23.652913, -46.570083);
        LatLng coord5 = new LatLng(-23.722040, -46.524845);

        //Basic marker
        Marker marcador1 = new Marker(coord1, "Loja AluCar Caminho do Mar");
        Marker marcador2 = new Marker(coord2, "Loja AluCar Vila Scarpelli");
        Marker marcador3 = new Marker(coord3, "Loja AluCar Matriz");
        Marker marcador4 = new Marker(coord4, "Loja AluCar Rudge Ramos");
        Marker marcador5 = new Marker(coord5, "Loja AluCar São Pedro");
        
        caminhoDoMar.addOverlay(marcador1);
        vilaScarpelli.addOverlay(marcador2);
        matriz.addOverlay(marcador3);
        rudgeRamos.addOverlay(marcador4);
        saoPedro.addOverlay(marcador5);
    }

    public MapModel getSimpleModel(String nome) {
        if(nome.equals("Loja AluCar Caminho do Mar")) {
            return caminhoDoMar;
        } else if(nome.equals("Loja AluCar Vila Scarpelli")) {
            return vilaScarpelli;
        } else if (nome.equals("Loja AluCar Matriz")) {
            return matriz;
        } else if (nome.equals("Loja AluCar Rudge Ramos")) {
            return rudgeRamos;
        } else if (nome.equals("Loja AluCar São Pedro")) {
            return saoPedro;
        } else {
            return null;
        }
    }
}
