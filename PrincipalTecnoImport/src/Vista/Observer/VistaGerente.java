/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Observer;

import Controlador.CtrlGerente;
import Vista.VistaTecnoImport;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dario Triviño
 */
public class VistaGerente extends VistaTecnoImport{
    
    VBox viewGerente=new VBox();
    private CtrlGerente controlGerente;

    public VistaGerente(int alturaVentana, int anchoVentana, String tituloVentana) {
        super(alturaVentana, anchoVentana, tituloVentana);
        controlGerente=new CtrlGerente();
    }
    
    public void crearEscena(){
        
        Button consulta=new Button("Consultar Sistema");
        Button asignar=new Button("Asignar Administrador");
        Button stock=new Button("Pedir abastecimiento");
        
        viewGerente.getChildren().addAll(consulta,asignar,stock);
        viewGerente.setSpacing(40);
        viewGerente.setAlignment(Pos.CENTER);
        menu.getChildren().add(viewGerente);
        
    }
    
}
