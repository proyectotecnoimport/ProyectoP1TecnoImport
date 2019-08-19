/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlSistema;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Dario Triviño
 */
public class VistaTecnoImport {
    
    protected Scene scene;
    protected BorderPane menu = new BorderPane();
    protected int alturaVentana;
    protected int anchoVentana;
    protected String tituloVentana;
    protected String iconoEmpresa;
    
    public VistaTecnoImport(int alturaVentana, int anchoVentana, String tituloVentana){
        scene=new Scene(menu,alturaVentana,anchoVentana);
        this.alturaVentana=alturaVentana;
        this.anchoVentana=anchoVentana;
        this.tituloVentana=tituloVentana;
        crearLogin();
    }
    
     public Scene getScene() {
        return scene;
    }
    
    public void crearLogin(){
        
        
        VBox pantalla=new VBox();
        Label titulo=new Label(tituloVentana);
        titulo.setTextFill(Color.BLACK);
        titulo.setFont(new Font("Arial Black", 20));
                
        HBox contenedorUsuario=new HBox();
        Label lblUsuario=new Label("Usuario");
        TextField txtUsuario=new TextField();
        lblUsuario.setTextFill(Color.BLACK);
        lblUsuario.setFont(new Font("Arial Black", 14));
        
        HBox contenedorContraseña=new HBox();
        Label lblContraseña=new Label("Contraseña");
        PasswordField txtContraseña=new PasswordField();
        lblContraseña.setTextFill(Color.BLACK);
        lblContraseña.setFont(new Font("Arial Black", 14));
        
        Button iniciarSesion=new Button("Iniciar Sesion");
        iniciarSesion.setTextFill(Color.GREEN);
        iniciarSesion.setFont(new Font("Arial Rounded MT Bold", 15));
        
        txtUsuario.setPromptText("Ingrese su usuario");
        txtContraseña.setPromptText("Ingrese su contraseña");
        
        contenedorUsuario.getChildren().addAll(lblUsuario,txtUsuario);
        contenedorContraseña.getChildren().addAll(lblContraseña,txtContraseña);
        
        contenedorUsuario.setAlignment(Pos.CENTER);
        contenedorUsuario.setSpacing(30);
        
        contenedorContraseña.setAlignment(Pos.CENTER);
        contenedorContraseña.setSpacing(10);
        
        scene.setRoot(pantalla);
        
        pantalla.getChildren().addAll(titulo,contenedorUsuario,contenedorContraseña,iniciarSesion);
        pantalla.setAlignment(Pos.CENTER);
        pantalla.setSpacing(30);
        pantalla.setStyle( "-fx-background-image:url(\"/Imagenes/fondo.png\");"+
                       "-fx-background-repeat: stretch;"+ 
                       "-fx-background-position: center center;");
        iniciarSesion.setOnAction(e->CtrlSistema.IngresarAlSistema(txtUsuario.getText(),txtContraseña.getText()));
        
    }
    
    public void crearEscena(){
        
    }
    
    
}
