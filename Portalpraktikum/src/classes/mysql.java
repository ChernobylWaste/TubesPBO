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
import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Ahda
 */

public class mysql {
    private String username_db = "root";
    private String password_db = "";
    private Connection conn;

    public mysql() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("[!] Database connected.");
            
            // change the database before production
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?", username_db, password_db);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public Dictionary get_user_data(String username, char[] password) throws SQLException{
        Statement state = conn.createStatement();
        ResultSet res = null;
        
        String pass = String.valueOf(password);
        
        // Fetching data from sql
        if(state.execute("SELECT * FROM users")) {
            res = state.getResultSet();
        }
        
        Dictionary<String, String> data = new Hashtable<>();
        data.put("validate", "false");
        while(res.next()) {
            if(!res.getString("username").equals(username)) {
                continue;
            }
            if(!res.getString("password").equals(pass)){
                continue;
            }
            data.put("validate", "true");
            data.put("data",res.getString("data"));
        }
        return data;
    }
}
