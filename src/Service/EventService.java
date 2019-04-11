/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Event;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import DB.Connexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author poste
 */
public class EventService {    
    Connection c= Connexion.getInstance().getCnx();
    
    
    /***********************************Add**************************************/
 
    public void ajouterReclamation1(Event e){

        try {
            Statement st= c.createStatement();
            
            String req = "INSERT INTO reclamation (objet,description,id_prestt,ref_img) VALUES ( ?,?,?,?)";
            
            PreparedStatement ps = c.prepareStatement(req);

            ps.setDate(1, (Date) e.getDate_deb());
            ps.setDate(2, (Date) e.getDate_fin());
            ps.setString(3, e.getNom());
            ps.setString(4, e.getImg());
            ps.setString(5, e.getAddresse());
            ps.setString(6, e.getDescription());
            ps.setInt(7, e.getNb_stand());
            
            System.out.println(ps);
            ps.executeUpdate();
            System.out.println("Ajout effectué avec succès"); 
                      
        } catch (SQLException ex) {
            Logger.getLogger(EventService.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
  
}
