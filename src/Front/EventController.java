/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import Entity.Event;
import GUI.AdminController;
import Service.EventService;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author poste
 */
public class EventController implements Initializable {

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
    private ComboBox<String> cb1;
    @FXML
    private Label lname;
    @FXML
    private Label ldes;
    @FXML
    private Label ladd;
    @FXML
    private Label ldates;
    @FXML
    private Label ldatee;
      @FXML
    private ListView<Event> listview;
    
     EventService eventsServ = new EventService();
    ObservableList<Event> events = FXCollections.observableArrayList();

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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

//    private void okbtn(ActionEvent event) {
//        int index=cb1.getSelectionModel().getSelectedIndex();
//        EventService e= new EventService();
//        ArrayList<Event> tt = e.showEvent();
//        ObservableList ob = FXCollections.observableArrayList(tt);
//        lname.setText(tt.getnom());
//        /*Event s = new Event(evv.get(index));
//        lname.setText(s.getNom());*/
//        
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
