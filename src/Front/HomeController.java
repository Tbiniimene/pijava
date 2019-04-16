/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import GUI.AdminController;
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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author poste
 */
public class HomeController implements Initializable {

    @FXML
    private Button homebtn;
    @FXML
    private Button productbtn;
    @FXML
    private Button materialbtn;
    @FXML
    private Button eventbtn;
    @FXML
    private Button fotmingbtn;
    @FXML
    private Button blogbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void homebtn(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Home.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent p1 =Loader.getRoot();
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene ss =new Scene(p1);
            window.setScene(ss);
            window.show();
    }

    @FXML
    private void productbtn(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Product.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent p1 =Loader.getRoot();
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene ss =new Scene(p1);
            window.setScene(ss);
            window.show();
    }

    @FXML
    private void materialbtn(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Material.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent p1 =Loader.getRoot();
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene ss =new Scene(p1);
            window.setScene(ss);
            window.show();
    }

    @FXML
    private void eventbtn(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Event.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent p1 =Loader.getRoot();
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene ss =new Scene(p1);
            window.setScene(ss);
            window.show();
    }

    @FXML
    private void fotmingbtn(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Forming.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent p1 =Loader.getRoot();
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene ss =new Scene(p1);
            window.setScene(ss);
            window.show();
    }

    @FXML
    private void blogbtn(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Blog.fxml"));
        try {
            Loader.load();
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent p1 =Loader.getRoot();
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene ss =new Scene(p1);
            window.setScene(ss);
            window.show();
    }
    
}
