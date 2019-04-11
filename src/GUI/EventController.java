/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.Event;
import Service.EventService;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author poste
 */
public class EventController implements Initializable {

    @FXML
    private Button EventBtn;
    @FXML
    private Button AdminBtn;
    @FXML
    private Button FormingBtn;
    @FXML
    private Button DeliveryBtn;
    @FXML
    private Button ProductBtn;
    @FXML
    private Button MaterialBtn;
    @FXML
    private Button AmiraBtn;
    @FXML
    private TableView<?> table;
    @FXML
    private TableColumn<?, ?> id_evenement;
    @FXML
    private TableColumn<?, ?> nom;
    @FXML
    private TableColumn<?, ?> date_deb;
    @FXML
    private TableColumn<?, ?> date_fin;
    @FXML
    private TableColumn<?, ?> description;
    @FXML
    private TableColumn<?, ?> nb_stand;
    @FXML
    private TableColumn<?, ?> addresse;
    @FXML
    private TableColumn<?, ?> img;
    @FXML
    private Button id;

    /**
     * Initializes the controller class.
     */
    @Override
     public void initialize(URL url, ResourceBundle rb) {
    /*    id_evenement.setCellValueFactory(new PropertyValueFactory<Event,String>("id_evenement"));
        nom.setCellValueFactory(new PropertyValueFactory<Event,String>("nom"));
        img.setCellValueFactory(new PropertyValueFactory<Event,String>("img"));
        date_deb.setCellValueFactory(new PropertyValueFactory<Event,String>("date_deb"));
        date_fin.setCellValueFactory(new PropertyValueFactory<Event,String>("date_fin"));
        addresse.setCellValueFactory(new PropertyValueFactory<Event,String>("addresse"));
        description.setCellValueFactory(new PropertyValueFactory<Event,String>("description"));
        nb_stand.setCellValueFactory(new PropertyValueFactory<Event,String>("nb_stand"));
       
        
        DropShadow shadow=new DropShadow();
        but2.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{but2.setEffect(shadow);});
        but2.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->{but2.setEffect(null);});
        but3.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{but3.setEffect(shadow);});
        but3.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->{but3.setEffect(null);});
*/
    }

    @FXML
    private void EventScreen(ActionEvent event) {
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
    private void AdminScreen(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Admin.fxml"));
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
    private void FormingScreen(ActionEvent event) {
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
    private void DeliveryScreen(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Delivery.fxml"));
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
    private void ProductScreen(ActionEvent event) {
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
    private void MaterialScreen(ActionEvent event) {
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
    private void AmiraScreen(ActionEvent event) {
        FXMLLoader Loader = new FXMLLoader();
        Loader.setLocation(getClass().getResource("Amira.fxml"));
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
    private void addEvent(ActionEvent event) {
        
        
    }
    
}
