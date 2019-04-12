/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Objects;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author wiemhjiri
 */
public class Annonce {
    
    private SimpleIntegerProperty id_Annonce;
    private SimpleStringProperty nom;
    private SimpleStringProperty date;
    private SimpleStringProperty description;
    private SimpleStringProperty titre;
    private SimpleStringProperty nom_image;
    

    public Annonce() {
    }

   
public Annonce( String nom, String date, String description, String titre, String nom_image) {
        
        this.nom = new SimpleStringProperty(nom);
        this.date = new SimpleStringProperty(date);
        this.description = new SimpleStringProperty(description);
        this.titre = new SimpleStringProperty(titre);
        this.nom_image = new SimpleStringProperty(nom_image);
    }
 public Annonce(int id_Annonce, String nom, String date, String description, String titre, String nom_image) {
         this.id_Annonce=new SimpleIntegerProperty(id_Annonce);
        this.nom = new SimpleStringProperty(nom);
        this.date = new SimpleStringProperty(date);
        this.description = new SimpleStringProperty(description);
        this.titre = new SimpleStringProperty(titre);
        this.nom_image = new SimpleStringProperty(nom_image);
       
      
    }
  public int getId_Annonce() {
        return id_Annonce.get();
    }
  //  public SimpleIntegerProperty getId_Annonce() {
  //      return id_Annonce;
  //  }

          
    
    public void setId_Annonce(int id_Annonce) {
         this.id_Annonce = new SimpleIntegerProperty(id_Annonce);
    }

    public SimpleStringProperty getNomProperty() {
        return nom;
    }

    public void setNom(String nom) {
       this.nom= new SimpleStringProperty(nom);
    }
 public String getNom() {
        return nom.get();
    }
    
    public SimpleStringProperty getDateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date= new SimpleStringProperty(date);
    }
 public String getDate() {
        return date.get();
    }
    
    public SimpleStringProperty getDescriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
       this.description= new SimpleStringProperty(description);
    }
 public String getDescription() {
        return description.get();
    }
    
    public SimpleStringProperty getTitreProperty() {
        return titre;
    }

    public void setTitre(String titre) {
       this.titre = new SimpleStringProperty(titre);
    }
 public String getTitre() {
        return titre.get();
    }
    
    public SimpleStringProperty getNom_ImageProperty() {
        return nom_image;
    }

    public void setNom_Image(String nom_image) {
        this.nom_image = new SimpleStringProperty(nom_image);
    }

     public String getNom_Image() {
        return nom_image.get();
    }
    
   
    
    
}
