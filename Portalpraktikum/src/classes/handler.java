/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Ahda
 */
public class handler {
    private mysql database = new mysql();
    private Dictionary data = new Hashtable<>();
    private String username_save;
    private char[] password_save;
    
    public handler(String username, char[] password){
        username_save = username;
        password_save = password;
        try{
            this.data = database.get_user_data(username, password);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public boolean user_validation(){
//        if(data.get("validate").equals("true")){
//            valid = true;
//        }

        return database.validation(username_save, password_save) ? true : false;
    }
}
