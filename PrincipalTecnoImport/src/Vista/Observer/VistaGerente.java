/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Observer;

import Controlador.CtrlGerente;
import Vista.VistaTecnoImport;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        Button buscar=new Button("Buscar Articulo");
        Button stock=new Button("Pedir abastecimiento");
        
        viewGerente.getChildren().addAll(consulta,asignar,buscar,stock);
        viewGerente.setSpacing(40);
        viewGerente.setAlignment(Pos.CENTER);
        menu.getChildren().add(viewGerente);
        
        buscar.setOnAction(e->escenaBusqueda());
        asignar.setOnAction(e->escenaAsignacion());
        
    }
    
    public void escenaBusqueda(){
        
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        Label lblBusqueda=new Label("Busqueda de Articulo");
        Button nombre=new Button("Busacar por Nombre");
        Button descrip=new Button("Buscar por Descripcion");
        Button cate=new Button("Buscar por Categoria");
        Button retroceder=new Button("Regresar");
        
        content.getChildren().addAll(lblBusqueda,nombre,descrip,cate);
        content.setSpacing(40);
        content.setAlignment(Pos.CENTER);
        search.setCenter(content);
        retroceder.setAlignment(Pos.BOTTOM_LEFT);
        search.setBottom(retroceder);
        menu.getChildren().add(search);
        
        retroceder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                menu.getChildren().add(viewGerente);
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
                menu.getChildren().add(viewGerente);
            }
        });
    }
    
}
