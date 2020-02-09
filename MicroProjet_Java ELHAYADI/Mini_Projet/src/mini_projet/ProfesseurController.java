/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.d.une.ecole.primaire;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ELHAYADI
 */
public class ProfesseurController implements Initializable {

    @FXML
    private ImageView male;
    @FXML
    private ImageView btn_info;
    @FXML
    private ImageView btn_note;
    @FXML
    private ImageView Close;
    @FXML
    private ImageView logout;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gohome(MouseEvent event) {
       
    }

    @FXML
    private void goinfo(MouseEvent event) {
    }

    @FXML
    private void gonote(MouseEvent event) {
    }

    @FXML
    private void close(MouseEvent event) {
    }

    
}
