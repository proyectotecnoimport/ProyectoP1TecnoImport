/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Vista.VistaTecnoImport;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Dario Triviño
 */
public class TecnoImporrt extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VistaTecnoImport vista=new VistaTecnoImport(500,400,"TecnoImport S.A.");
        primaryStage.setScene(vista.getScene());
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("Imagenes/icono.png"));
        primaryStage.show();
    }
    
}
