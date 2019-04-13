/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entity.Formateur;
import Entity.Formation;
import Entity.ListDataFormateur;
import Entity.ListDataformation;
import Service.FormateurDao;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author poste
 */
public class FormingController implements Initializable {

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
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField type;
    @FXML
    private TextField tel;
    @FXML
    private Button update;
    @FXML
    private Button deletebtn;
    @FXML
    private Button isertButton;
    @FXML
    private TableView<Formateur> table;
    @FXML
    private TableColumn<Formateur, String> NomColonne;
    @FXML
    private TableColumn<Formateur, String> PrenomColonne;
    @FXML
    private TableColumn<Formateur, String> typeColonne;
    @FXML
    private TableColumn<Formateur, Integer> telColonne;
    private ListDataFormateur listdata = new ListDataFormateur();
    
      private int numtel;
    private int i,a;
    private String tell;
    @FXML
    private TableView<Formation> tableformation;
    @FXML
    private TableColumn<Formation, String> nameColumn;
    @FXML
    private TableColumn<Formation, Integer> formateurColumn;
    @FXML
    private TableColumn<Formation, String> typeColumn;
    @FXML
    private TableColumn<Formation, Integer> priceColumn;
    @FXML
    private TableColumn<Formation, String> addressColumn;
    @FXML
    private TableColumn<Formation, Date> datedebColumn;
    @FXML
    private TableColumn<Formation, Date> dateendColumn;
    @FXML
    private TableColumn<Formation, Integer> numberColumn;
    @FXML
    private TableColumn<Formation, String> imageColumn;
    @FXML
    private TableColumn<Formation, String> descriptionColumn;
      private ListDataformation listdataformation = new ListDataformation();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
      
        //////////////////////////////////////////////////////////////////////////////:
            table.setItems(listdata.getPersons());
        NomColonne.setCellValueFactory(cell -> cell.
                getValue().getNomProperty());
        PrenomColonne.setCellValueFactory(cell -> cell.
                getValue().getPrenomProperty());
          typeColonne.setCellValueFactory(cell -> cell.
                getValue().getTypeProperty());
            
          telColonne.setCellValueFactory(cell -> cell.
                getValue().getTelProperty().asObject());
         
         
      table.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
                nom.setText(newValue.getNom());
                prenom.setText(newValue.getPrenom());
                type.setText(newValue.getType());
               tel.setText(String.valueOf(newValue.getTel()));
              
                i= newValue.getId_formateur();
        ////////////////////////////////////////////////////////////////////////////////////////////
            //UPDATE////    
                 update.setOnAction(e -> {
            
           
            
      if ((nom.getText().isEmpty()) && (prenom.getText().isEmpty())&& (type.getText().isEmpty())&& (tel.getText().isEmpty()))
                   
              {
                      Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Les champs sont vide");
                alert.show();
                   }
                   
           
           else if ((nom.getText().matches("^[a-zA-Z]+$")) && (prenom.getText().matches("^[a-zA-Z]+$"))&& (type.getText().matches("^[a-zA-Z]+$"))&& (tel.getText().matches("^[0-9]+$")))  {
               
               // Formateur c = new Categorie(i,Nom_id1.getText(),Type_id1.getText());
                numtel=Integer.parseInt(tel.getText());
           System.out.println(numtel);
         Formateur c = new Formateur(i,nom.getText(),prenom.getText(),type.getText(),numtel);
          FormateurDao f = FormateurDao.getInstance();

               f.update(c);
                
               
               
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("La categorie a été modifié");
                alert.show();
                nom.setText("");
                prenom.setText("");
                type.setText("");
                tel.setText("");
               
                
           }
           
           else {
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Erreur");
                alert.show();
               
           }
          FormingScreen(e);
                
        });
                
                
                /////////////////////////////////////////////////////////////////////////////
                //DELETE//
      deletebtn.setOnAction(e ->{
        
          numtel=Integer.parseInt(tel.getText());
           System.out.println(numtel);
         Formateur forma = new Formateur(i,nom.getText(),prenom.getText(),type.getText(),numtel);
                
              //  FormateurDao.delete(c);
             FormateurDao f = FormateurDao.getInstance();
               
             f.delete(forma); 
        
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("La categorie a été supprimée");
                alert.show();
                nom.setText("");
                prenom.setText("");
                type.setText("");
                tel.setText("");
                //table.refresh();
                FormingScreen(e);
           
    });
      
      
       
       
       });
     
         
            tableformation.setItems(listdataformation.getPersons());
        
        nameColumn.setCellValueFactory(cell -> cell.
                getValue().getNomProperty());
        
        formateurColumn.setCellValueFactory(cell -> cell.
                getValue().getFormateur_idProperty().asObject());
        
        typeColumn.setCellValueFactory(cell -> cell.
                getValue().getTypeProperty());
        
        priceColumn.setCellValueFactory(cell -> cell.
                getValue().getPrixProperty().asObject());
        
        addressColumn.setCellValueFactory(cell -> cell.
                getValue().getAddressProperty());  
        
        numberColumn.setCellValueFactory(cell -> cell.
                getValue().getNbmaxProperty().asObject());
        
        imageColumn.setCellValueFactory(cell -> cell.
                getValue().getImageProperty());
        
        descriptionColumn.setCellValueFactory(cell -> cell.
                getValue().getDescriptionProperty());
         
        datedebColumn.setCellValueFactory(new PropertyValueFactory<Formation,Date>("Date_deb"));
        
        dateendColumn.setCellValueFactory(new PropertyValueFactory<Formation,Date>("Date_fin"));

        
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
    private void insertAction(ActionEvent event) {
        
         try {
                System.out.println("testttttttttttttt");
                Parent pagePieChart=FXMLLoader.load(getClass().getResource("/GUI/InsertFormateur.fxml"));
                Scene scene=new Scene(pagePieChart);
                Stage stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(FormingController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

  

    @FXML
    private void InsertFormationAction(ActionEvent event) {
        
        
    }
    
}
