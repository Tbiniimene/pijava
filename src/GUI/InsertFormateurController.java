/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.Formateur;
import Service.FormateurDao;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Imene
 */
public class InsertFormateurController implements Initializable {

    @FXML
    private TextField NomTextField;
    @FXML
    private TextField PrenomTextField;
    @FXML
    private TextField TypeTextField;
    @FXML
    private TextField TelTextField;
    @FXML
    private Button InserButton;
    int tel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void InsertAction(ActionEvent event) {
          tel=Integer.parseInt(TelTextField.getText());
            
            Formateur p = new Formateur(NomTextField.getText(), PrenomTextField.getText(),TypeTextField.getText(), tel);
            FormateurDao pdao = FormateurDao.getInstance();
            pdao.insert(p);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Personne insérée avec succés!");
        alert.show();
        
        
           FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Forming.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(view.InsertFormateurController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent p1 =Loader.getRoot();
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene ss =new Scene(p1);
            window.setScene(ss);
            window.show();
    
    }
    
    
}
