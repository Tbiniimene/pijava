/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entity.Formation;
import DB.Connexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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
    public class FormationDao implements Iformateurdao<Formation>{
    
    private static FormationDao instance;
    private Statement st;
    private ResultSet rs;
    
    private FormationDao() {
        Connexion cs=Connexion.getInstance();
        try {
            st=cs.getCnx().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(FormationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static FormationDao getInstance(){
        if(instance==null) 
            instance=new FormationDao();
        return instance;
    }

    @Override
    public void insert(Formation f) {
        String req="insert into formation (nom,description,type,prix,image,address,nbmax,date_deb,date_fin) values ('"+f.getNom()+"','"+ f.getDescription()+"', '"+f.getType()+"', '"+f.getPrix()+"', '"+f.getImage()+"', '"+f.getAddress()+"', '"+f.getNbmax()+"', '"+f.getDate_deb()+"','"+f.getDate_fin()+"')";
        try {
            st.executeUpdate(req);
        } catch (SQLException ex) {
            Logger.getLogger(FormationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

    @Override
    public void delete(Formation f) {
        String req="delete from formation where id_formation="+f.getId_formation() ;
        //Formateur form=displayById(f.getId_formateur());
         Formation p=displayById(f.getId_formation());
        
          if(p!=null)
              try {
           
            st.executeUpdate(req);
             
        } catch (SQLException ex) {
            Logger.getLogger(FormationDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" HELLO IT'S HERE");
        }else System.out.println("n'existe pas");
    }

    @Override
    public ObservableList<Formation> displayAll() {
        String req="select * from formation";
        ObservableList<Formation> list=FXCollections.observableArrayList();       
        
        try {
            rs=st.executeQuery(req);
            while(rs.next()){
                Formation f=new Formation();
                f.setId_formation(rs.getInt("id_formation"));
                f.setFormateur_id(rs.getInt("id_formateur"));
                f.setNom(rs.getString("nom"));
                f.setType(rs.getString("type"));
                f.setDescription(rs.getString("description"));
                f.setPrix(rs.getInt("prix"));
                f.setImage(rs.getString("image"));
                f.setAddress(rs.getString("address"));
                f.setNbmax(rs.getInt("nbmax"));
                f.setDate_deb(rs.getDate("date_deb"));
                f.setDate_fin(rs.getDate("date_fin"));
//                f.setId_formation(rs.getInt(1));
//                f.setFormateur_id(rs.getInt(2));
//                f.setNom(rs.getString(3));
//                f.setType(rs.getString(4));
//                f.setDescription(rs.getString(5));
//                f.setPrix(rs.getInt(6));
//                f.setImage(rs.getString(7));
//                f.setAddress(rs.getString(8));
//                f.setNbmax(rs.getInt(9));
//                f.setDate_deb(rs.getDate(10));
//                f.setDate_fin(rs.getDate(10));
                list.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FormationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Formation> displayAllList() {
        String req="select * from formateur";
        List<Formation> list=new ArrayList<>();
        
        try {
            rs=st.executeQuery(req);
            while(rs.next()){
              Formation f=new Formation();
                f.setId_formation(rs.getInt("id_formation"));
                f.setFormateur_id(rs.getInt("id__formateur"));
                f.setNom(rs.getString("nom"));
                f.setType(rs.getString("type"));
                f.setDescription(rs.getString("description"));
                f.setPrix(rs.getInt("prix"));
                f.setImage(rs.getString("image"));
                f.setAddress(rs.getString("address"));
                f.setNbmax(rs.getInt("nbmax"));
                f.setDate_deb(rs.getDate("date_deb"));
                f.setDate_fin(rs.getDate("date_fin"));
                list.add(f);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FormationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    @Override
    public Formation displayById(int id) {
           String req="select * from formateur where id_formateur ="+id;
           Formation f=new Formation();
        try {
            rs=st.executeQuery(req);
           // while(rs.next()){
            rs.next();
//                f.setId_formation(rs.getInt(1));
//                f.setFormateur_id(rs.getInt(2));
//                f.setNom(rs.getString(3));
//                f.setType(rs.getString(4));
//                f.setDescription(rs.getString(5));
//                f.setPrix(rs.getInt(6));
//                f.setImage(rs.getString(7));
//                f.setAddress(rs.getString(8));
//                f.setNbmax(rs.getInt(9));
//                f.setDate_deb(rs.getDate(10));
//                f.setDate_fin(rs.getDate(11));

                f.setId_formation(rs.getInt("id_formation"));
                f.setFormateur_id(rs.getInt("id__formateur"));
                f.setNom(rs.getString("nom"));
                f.setType(rs.getString("type"));
                f.setDescription(rs.getString("description"));
                f.setPrix(rs.getInt("prix"));
                f.setImage(rs.getString("image"));
                f.setAddress(rs.getString("address"));
                f.setNbmax(rs.getInt("nbmax"));
                f.setDate_deb(rs.getDate("date_deb"));
                f.setDate_fin(rs.getDate("date_fin"));
            //}  
        } catch (SQLException ex) {
            Logger.getLogger(FormationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    return f;
    }

    @Override
    public boolean update(Formation f) {
        
        //String qry = "UPDATE categorie SET nom_categorie = '"+c.getNom()+"', type = '"+c.getType()+"' WHERE id = "+c.getId();
        String qry = "UPDATE formation SET nom = '"+f.getNom()+"', Formateur_id='"+f.getFormateur_id() +"', description='"+f.getDescription()+"', type='"+f.getType()+"', prix='"+f.getPrix()+"', image='"+f.getImage()+"', address='"+f.getAddress()+"', nbmax='"+f.getNbmax()+"', date_deb='"+f.getDate_deb()+"', date_fin='"+f.getDate_fin()+"' WHERE id_formation = "+f.getId_formation();
        
        try {
            if (st.executeUpdate(qry) > 0) {
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FormationDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    
    
}
