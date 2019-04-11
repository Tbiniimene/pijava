/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.FOSUser;
import DB.Connexion;
import GUI.*;
import Entity.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author I.O.I
 */
public class ServiceFOSUser {
    Connection c = Connexion.getInstance().getCnx();
    
    public void ajouterUser(FOSUser u){
        try {
            /*Statement st = c.createStatement();
            String req = "insert into fos_user values("+u.getId()+",'"+u.getUsername()+"','"+u.getUsername_canonical()+"','"+u.getEmail()+"','"
                    +u.getEmail_canonical()+"',"+u.getEnabled()+",'"+u.getSalt()+"','"+u.getPassword()+"',"+u.getLast_login()+",'"
                    +u.getConfirmation_token()+"',"+u.getPassword_requested_at()+",'"+u.getRoles()+"')";
            st.executeUpdate(req);*/
            PreparedStatement pt = c.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pt.setInt(1, u.getId());
            pt.setString(2, u.getUsername());
            pt.setString(3, u.getUsername_canonical());
            pt.setString(4, u.getEmail());
            pt.setString(5, u.getEmail_canonical());
            pt.setByte(6, u.getEnabled());
            pt.setString(7, u.getSalt());
            pt.setString(8, u.getPassword());
            pt.setDate(9, u.getLast_login());
            pt.setString(10, u.getConfirmation_token());
            pt.setDate(11, u.getPassword_requested_at());
            pt.setString(12, u.getRoles());
            pt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFOSUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void modifierUser(FOSUser u){
        try {
            PreparedStatement pt = c.prepareStatement("update user set username = ?, username_canonical = ?, email = ?, email_canonical = ?, enabled = ?, salt = ?, password = ?, last_login = ?, confirmation_token = ?, confirmation_token = ?, roles = ? where id = ?");
            pt.setString(1, u.getUsername());
            pt.setString(2, u.getUsername_canonical());
            pt.setString(3, u.getEmail());
            pt.setString(4, u.getEmail_canonical());
            pt.setByte(5, u.getEnabled());
            pt.setString(6, u.getSalt());
            pt.setString(7, u.getPassword());
            pt.setDate(8, u.getLast_login());
            pt.setString(9, u.getConfirmation_token());
            pt.setDate(10, u.getPassword_requested_at());
            pt.setString(11, u.getRoles());
            pt.setInt(12, u.getId());
            pt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFOSUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void supprimerUser(int id){
        try {
            PreparedStatement pt = c.prepareStatement("delete from user where id = ?");
            pt.setInt(1, id);
            pt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFOSUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void afficherUser(){
        try {
            PreparedStatement pt= c.prepareStatement("select * from user");
            ResultSet rs = pt.executeQuery();
            
            while(rs.next()){
                System.out.println("User: id = "+rs.getInt(1)+" | username = "+rs.getString(2)+" | email = "+rs.getString(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFOSUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public FOSUser getUserByUsername(String username){
        try {
            System.out.println("a");           
            PreparedStatement pt= c.prepareStatement("select * from user where username = ?");
            pt.setString(1, username);
            ResultSet rs = pt.executeQuery();
                      
            if(rs.next()){
                System.out.println(rs.getInt(1));
                FOSUser u = new FOSUser(rs.getInt(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getByte(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getString(11), rs.getDate(12), rs.getString(13));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServiceFOSUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
