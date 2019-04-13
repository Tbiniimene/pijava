/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Service.AnnonceDao;
import Entity.Annonce;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;




/**
 *
 * @author wiemhjiri
 */
public class ListData {

   
     /**
     * The data as an observable list of Persons.
     */
 private ObservableList<Annonce> annonce=FXCollections.observableArrayList();

    public ListData() {
        
        AnnonceDao pdao= AnnonceDao.getInstance();
         annonce= pdao.displayAll();
        System.out.println(annonce);
    }
    
    public ObservableList<Annonce> getAnnonce(){
        return annonce;
    }
   
}


