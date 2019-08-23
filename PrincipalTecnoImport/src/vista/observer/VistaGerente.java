package vista.observer;

import controlador.CtrlGerente;
import vista.VistaTecnoImport;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dario Triviño
 */
public class VistaGerente extends VistaTecnoImport{
    
   private VBox viewGerente=new VBox();
   private CtrlGerente ctrlGerente;

    public VistaGerente(int alturaVentana, int anchoVentana, String tituloVentana) {
        super(alturaVentana, anchoVentana, tituloVentana);
        scene=new Scene(viewGerente, alturaVentana, anchoVentana);
        crearEscena();
    }
    
   @Override
    public Scene getScene() {
        return scene;
    }
    
    public VBox getRoot(){
        return viewGerente;
    }
    
   @Override
    public void crearEscena(){
        Button consulta=new Button("Consultar Sistema");
        Button asignar=new Button("Asignar Administrador");
        Button buscar=new Button("Buscar Articulo");
        Button stock=new Button("Pedir abastecimiento");
        
        viewGerente.getChildren().addAll(consulta,asignar,buscar,stock);
        viewGerente.setSpacing(40);
        viewGerente.setAlignment(Pos.CENTER);
        scene.setRoot(viewGerente);
        
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
        scene.setRoot(search);
        
        retroceder.setOnAction((ActionEvent event) -> {
            scene.setRoot(viewGerente);
        });
        
        nombre.setOnAction(e->buscar()) ;
        descrip.setOnAction(e->buscar()) ;
        cate.setOnAction(e->buscar()) ;
        
            
        
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
        scene.setRoot(search);
        
        retroceder.setOnAction((ActionEvent event) -> {
            scene.setRoot(viewGerente);
        });
    }
    
    public void buscar(){
        BorderPane search=new BorderPane();
        VBox content=new VBox();
        HBox contArti=new HBox();
        
        Label lblAsignacion=new Label("Articulo a Buscar");
        Label lblArticulo=new Label("Escriba el articulo");
        TextField txtArticulo=new TextField();
        contArti.getChildren().addAll(lblArticulo,txtArticulo);
        contArti.setSpacing(20);
        contArti.setAlignment(Pos.CENTER);
        Button buscar=new Button("Buscar");
        Button retroceder=new Button("Regresar");
        
        content.getChildren().addAll(lblAsignacion,contArti,buscar);
        content.setSpacing(40);
        content.setAlignment(Pos.CENTER);
        search.setCenter(content);
        retroceder.setAlignment(Pos.BOTTOM_LEFT);
        search.setBottom(retroceder);
        scene.setRoot(search);
        
        retroceder.setOnAction((ActionEvent event) -> {
            scene.setRoot(viewGerente);
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
        scene.setRoot(search);
        
        retroceder.setOnAction((ActionEvent event) -> {
            scene.setRoot(viewGerente);
        });
        
    }
}
