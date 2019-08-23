package principal;

import vista.VistaTecnoImport;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Dario Triviño
 */
public class TecnoImporrt extends Application {
    
   public static Stage primaryStage=new Stage();
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage=this.primaryStage;
        VistaTecnoImport vista=new VistaTecnoImport(500,400,"TecnoImport S.A.");
        primaryStage.setScene(vista.getScene());
        primaryStage.setResizable(false);
        //primaryStage.getIcons().add(new Image("Imagenes/icono.png"));
        primaryStage.show();
    }
    
}
