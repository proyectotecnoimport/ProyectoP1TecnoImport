/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Observer;

import Controlador.CtrlGerente;
import Controlador.CtrlJefeBodega;
import Modelo.Decorator.Gerente;
import Modelo.Empleado;
import Modelo.Repartidor;
import Vista.VistaTecnoImport;
import java.util.Queue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dario Triviño
 */
public class VistaJefeBodega extends VistaTecnoImport {
    
    VBox viewJefe=new VBox();
    private CtrlJefeBodega controlJefebodega=null;
    
    public VistaJefeBodega(int alturaVentana, int anchoVentana, String tituloVentana) {
        super(alturaVentana, anchoVentana, tituloVentana);
    }
    
    public void crearEscena(){
        
        Button entrega=new Button("Crear Ruta de Entrega");
        Button asignar=new Button("Asignar Repartidor");
        Button reportar=new Button("Reportar Envio");
        Button asignarAdmin=new Button("Asignar Administrador");
        Button buscar=new Button("Buscar Articulo");
        
        viewJefe.getChildren().addAll(entrega,asignar,reportar,asignarAdmin,buscar);
        viewJefe.setSpacing(40);
        viewJefe.setAlignment(Pos.CENTER);
        menu.getChildren().add(viewJefe);
        
        buscar.setOnAction(e->escenaBusqueda());
        
        asignarAdmin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for(Empleado e:controlJefebodega.getJefeBodega().getBodega().getEmpleados()){
                    if(e instanceof Gerente){
                         escenaAsignacion();
                         break;
                    }
                     else{
                        Alert a=new Alert(AlertType.INFORMATION);
                        a.setTitle("Accion no permitida");
                        a.setHeaderText("");
                        a.setContentText("Ya existe un Gerente en la Bodega con esta funcion");
                        a.showAndWait();
                    }
                }
            }
        });
        
        entrega.setOnAction(e->escenaRutaEntrega());
    }
    
    public void escenaBusqueda(){
        
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        Button nombre=new Button("Busacar por Nombre");
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
                menu.getChildren().add(viewJefe);
            }
        });
    }
    
    public void escenaAsignacion(){
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        Label lblAsignacion=new Label("Asignar Cargo Administrativo");
        Button jefe=new Button("Jefe De Bodega");
        Button vendor=new Button("Vendedor");
        Button gerente=new Button("Gerente");
        Button retroceder=new Button("Regresar");
        
        content.getChildren().addAll(lblAsignacion,jefe,vendor,gerente);
        content.setSpacing(40);
        content.setAlignment(Pos.CENTER);
        search.setCenter(content);
        retroceder.setAlignment(Pos.BOTTOM_LEFT);
        search.setBottom(retroceder);
        menu.getChildren().add(search);
        
        retroceder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menu.getChildren().add(viewJefe);
            }
        });
    }
    
     public void escenaRutaEntrega(){
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        Label lblCreacion=new Label("Crear Ruta de Entrega");
        
        HBox contInicio=new HBox();
        Label lblLugarIni=new Label("Ingresar inicio");
        TextField txtLugarIni=new TextField();
        contInicio.getChildren().addAll(lblLugarIni,txtLugarIni);
        contInicio.setSpacing(20);
        contInicio.setAlignment(Pos.CENTER);
        
        HBox contFin=new HBox();
        Label lblLugarFin=new Label("Ingresar llegada");
        TextField txtLugarFin=new TextField();
        contFin.getChildren().addAll(lblLugarFin,txtLugarFin);
        contFin.setSpacing(20);
        contFin.setAlignment(Pos.CENTER);
        
        Button crearRuta=new Button("CrearRuta");
        crearRuta.setAlignment(Pos.CENTER);
        Button retroceder=new Button();
        content.getChildren().addAll(lblCreacion,contInicio,contFin,crearRuta);
        content.setSpacing(40);
        content.setAlignment(Pos.CENTER);
        search.setCenter(content);
        retroceder.setAlignment(Pos.BOTTOM_LEFT);
        search.setBottom(retroceder);
        menu.getChildren().add(search);
        
        retroceder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menu.getChildren().add(viewJefe);
            }
        });
        
        crearRuta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menu.getChildren().add(viewJefe);
            }
        });
    }
}
