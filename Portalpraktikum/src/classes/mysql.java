/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author Ahda
 */

public class mysql {
    private static mysql instance;
    private String username_db = "root";
    private String password_db = "";
    private Connection conn;
   
    private mysql() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("[!] Database connected.");
            
            // change the database before production
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?", username_db, password_db);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static mysql getInstance(){
        return instance;
    }
    
    public static void createDatabase(){
        instance = new mysql();
    }
    
    public void get_user_data(String username){
        Statement state = null;
        ResultSet res = null;
        try {
            state = conn.createStatement();
            if(state.execute("SELECT * FROM users WHERE username='" + username + "'")) {
                res = state.getResultSet();
                while(res.next()){
                    if(res.getString("username").equals(username)){
                        User.createUser(res.getString("username"), res.getInt("nim"), res.getString("prodi"));
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public boolean validation(String username, char[] password) {
        boolean valid = false;
        ResultSet res = null;
        String pass = String.valueOf(password);
        
        try{
            Statement state = conn.createStatement();
            if(state.execute("SELECT username, password FROM users")){
                res = state.getResultSet();
                while(res.next()){
                    if(res.getString("password").equals(pass) && res.getString("username").equals(username)){
                        valid = true;
                    }
                }
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return valid;
    }
    
    public void addPraktikan(String lab) {
        try{
            Statement state = conn.createStatement();
            User user = User.getInstance();
            boolean execute = state.execute("INSERT INTO `" + lab + "`(`praktikan`, `nim`, `prodi`) VALUES ('" + user.getUsername() + "','" + user.getNim() + "','" + user.getProdi() + "')");
            if(!execute) {
                System.out.println("[?] new Praktikan inserted.");
            } else {
                System.out.println("[!] Something went wrong.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public boolean checkPraktikan(String lab){
        boolean check = false;
        try {
            Statement state = conn.createStatement();
            User user = User.getInstance();
            ResultSet res = null;
            
            if(state.execute("SELECT * FROM " + lab)) {
                res = state.getResultSet();
                while(res.next()){
                    if(res.getString("praktikan").equals(user.getUsername())){
                        check = true; System.out.println(lab +" terdaftar");
                      
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return check;
    }
    
    public void removePraktikan(String lab) {
        try{
            Statement state = conn.createStatement();
            User user = User.getInstance();
            if(!state.execute("DELETE FROM `" + lab + "` WHERE praktikan='" + user.getUsername() + "'")){
                System.out.println("[?] Praktikan has been removed.");
            } else {
                System.out.println("[!] Something went wrong.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
