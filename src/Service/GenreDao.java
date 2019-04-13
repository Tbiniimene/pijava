///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Service;
//
//
//
//import com.esprit.entity.Genre;
//import com.esprit.utils.ConnexionSingleton;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//
///**
// *
// * @author wiemhjiri
// */
//public class GenreDao implements Idao<Genre>{
//    
//    private static GenreDao instance;
//    private Statement st;
//    private ResultSet rs;
//    
//    public GenreDao() {
//        ConnexionSingleton cs=ConnexionSingleton.getInstance();
//        try {
//            st=cs.getCnx().createStatement();
//        } catch (SQLException ex) {
//            Logger.getLogger(GenreDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    public static GenreDao getInstance(){
//        if(instance==null) 
//            instance=new GenreDao();
//        return instance;
//    }
//
//    @Override
//    public void insert(Genre g) {
//        String req="insert into genre (type,pays) "
//                + "values ('"+g.getType()+"','"+g.getPays()+"')";
//        try {
//            st.executeUpdate(req);
//        } catch (SQLException ex) {
//            Logger.getLogger(GenreDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }   
//
//    @Override
//    public void delete(Genre g) {
//        String req="delete from genre where id_genre="+g.getId_genre();
//        Genre p =displayById(g.getId_genre());
//        
//          if(p!=null)
//              try {
//           
//            st.executeUpdate(req);
//             
//        } catch (SQLException ex) {
//            Logger.getLogger(GenreDao.class.getName()).log(Level.SEVERE, null, ex);
//        }else System.out.println("n'existe pas");
//    }
//
//    @Override
//    public ObservableList<Genre> displayAll() {
//        String req="select * from genre";
//        ObservableList<Genre> list=FXCollections.observableArrayList();       
//        
//        try {
//            rs=st.executeQuery(req);
//            while(rs.next()){
//                Genre g=new Genre();
//                g.setId_genre(rs.getInt(1));
//                g.setType(rs.getString(2));
//                g.setPays(rs.getString(3));
//               
//                list.add(g);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(GenreDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//
//    public List<Genre> displayAllList() {
//        String req="select * from genre";
//        List<Genre> list=new ArrayList<>();
//        
//        try {
//            rs=st.executeQuery(req);
//            while(rs.next()){
//                Genre g=new Genre();
//                 g.setId_genre(rs.getInt(1));
//                g.setType(rs.getString(2));
//                g.setPays(rs.getString(3));
//               
//                
//                list.add(g);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(GenreDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//    @Override
//    public Genre displayById(int id_genre) {
//           String req="select * from gnre where id_genre ="+id_genre;
//           Genre g=new Genre();
//        try {
//            rs=st.executeQuery(req);
//           // while(rs.next()){
//            rs.next();
//                g.setId_genre(rs.getInt(1));
//                g.setType(rs.getString(2));
//                g.setPays(rs.getString(3));
//               
//                
//            //}  
//        } catch (SQLException ex) {
//            Logger.getLogger(GenreDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    return g;
//    }
//
//    @Override
//    public boolean update(Genre g) {
//        String qry = "UPDATE genre SET type = '"
//                +g.getType()+"', pays = '"
//                +g.getPays()+
//                "'WHERE id_genre = "
//                +g.getId_genre();
//        
//        try {
//            if (st.executeUpdate(qry) > 0) {
//                return true;
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(GenreDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//    }
//
//    public static class getInstance extends GenreDao {
//
//        public getInstance() {
//        }
//    }
//
//    
//}
