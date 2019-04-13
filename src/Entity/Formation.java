/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author wiemhjiri
 */
public class Formation {
    
    private SimpleIntegerProperty id_formation ;
    private SimpleIntegerProperty formateur_id;

    private SimpleStringProperty nom;
    private SimpleStringProperty type;
    private SimpleStringProperty description;
    private SimpleStringProperty image;
    private SimpleStringProperty address;
    
    private SimpleIntegerProperty prix;
    private SimpleIntegerProperty nbmax;
    
    private Date date_deb;
    private Date date_fin;

    public Formation() {
    }

    public Formation(SimpleIntegerProperty id_formation, SimpleIntegerProperty formateur_id, SimpleStringProperty nom, SimpleStringProperty type, SimpleStringProperty description, SimpleStringProperty image, SimpleStringProperty address, SimpleIntegerProperty prix, SimpleIntegerProperty nbmax, Date date_deb, Date date_fin) {
        this.id_formation = id_formation;
        this.formateur_id = formateur_id;
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.image = image;
        this.address = address;
        this.prix = prix;
        this.nbmax = nbmax;
        this.date_deb = date_deb;
        this.date_fin = date_fin;
    }
      public Formation(SimpleIntegerProperty formateur_id, SimpleStringProperty nom, SimpleStringProperty type, SimpleStringProperty description, SimpleStringProperty image, SimpleStringProperty address, SimpleIntegerProperty prix, SimpleIntegerProperty nbmax, Date date_deb, Date date_fin) {
        //this.id_formation = id_formation;
        this.formateur_id = formateur_id;
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.image = image;
        this.address = address;
        this.prix = prix;
        this.nbmax = nbmax;
        this.date_deb = date_deb;
        this.date_fin = date_fin;
    }
       public Formation( String nom, String type, String description, String image, String address, int prix, int nbmax, Date date_deb, Date date_fin ) {
        //this.id_formation = id_formation;
       // this.formateur_id = new SimpleIntegerProperty(formateur_id);
        this.nom = new SimpleStringProperty(nom);
        this.type = new SimpleStringProperty(type) ;
        this.description =new SimpleStringProperty(description);
        this.image = new SimpleStringProperty(image);
        this.address = new SimpleStringProperty(address);
        this.prix =new SimpleIntegerProperty(prix) ;
        this.nbmax =new SimpleIntegerProperty(nbmax) ;
       this.date_deb = date_deb;
       this.date_fin = date_fin;
    }
  public int getId_formation() {
        return id_formation.get();
    }
    public SimpleIntegerProperty getId_formationProperty() {
        return id_formation;
    }
 public int getFormateur_id() {
        return id_formation.get();
    }
 
    public SimpleIntegerProperty getFormateur_idProperty() {
        return formateur_id;
    }

    public SimpleStringProperty getNomProperty() {
        return nom;
    }
   public String getNom() {
        return nom.get();
    }
    public SimpleStringProperty getTypeProperty() {
        return type;
    }
  public String getType() {
        return type.get();
    }
    public SimpleStringProperty getDescriptionProperty() {
        return description;
    }
  public String getDescription() {
        return description.get();
    }
    public SimpleStringProperty getImageProperty() {
        return image;
    }
 public String getImage() {
        return image.get();
    }
    public SimpleStringProperty getAddressProperty() {
        return address;
    }
 public String getAddress() {
        return address.get();
    }
    public SimpleIntegerProperty getPrixProperty() {
        return prix;
    }
        public int getPrix() {
        return prix.get();
    }
 
    public SimpleIntegerProperty getNbmaxProperty() {
        return nbmax;
    }
     public int getNbmax() {
        return nbmax.get();
    }
    public Date getDate_deb() {
        return date_deb;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setId_formationProperty(SimpleIntegerProperty id_formation) {
        this.id_formation = id_formation;
    }

    public void setFormateur_idProperty(SimpleIntegerProperty formateur_id) {
        this.formateur_id = formateur_id;
    }

    public void setNomProperty(SimpleStringProperty nom) {
        this.nom = nom;
    }

    public void setTypeProperty(SimpleStringProperty type) {
        this.type = type;
    }

    public void setDescriptionProperty(SimpleStringProperty description) {
        this.description = description;
    }

    public void setImageProperty(SimpleStringProperty image) {
        this.image = image;
    }

    public void setAddressProperty(SimpleStringProperty address) {
        this.address = address;
    }

    public void setPrixProperty(SimpleIntegerProperty prix) {
        this.prix = prix;
    }

    public void setNbmaxProperty(SimpleIntegerProperty nbmax) {
        this.nbmax = nbmax;
    }

    public void setDate_debProperty(Date date_deb) {
        this.date_deb = date_deb;
    }

    public void setDate_finProperty(Date date_fin) {
        this.date_fin = date_fin;
    }
    
     public void setId_formation(int id_formation) {
        this.id_formation = new SimpleIntegerProperty(id_formation); 
    }

    public void setFormateur_id(int formateur_id) {
        this.formateur_id = new SimpleIntegerProperty(formateur_id);
    }

    public void setNom(String nom) {
        this.nom = new SimpleStringProperty(nom);
    }

    public void setType(String type) {
        this.type = new SimpleStringProperty(type);
    }

    public void setDescription(String description) {
        this.description = new SimpleStringProperty(description);
    }

    public void setImage(String image) {
        this.image =new SimpleStringProperty(image) ;
    }

    public void setAddress(String address) {
        this.address = new SimpleStringProperty(address);
    }

    public void setPrix(int prix) {
        this.prix = new SimpleIntegerProperty(prix);
    }

    public void setNbmax(int nbmax) {
        this.nbmax = new SimpleIntegerProperty(nbmax);
    }

    public void setDate_deb(Date date_deb) {
        this.date_deb = date_deb;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
    
    @Override
    public String toString() {
        return "Formation{" + "id_formation=" + id_formation + ", formateur_id=" + formateur_id + ", nom=" + nom + ", type=" + type + ", description=" + description + ", image=" + image + ", address=" + address + ", prix=" + prix + ", nbmax=" + nbmax + ", date_deb=" + date_deb + ", date_fin=" + date_fin + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id_formation);
        hash = 97 * hash + Objects.hashCode(this.formateur_id);
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.image);
        hash = 97 * hash + Objects.hashCode(this.address);
        hash = 97 * hash + Objects.hashCode(this.prix);
        hash = 97 * hash + Objects.hashCode(this.nbmax);
        hash = 97 * hash + Objects.hashCode(this.date_deb);
        hash = 97 * hash + Objects.hashCode(this.date_fin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Formation other = (Formation) obj;
        if (!Objects.equals(this.id_formation, other.id_formation)) {
            return false;
        }
        if (!Objects.equals(this.formateur_id, other.formateur_id)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.image, other.image)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.prix, other.prix)) {
            return false;
        }
        if (!Objects.equals(this.nbmax, other.nbmax)) {
            return false;
        }
        if (!Objects.equals(this.date_deb, other.date_deb)) {
            return false;
        }
        if (!Objects.equals(this.date_fin, other.date_fin)) {
            return false;
        }
        return true;
    }


   
    
}
