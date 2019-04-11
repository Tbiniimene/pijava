/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DB.Connexion;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author poste
 */
public class RegisterController implements Initializable {

    @FXML
    private Button OK;
    @FXML
    private Button Back;
    @FXML
    private TextField cin;
    @FXML
    private TextField name;
    @FXML
    private TextField mail;
    @FXML
    private PasswordField pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoginScreen(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Login.fxml"));
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
    private void okbtn(ActionEvent event) {
        Connection c = Connexion.getInstance().getCnx();
        
        try {
            String cin = this.cin.getText();
            String username = this.name.getText();
            String email = this.mail.getText();
            String password = this.pass.getText();
            
            Statement pt = c.createStatement();
            int s = pt.executeUpdate("isert into users (cin,username,email,password)" + " values ('"+cin+"','"+username+"','"+email+"','"+password+"')");
            
            if ( s > 0 ){
                System.out.println("user registred");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
}
