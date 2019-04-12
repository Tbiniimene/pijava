/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entity.Formateur;
import DB.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author wiemhjiri
 */
    public class FormateurDao implements Iformateurdao<Formateur>{
    
    private static FormateurDao instance;
    private Statement st;
    private ResultSet rs;
    
    private FormateurDao() {
        Connexion cs=Connexion.getInstance();
        try {
            st=cs.getCnx().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(FormateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static FormateurDao getInstance(){
        if(instance==null) 
            instance=new FormateurDao();
        return instance;
    }

    @Override
    public void insert(Formateur f) {
        String req="insert into formateur (nom,prenom,type,tel) values ('"+f.getNom()+"','"+f.getPrenom()+"','"+f.getType()+"','"+f.getTel()+"')";
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(FormateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    @Override
    public void delete(Formateur f) {
        String req="delete from formateur where id_formateur="+f.getId_formateur() ;
        //Formateur form=displayById(f.getId_formateur());
         Formateur p=displayById(f.getId_formateur());
        
          if(p!=null)
              try {
           
            st.executeUpdate(req);
             
        } catch (SQLException ex) {
            Logger.getLogger(FormateurDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" HELLO IT'S HERE");
        }else System.out.println("n'existe pas");
    }

    @Override
    public ObservableList<Formateur> displayAll() {
        String req="select * from formateur";
        ObservableList<Formateur> list=FXCollections.observableArrayList();       
        
        try {
            rs=st.executeQuery(req);
            while(rs.next()){
                Formateur f=new Formateur();
                f.setId_formateur(rs.getInt(1));
                f.setNom(rs.getString("nom"));
                f.setPrenom(rs.getString(3));
                
                f.setType(rs.getString(4));
                f.setTel(rs.getInt(5));
                list.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FormateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Formateur> displayAllList() {
        String req="select * from formateur";
        List<Formateur> list=new ArrayList<>();
        
        try {
            rs=st.executeQuery(req);
            while(rs.next()){
              Formateur f=new Formateur();
                f.setId_formateur(rs.getInt(1));
                f.setNom(rs.getString("nom"));
                f.setPrenom(rs.getString(3));
                f.setTel(rs.getInt(4));
                f.setType(rs.getString(5));
                list.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FormateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    @Override
    public Formateur displayById(int id) {
           String req="select * from formateur where id_formateur ="+id;
           Formateur f=new Formateur();
        try {
            rs=st.executeQuery(req);
           // while(rs.next()){
            rs.next();
                f.setId_formateur(rs.getInt("id"));
                f.setNom(rs.getString("nom"));
                f.setPrenom(rs.getString("prenom"));
                 f.setTel(rs.getInt("tel"));
                f.setType(rs.getString("type"));
                
            //}  
        } catch (SQLException ex) {
            Logger.getLogger(FormateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return f;
    }

    @Override
    public boolean update(Formateur f) {
        
        //String qry = "UPDATE categorie SET nom_categorie = '"+c.getNom()+"', type = '"+c.getType()+"' WHERE id = "+c.getId();
        String qry = "UPDATE formateur SET nom = '"+f.getNom()+"', prenom='"+f.getPrenom()+"', tel='"+f.getTel()+"', type='"+f.getType()+"' WHERE id_formateur = "+f.getId_formateur();
        
        try {
            if (st.executeUpdate(qry) > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FormateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    
}
