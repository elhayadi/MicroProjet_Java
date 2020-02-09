/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet;

import java.sql.SQLException;
import javafx.scene.control.TextField;

/**
 *
 * @author DEBBAGH
 */
public class Etudiant extends Personne{
    
    public int age, id_tuteur;
    public String cne, niveau, username, password, email;
    DB db;
    public static int id;
    public static String pass_ses;
    public static String cne_ses;
     public static int count;
   
    
    public Etudiant(){
        
    }
    
    public int login(String cne,String pass){
       try{
           db=new DB();
           String query="select * from clients "+
                   "where cne='"+cne+"'"+" and password='"+pass+"'";
           db.rst=db.stm.executeQuery(query);
            db.rst.last();
           if(db.rst.getRow() == 1){
           while(db.rst.last()){
                Etudiant.id=db.rst.getInt("id_etd");
                return 1;
                
           }
            
         }
       }catch(SQLException e){
        System.out.println("Erreur:"+e);
        }
           return 0;

   }
    
    public int checkcompte(String ident,String pass1, String pass2){
        try{
           db=new DB();
           String query="select * from clients "+
                   "where cne='"+ident+"'";
           db.rst=db.stm.executeQuery(query);
           db.rst.last();
           if(db.rst.getRow() == 1){
               if(pass1.equals(pass2)){
                   Etudiant.pass_ses=pass1;
                   Etudiant.cne_ses=ident;
                   return 1;
               }else return 0;
           }
    }catch(SQLException e){
        System.out.println("Erreur:"+e);
        }
        
        return 2;
    }

   public void ajouter(String nom,String prenom,int age,String niveau,String nomtut,String prenomtut,int Teltut ,String Profession,String Relation){
       try{
           String query="INSERT INTO clients VALUES ('','"+nom+"','"+prenom+"','"+cne_ses+"','"+niveau+"','"+pass_ses+"','"+age+"','"+cne_ses+"','"+count+++"')";
           db.stm.executeUpdate(query);  
           
           String query1="INSERT INTO tuteur VALUES ('"+count+++"','"+nomtut+"','"+prenomtut+"','"+Teltut+"','"+Profession+"','"+Relation+"')";
           db.stm.executeUpdate(query1);   
        }catch(SQLException e){
        System.out.println("Erreur:"+e);
        }
   }
   public void supprimer(int id){
       try{
           String query="DELETE FROM Etudiant where "
                   + "id_etd="+id;
           db.stm.executeUpdate(query);
                     
        }catch(SQLException e){
        System.out.println("Erreur:"+e);
        }
   }
   public void chercher(String nom){
       try{
           String query="select * from etudiant "
                   + "where nom='"+nom+"'";
           db.rst=db.stm.executeQuery(query);
           db.rst.last();
           int nbrRow=db.rst.getRow();
           if(nbrRow!=0)
               System.out.println("Etudiant trouvé\t"+nbrRow);
           else
               System.out.println("Etudiant non trouvé");
        }catch(SQLException e){
        System.out.println("Erreur:"+e);
        }
   }
   public void modifier(int id,String nom,int age){
       try{
           String query="update etudiant set id="+id
                            +"',nom='"+nom
                            +"',age='"+age 
                            + "'Where id='"+id;
           db.stm.executeUpdate(query);
                     
        }catch(SQLException e){
        System.out.println("Erreur:"+e);
        }
   }

    public void ajouter(TextField nom, TextField prenom, TextField age, TextField niveau, TextField tnom, TextField tprenom, TextField t_tel, TextField t_profession, TextField relation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void ajouter(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, String text7) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    
}
