/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Dictionary;

/**
 *
 * @author Ahda
 */
public class handler {
    private mysql database = new mysql();
    private Dictionary data;
    
    public handler(String username, String password) throws Exception{
        this.data = database.get_user_data(username, password);
    }
    
    public boolean user_validation(){
        boolean valid = false;
        if(data.get("validate").equals("true")){
            valid = true;
        }
        return valid;
    }
}
