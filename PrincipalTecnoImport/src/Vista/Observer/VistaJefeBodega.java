/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Observer;

import Controlador.CtrlGerente;
import Controlador.CtrlJefeBodega;
import Vista.VistaTecnoImport;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dario Triviño
 */
public class VistaJefeBodega extends VistaTecnoImport {
    
    VBox viewJefe=new VBox();
    private CtrlJefeBodega controlJefebogeda;
    
    public VistaJefeBodega(int alturaVentana, int anchoVentana, String tituloVentana) {
        super(alturaVentana, anchoVentana, tituloVentana);
        controlJefebogeda=new CtrlJefeBodega();
    }
    
    public void crearEscena(){
        
        Button entrega=new Button("Crear Ruta de Entrega");
        Button asignar=new Button("Asignar Repartidor");
        Button reportar=new Button("Reportar Envio");
        Button asignarAdmin=new Button("Asignar Administrador");
        
        viewJefe.getChildren().addAll(entrega,asignar,reportar,asignarAdmin);
        viewJefe.setSpacing(40);
        viewJefe.setAlignment(Pos.CENTER);
        menu.getChildren().add(viewJefe);
        
    }
}
