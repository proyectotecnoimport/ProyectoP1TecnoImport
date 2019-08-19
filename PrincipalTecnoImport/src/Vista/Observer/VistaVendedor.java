/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Observer;

import Controlador.CtrlJefeBodega;
import Controlador.CtrlVendedor;
import Vista.VistaTecnoImport;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import static javafx.scene.input.KeyCode.T;
import javafx.scene.layout.BorderPane;
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
    }
    
    public void crearEscena(){
        
        Button agregar=new Button("Agregar Cliente");
        Button editarC=new Button("Editar Cliente");
        Button buscar=new Button("Buscar Articulo");
        Button cotizar=new Button("Realizar Cotizacion");
        Button editarCoti=new Button("Editar Cotizacion");
        Button vender=new Button("Realizar Venta");
        Button consultEntrega=new Button("Consultar Entregas");
        Button ingresoDoc=new Button("Ingresar Documentos");
        
        viewVendedor.getChildren().addAll(agregar,editarC,buscar,cotizar,editarCoti,vender,consultEntrega,ingresoDoc);
        viewVendedor.setSpacing(40);
        viewVendedor.setAlignment(Pos.CENTER);
        menu.getChildren().add(viewVendedor);
        
        buscar.setOnAction(e->escenaBusqueda());
        
    }
    
    public void escenaBusqueda(){
        
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        Button nombre=new Button("Buscar por Nombre");
        Button descrip=new Button("Buscar por Descripcion");
        Button cate=new Button("Buscar por Categoria");
        Button retroceder=new Button("Regresar");
        
        content.getChildren().addAll(nombre,descrip,cate);
        content.setSpacing(40);
        content.setAlignment(Pos.CENTER);
        search.setCenter(content);
        retroceder.setAlignment(Pos.BOTTOM_LEFT);
        search.setBottom(retroceder);
        menu.getChildren().add(search);
        
        retroceder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menu.getChildren().add(viewVendedor);
            }
        });
        
        nombre.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menu.getChildren().add(viewVendedor);
            }
        });
    }
}
