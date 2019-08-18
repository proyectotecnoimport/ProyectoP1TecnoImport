/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Dario Triviño
 */
public class VistaTecnoImport {
    
    protected Scene scene;
    protected VBox menu = new VBox();
    protected int alturaVentana;
    protected int anchoVentana;
    protected String tituloVentana;
    protected String iconoEmpresa;
    
    public VistaTecnoImport(int alturaVentana, int anchoVentana, String tituloVentana){
        this.alturaVentana=alturaVentana;
        this.anchoVentana=anchoVentana;
        this.tituloVentana=tituloVentana;
        crearLogin();
    }
    
     public Scene getScene() {
        return scene;
    }
    
    public void crearLogin(){
        menu=new VBox();
        scene=new Scene(menu,alturaVentana,anchoVentana);
        
        Label titulo=new Label(tituloVentana);
        
        HBox contenedorUsuario=new HBox();
        Label lblUsuario=new Label("Usuario");
        TextField txtUsuario=new TextField();
        
        HBox contenedorContraseña=new HBox();
        Label lblContraseña=new Label("Contraseña");
        TextField txtContraseña=new TextField();
        
        Button iniciarSesion=new Button("Iniciar Sesion");
        
        contenedorUsuario.getChildren().addAll(lblUsuario,txtUsuario);
        contenedorContraseña.getChildren().addAll(lblContraseña,txtContraseña);
        
        contenedorUsuario.setAlignment(Pos.CENTER);
        contenedorUsuario.setSpacing(30);
        contenedorContraseña.setAlignment(Pos.CENTER);
        contenedorContraseña.setSpacing(10);
        menu.getChildren().addAll(titulo,contenedorUsuario,contenedorContraseña,iniciarSesion);
        menu.setAlignment(Pos.CENTER);
        menu.setSpacing(30);
        
        
    }
    
}
