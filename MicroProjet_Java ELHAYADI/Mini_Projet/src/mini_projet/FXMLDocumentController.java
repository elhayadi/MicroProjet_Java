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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import static javafx.scene.input.KeyCode.X;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author ELHAYADI
 */
public class FXMLDocumentController implements Initializable {
    
  
    @FXML
    private RadioButton prof;
    private CheckBox etu1;
    private CheckBox prof1;
    @FXML
    private TextField id_login;
    @FXML
    private PasswordField pass_login;
    @FXML
    private RadioButton etud;
    @FXML
    private ToggleGroup g;
    @FXML
    private Label error_login;
    @FXML
    private Button bLogin;
    private TextField id_signin;
    @FXML
    private TextField pass2;
    @FXML
    private Button bSignin;
    @FXML
    private PasswordField pass1;
    @FXML
    private TextField cne;
    @FXML
    private Label error_signin;
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
    @FXML
    private AnchorPane panel2;
    @FXML
    private AnchorPane panel1;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void closelogin(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void Signin(ActionEvent e) throws IOException {
        
        Etudiant e2=new Etudiant(); 
        switch (e2.checkcompte(cne.getText(),pass1.getText(),pass2.getText())) {
            case 1:
                panel2.toFront();
                break;
            case 0:
                error_signin.setText("Mot de passe non identique!");
                break;
            default:
                error_signin.setText("Etudiant non trouver!!");
                break;
        }
        
    }

    @FXML
    private void login(ActionEvent event) throws IOException {
        
        if(etud.isSelected()){
            Etudiant e=new Etudiant();
            if(e.login(id_login.getText(), pass_login.getText()) == 1){
                ViewLauncher.forward(event, "Etudiant.fxml", this.getClass());
            }else error_login.setText("Votre identifiant ou mot de passe n'est pas correcte!");
        }else if(prof.isSelected()){
                Prof p=new Prof();
                }
        
    }

    @FXML
    private void opennewcop(ActionEvent event) throws IOException {
          Etudiant e=new Etudiant();
      e.ajouter(nom.getText(), prenom.getText(), Integer.parseInt(age.getText()) , niveau.getText(), tnom.getText(), tprenom.getText(), Integer.parseInt(t_tel.getText()), t_profession.getText(), relation.getText());
          ViewLauncher.forward(event, "Etudiant.fxml", this.getClass());
    }


    
}
