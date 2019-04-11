/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author poste
 */
public class Event {
    
    private int id_evenement ;

    private String nom;
    private String img;
    private String addresse;
    private String description;
    private int nb_stand;
    
    private Date date_deb;
    private Date date_fin;
    
    
    public Event(){
    }
    
    public Event(int id_evenement,String nom,String img,String addresse,String description,int nb_stand,Date date_deb,Date date_fin){
    this.id_evenement = id_evenement;
    this.nom = nom;
    this.img = img;
    this.addresse = addresse;
    this.description = description;
    this.nb_stand = nb_stand;
    this.date_deb = date_deb;
    this.date_fin = date_fin;
    }

    public int getId_evenement() {
        return id_evenement;
    }

    public void setId_evenement(int id_evenement) {
        this.id_evenement = id_evenement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNb_stand() {
        return nb_stand;
    }

    public void setNb_stand(int nb_stand) {
        this.nb_stand = nb_stand;
    }


    public Date getDate_deb() {
        return date_deb;
    }

    public void setDate_deb(Date date_deb) {
        this.date_deb = date_deb;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return "Event{" + "id_evenement=" + id_evenement + ", nom=" + nom + ", img=" + img + ", addresse=" + addresse + ", description=" + description + ", nb_stand=" + nb_stand + ", date_deb=" + date_deb + ", date_fin=" + date_fin + '}';
    }
    
    
}