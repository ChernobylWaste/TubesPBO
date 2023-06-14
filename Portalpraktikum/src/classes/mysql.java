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
    private String username_db = "root";
    private String password_db = "";
    
    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            
            // change the database before production
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=" + username_db + "&password=" + password_db);
            System.out.println("[!] Database connected.");
            conn.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public Object get_user_data(String username, String password){
        Statement state = null;
        ResultSet res = null;
        Object data = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=" + username_db + "&password=" + password_db);
            state = conn.createStatement();
            
            if(state.execute("SELECT * FROM users")) {
                res = state.getResultSet();
            }
            
            while(res.next()) {
                if(!res.getString("username").equals(username)) {
                    continue;
                }
                if(!res.getString("password").equals(password)){
                    continue;
                }
                data = res.getString("data");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
}
