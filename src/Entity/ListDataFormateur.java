/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Service.FormateurDao;
import Entity.Formateur;
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
public class ListDataFormateur {
    
     /**
     * The data as an observable list of Persons.
     */
    
    private ObservableList<Formateur> persons=FXCollections.observableArrayList();

    public ListDataFormateur() {
        
        FormateurDao pdao=FormateurDao.getInstance();
        persons= pdao.displayAll();
        System.out.println(persons);
    }
    
    public ObservableList<Formateur> getPersons(){
        return persons;
    }
   
}
