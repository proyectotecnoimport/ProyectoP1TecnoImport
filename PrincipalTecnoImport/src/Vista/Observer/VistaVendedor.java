/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Observer;

import Controlador.CtrlJefeBodega;
import Controlador.CtrlVendedor;
import Vista.VistaTecnoImport;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dario Triviño
 */
public class VistaVendedor extends VistaTecnoImport{
    
    VBox viewVendedor=new VBox();
    private CtrlVendedor controlVendedor;

    public VistaVendedor(int alturaVentana, int anchoVentana, String tituloVentana) {
        super(alturaVentana, anchoVentana, tituloVentana);
        this.controlVendedor=controlVendedor;
    }
    
    public void crearEscena(){
        
        Button agregar=new Button("Agregar Cliente");
        Button editarC=new Button("Editar Cliente");
        Button cotizar=new Button("Realizar Cotizacion");
        Button editarCoti=new Button("Editar Cotizacion");
        Button vender=new Button("Realizar Venta");
        Button consultEntrega=new Button("Consultar Entregas");
        Button ingresoDoc=new Button("Ingresar Documentos");
        
        viewVendedor.getChildren().addAll(agregar,editarC,cotizar,editarCoti,vender,consultEntrega,ingresoDoc);
        viewVendedor.setSpacing(40);
        viewVendedor.setAlignment(Pos.CENTER);
        menu.getChildren().add(viewVendedor);
        
    }
}
