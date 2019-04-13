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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author poste
 */
public class AmiraController implements Initializable {

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
    private TableView<Annonce> annonceTable;
    @FXML
    private TableColumn<Annonce, String> nom_col;
    @FXML
    private TableColumn<Annonce, String> date_col;
    @FXML
    private TableColumn<Annonce, String> descrip_col;
    @FXML
    private TableColumn<Annonce, String> titre_col;
    @FXML
    private TableColumn<Annonce, String> image_col;
    @FXML
    private TextField tnom;
    @FXML
    private TextField tdate;
    @FXML
    private TextField tdescrip;
    @FXML
    private TextField tit;
    @FXML
    private TextField timage;
    @FXML
    private Button update;
    @FXML
    private Button delete;
    @FXML
    private Button addt;
  private ListData listdata = new ListData();
  private int i,a;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
         // TODO
         annonceTable.setItems(listdata.getAnnonce()); 
          nom_col.setCellValueFactory(cell -> cell.
                getValue().getNomProperty());
            date_col.setCellValueFactory(cell -> cell.
                getValue().getDateProperty());
          descrip_col.setCellValueFactory(cell -> cell.
                getValue().getDescriptionProperty());
            
          titre_col.setCellValueFactory(cell -> cell.
                getValue().getTitreProperty());
          image_col.setCellValueFactory(cell -> cell.
                getValue().getNom_ImageProperty());
        
          
      annonceTable.getSelectionModel().selectedItemProperty().
              addListener((v, oldValue, newValue) -> {
                  i= newValue.getId_Annonce();
                tnom.setText(newValue.getNom());
               tdate.setText(newValue.getDate());
                tdescrip.setText(newValue.getDescription());
               tit.setText(newValue.getTitre());
               timage.setText(newValue.getNom_Image());
                
                //update
               update.setOnAction(e -> {
                
           if ((tnom.getText().isEmpty())
           && (tdate.getText().isEmpty())
           && (tdescrip.getText().isEmpty())&&
           (tit.getText().isEmpty()) 
           && (timage.getText().isEmpty()))
         
                   
                   {
                      Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Les champs sont vide");
                alert.show();
                   }
   else if ((tnom.getText().matches("^[a-zA-Z]+$"))&&
                     (tdate.getText().matches("^[a-zA-Z]+$"))&&
                  (tdescrip.getText().matches("^[a-zA-Z]+$"))&&
                  (tit.getText().matches("^[a-zA-Z]+$"))&&
                 (timage.getText().matches("^[0-9]+$"))
                 //(date_s.getText().matches(Date))&&
                 //(date_r.getText().matches(Date))// 
 ) {   
                          
        
         Annonce s = new Annonce(i,
                           tnom.getText(),
                           tdate.getText(),
                           tdescrip.getText(),
                           tit.getText(),
                           timage.getText()  );
         
         AnnonceDao S=new AnnonceDao.getInstance();
         S.update(s);
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("La categorie a été modifié");
                alert.show();
              tnom.setText("");
        tdate.setText("");
        tdescrip.setText("");
         tit.setText("");
        timage.setText("");
        
       // tdate_s.setValue(null);
       // tdate_r.setValue(null);
     }
           
           else {
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("Erreur");
                alert.show();
               
          }
         
        });
                    });
        //delete 
        
             delete.setOnAction(e ->{
             
                           
         
               Annonce s = new Annonce(i,
                           tnom.getText(),
                           tdate.getText(),
                           tdescrip.getText(),
                       tit.getText(),
                           timage.getText()
                          ); 
               
                       
         AnnonceDao S=new AnnonceDao.getInstance();
               S.delete(s); 
        
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText("La categorie a été supprimée");
                alert.show();
                tnom.setText("");
        tdate.setText("");
        tdescrip.setText("");
         tit.setText("");
        timage.setText("");
       
       // tdate_s.setValue(null);
       // tdate_r.setValue(null);
                 
    });
      
      
    addt.setOnAction((ActionEvent event) -> {
            try  { 
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass()
                        .getResource("/GUI/AjoutAnnonce.fxml"));
                Parent page2 = loader.load();
                
              AjoutAnnonceController controller =loader.getController();
               // controller.setListData(new ListData());
                Scene scene = new Scene(page2);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AjoutAnnonceController.class.getName()).log(Level.SEVERE, null, ex);
            }
       });
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
    private void insertAction (ActionEvent event) {
        
         try {
                System.out.println("testttttttttttttt");
                Parent pagePieChart=FXMLLoader.load(getClass().getResource("/GUI/AjoutAnnonce.fxml"));
                Scene scene=new Scene(pagePieChart);
                Stage stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(AjoutAnnonceController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
}
