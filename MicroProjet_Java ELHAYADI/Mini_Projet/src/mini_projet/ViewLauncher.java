/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


/**
 *
 * @author pc&
 */
public class ViewLauncher extends Application {
    
   
    
    public static void forward(ActionEvent actionEvent,String pageName,Class myClass ) throws IOException {
        Parent chefEmpDEp_page_parent = FXMLLoader.load(myClass.getResource(pageName));
        Scene chefEmpDEp_page_scene = new Scene(chefEmpDEp_page_parent);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(chefEmpDEp_page_scene);
        app_stage.show();
    }
    
    /**6
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    static void forward(MouseEvent event, String loginfxml, Class<? extends FXMLDocumentController> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
