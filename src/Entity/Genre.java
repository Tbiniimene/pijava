/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author SaadAmira
 */
public class Genre {
    
   private SimpleIntegerProperty id_genre;
    private SimpleStringProperty type;
    private SimpleStringProperty pays;  
    
    public Genre( String type, String pays) {
        
        this.type = new SimpleStringProperty(type);
        this.pays = new SimpleStringProperty(pays);
    }
    public Genre(int id_genre, String type, String pays) {
         this.id_genre=new SimpleIntegerProperty(id_genre);
        this.type = new SimpleStringProperty(type);
        this.pays = new SimpleStringProperty(pays);}

    public Genre() {
    }
        public int getId_genre() {
        return id_genre.get();
    }
  //  public SimpleIntegerProperty getId_Annonce() {
  //      return id_Annonce;
  //  }

          
    
    public void setId_genre(int id_genre) {
         this.id_genre = new SimpleIntegerProperty(id_genre);
    }
     public SimpleStringProperty getTypeProperty() {
        return type;
    }

    public void setType(String type) {
       this.type= new SimpleStringProperty(type);
    }
 public String getType() {
        return type.get();
    }
  public SimpleStringProperty getPaysProperty() {
        return pays;
    }

    public void setPays(String pays) {
       this.pays= new SimpleStringProperty(pays);
    }
 public String getPays() {
        return pays.get();
    }
    
    
    
    
    
    
    
    
    
}
