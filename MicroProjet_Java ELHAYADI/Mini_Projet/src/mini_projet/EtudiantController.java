/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author ELHAYADI
 */
public class EtudiantController implements Initializable {

    @FXML
    private AnchorPane Note;
    @FXML
    private AnchorPane info;
    @FXML
    private ImageView male;
    @FXML
    private ImageView Female;
    @FXML
    private ImageView btn_info;
    @FXML
    private ImageView btn_note;
    @FXML
    private ImageView Close;
    @FXML
    private AnchorPane Home;
    @FXML
    private ImageView logout;
    @FXML
    private TextField cneetd;
    @FXML
    private TextField netd;
    @FXML
    private TextField aetd;
    @FXML
    private TextField petd;
    @FXML
    private TextField ntut;
    @FXML
    private TextField ptut;
    @FXML
    private TextField ctut;
    @FXML
    private TextField protut;
    @FXML
    private TextField rtut;
    @FXML
    private TextField nivetd;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cneetd.setText("K148007836");
        aetd.setText("14");
        ntut.setText("ELHAYADI");
        ptut.setText("Mohammed");
        ctut.setText("0656358424");
        rtut.setText("Père");
        protut.setText("Fonctionnaire");
        petd.setText("Brahim");
        netd.setText("DEBBAGH");
        nivetd.setText("6ème");
    }    

    @FXML
    private void gohome(MouseEvent event) {
        Home.toFront();
    }

    @FXML
    private void goinfo(MouseEvent event) {
        info.toFront();
    }

    @FXML
    private void gonote(MouseEvent event) {
        Note.toFront();
    }

    @FXML
    private void close(MouseEvent event) {
        System.exit(0);
    }

  
}
