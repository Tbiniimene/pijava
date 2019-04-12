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
public class Formateur {
    
    private SimpleIntegerProperty id_formateur ;
    private SimpleStringProperty nom;
    private SimpleStringProperty prenom;
    private SimpleStringProperty type;
   // private SimpleStringProperty etat;
    private SimpleIntegerProperty tel;

    public Formateur() {
    }
  public Formateur( String nom, String prenom, String type, int tel) {
        //this.id_formateur = id_formateur;
       //this.id_formateur=new SimpleIntegerProperty(id_formateur);
        this.nom = new SimpleStringProperty(nom);
        //this.nom = nom;
       this.prenom = new SimpleStringProperty(prenom);
         this.type = new SimpleStringProperty(type);
        //this.etat = etat;
       this.tel = new SimpleIntegerProperty(tel);
    }
  public Formateur(int id_formateur, String nom, String prenom, String type, int tel) {
        //this.id_formateur = id_formateur;
       this.id_formateur=new SimpleIntegerProperty(id_formateur);
        this.nom = new SimpleStringProperty(nom);
        //this.nom = nom;
       this.prenom = new SimpleStringProperty(prenom);
         this.type = new SimpleStringProperty(type);
        //this.etat = etat;
       this.tel = new SimpleIntegerProperty(tel);
    }
    public int getId_formateur() {
        return id_formateur.get();
    }
 public SimpleStringProperty getNomProperty(){
        return nom;
    }
    public SimpleStringProperty getPrenomProperty(){
        return prenom;
    }
   public String getNom() {
        return nom.get();
    }

     public String getPrenom() {
        return prenom.get();
    }
     public SimpleStringProperty getTypeProperty(){
        return type;
    }
     public SimpleIntegerProperty getTelProperty(){
        return tel;
    }
 public String getType() {
        return type.get();
    }
  

    public int getTel() {
        return tel.get();
    }
  
    
    public void setId_formateur(int id_formateur) {
        //this.id_formateur = id_formateur;
          this.id_formateur = new SimpleIntegerProperty(id_formateur);
          
    }
    public void setTel(int tel) {
        //this.id_formateur = id_formateur;
          this.tel = new SimpleIntegerProperty(tel);
          
    }

    public void setNom(String nom) {
        this.nom = new SimpleStringProperty(nom);
    }

    public void setPrenom(String prenom) {
        this.prenom = new SimpleStringProperty(prenom);
    }
  
 public void setType(String type) {
        this.type = new SimpleStringProperty(type);
    }
 

    @Override
    public String toString() {
        return "Formateur{" + "id_formateur=" + id_formateur + ", nom=" + nom + ", prenom=" + prenom + ", type=" + type +  ", tel=" + tel + '}';
    }

  

   
    
}
