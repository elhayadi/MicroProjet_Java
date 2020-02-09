/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ELHAYADI
 */
public class InscriptionController implements Initializable {

    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField niveau;
    @FXML
    private TextField tnom;
    @FXML
    private TextField tprenom;
    @FXML
    private TextField t_tel;
    @FXML
    private TextField t_profession;
    @FXML
    private TextField age;
    @FXML
    private TextField relation;
    @FXML
    private Button signin;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void opennewcop(ActionEvent event) throws IOException {
          Etudiant e=new Etudiant();
      e.ajouter(nom.getText(), prenom.getText(), Integer.parseInt(age.getText()) , niveau.getText(), tnom.getText(), tprenom.getText(), Integer.parseInt(t_tel.getText()), t_profession.getText(), relation.getText());
          ViewLauncher.forward(event, "Etudiant.fxml", this.getClass());
    }
    
}
