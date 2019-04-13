/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.Annonce;
import Service.AnnonceDao;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SaadAmira
 */
public class AjoutAnnonceController implements Initializable {

    @FXML
    private TextField tdate;
    @FXML
    private TextField tdescrip;
    @FXML
    private TextField timage;
    @FXML
    private TextField tit;
    @FXML
    private Button add;
    @FXML
    private TextField tnom;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
         @FXML
    void insertAction(ActionEvent event) throws IOException, SQLException {

        AnnonceDao a = new AnnonceDao();
        Annonce S = new Annonce();

        S.setNom(tnom.getText());
        S.setDate(tdate.getText());
        
        S.setDescription(tdescrip.getText());
        S.setTitre(tit.getText());

       S.setNom_Image(timage.getText());
      
       a.insert(S);
        
        JOptionPane.showMessageDialog(null, " Votre demande est envoyée ");

        tnom.setText("");
        tdate.setText("");
        tdescrip.setText("");
        tit.setText("");
        timage.setText("");
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

