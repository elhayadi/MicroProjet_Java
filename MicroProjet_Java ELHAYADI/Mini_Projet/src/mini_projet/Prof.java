/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_projet;

import java.sql.SQLException;

/**
 *
 * @author DEBBAGH
 */
public class Prof extends Personne{
    
    public int identifiant, age, classe_id, salire;
    public String cin, username, password, email;
    DB db;
    
    public Prof(){
        
    }
    
     public int login(String identifiant,String pass){
       try{
           db=new DB();
           String query="select * from etudiant where cne="+identifiant+" and password="+pass;
           db.rst=db.stm.executeQuery(query);
           if(db.rst.getRow() == 1){
           while(db.rst.next()){
                Etudiant.id=db.rst.getInt("id_etd");
                return 1;
           }
         }
       }catch(SQLException e){
        System.out.println("Erreur:"+e);
        }
           return 0;

   }
    
}
