/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;



import Entity.Annonce;
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
public class AnnonceDao implements Idao<Annonce>{
    
    private static AnnonceDao instance;
    private Statement st;
    private ResultSet rs;
    
    public AnnonceDao() {
        Connexion cs=Connexion.getInstance();
        try {
            st=cs.getCnx().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    } 
    
    public static AnnonceDao getInstance(){
        if(instance==null) 
            instance=new AnnonceDao();
        return instance;
    }

    @Override
    public void insert(Annonce a) {
        String req="insert into annonce (nom,date,description,"
                + "titre,nom_image) "
                + "values ('"+a.getNom()+"','"+a.getDate()+"','"+a.getDescription()+"','"+a.getTitre()+"',"
                + "'"+a.getNom_Image()+"')";
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    @Override
    public void delete(Annonce a) {
        String req="delete from annonce where id_Annonce="+a.getId_Annonce();
        Annonce p=displayById(a.getId_Annonce());
        
          if(p!=null)
              try {
           
            st.executeUpdate(req);
             
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
        }else System.out.println("n'existe pas");
    }

    @Override
    public ObservableList<Annonce> displayAll() {
        String req="select * from annonce";
        ObservableList<Annonce> list=FXCollections.observableArrayList();       
        
        try {
            rs=st.executeQuery(req);
            while(rs.next()){
                Annonce p=new Annonce();
                p.setId_Annonce(rs.getInt(1));
                p.setNom(rs.getString("nom"));
                p.setDate(rs.getString(3));
                p.setDescription(rs.getString(4));
                p.setTitre(rs.getString(5));
                p.setNom_Image(rs.getString(6));
                list.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Annonce> displayAllList() {
        String req="select * from annonce";
        List<Annonce> list=new ArrayList<>();
        
        try {
            rs=st.executeQuery(req);
            while(rs.next()){
                Annonce p=new Annonce();
                 p.setId_Annonce(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setDate(rs.getString(3));
                p.setDescription(rs.getString(4));
                p.setTitre(rs.getString(5));
                p.setNom_Image(rs.getString(6));
                
                list.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    @Override
    public Annonce displayById(int id_Annonce) {
           String req="select * from annonce where id_Annonce ="+id_Annonce;
           Annonce p=new Annonce();
        try {
            rs=st.executeQuery(req);
           // while(rs.next()){
            rs.next();
                p.setId_Annonce(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setDate(rs.getString(3));
                p.setDescription(rs.getString(4));
                p.setTitre(rs.getString(5));
                p.setNom_Image(rs.getString(6));
                
            //}  
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return p;
    }

    @Override
    public boolean update(Annonce p) {
        String qry = "UPDATE annonce SET nom = '"
                +p.getNom()+"', date = '"
                +p.getDate()+"',description='"+p.getDescription()+"',"
                + "titre='"+p.getTitre()+"', nom_image='"+p.getNom_Image()+
                "'WHERE id_Annonce = "
                +p.getId_Annonce();
        
        try {
            if (st.executeUpdate(qry) > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static class getInstance extends AnnonceDao {

        public getInstance() {
        }
    }

    
}
