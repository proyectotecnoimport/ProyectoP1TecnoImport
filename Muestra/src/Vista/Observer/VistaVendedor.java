/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Observer;


import Vista.VistaTecnoImport;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.T;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dario Triviño
 */
public class VistaVendedor extends VistaTecnoImport{
    
    VBox viewVendedor=new VBox();
   

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
        
        nombre.setOnAction(e->buscar()) ;
        descrip.setOnAction(e->buscar()) ;
        cate.setOnAction(e->buscar()) ;
        
    }
    
     public void buscar(){
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        HBox contArti=new HBox();
        
        Label lblAsignacion=new Label("Articulo a Buscar");
        Label lblArticulo=new Label("Escriba el articulo");
        TextField txtArticulo=new TextField();
        contArti.getChildren().addAll(lblArticulo,txtArticulo);
        Button buscar=new Button("Buscar");
        Button retroceder=new Button("Regresar");
        
        content.getChildren().addAll(lblAsignacion,contArti,buscar);
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
     }
     
     public void escenaAdmin(){
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        Label lblBusqueda=new Label("Venta Administrador");
        Button creU=new Button("Crear Usuario");
        Button conU=new Button("Consultar Usuario");
        Button actU=new Button("Actualizar Usuario");
        Button elimU=new Button("Eliminar Usuario");
        Button ingS=new Button("Ingresar Stocks");
        Button actS=new Button("Actualizar Stocks");
        Button actP=new Button("Actualizar Precio Venta");
        Button impor=new Button("Importar Datos");
        
        Button retroceder=new Button("Regresar");
        
        content.getChildren().addAll(lblBusqueda,creU,conU,actU,elimU,ingS,actS,actP,impor);
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
        
    }
}
