/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Ahda
 */
public class handler {  
    private mysql database;
    public handler(){
        mysql.createDatabase();
        database = mysql.getInstance();
    }
    
    public boolean user_validation(String username, char[] password){
        database.get_user_data(username);
        return database.validation(username, password) ? true : false;
    }
}
