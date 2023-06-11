/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ahda
 */
public class handler {
    File database = new File("database.txt");
    File users = new File("users.txt");
    
    // Database checking process
    public void check_database() throws IOException {
        System.out.println("[?] Checking database...");
        if(!database.exists()){
            database.createNewFile();
            System.out.println("[✔] new Database entry has been created.");
        } else {
            System.out.println("[✔] Database exist.");
        }
        
        System.out.println("[?] Checking users...");
        if(!users.exists()) {
            System.out.println("[!] Creating default user...");
            users.createNewFile();
            try (FileWriter user_file = new FileWriter("users.txt")) {
                user_file.write("admin:admin");
            }
            System.out.println("[✔] Created default user admin.");
        } else {
            System.out.println("[✔] Users exist.");
        }
    }
    
    public boolean user_validation(String username, String password) throws FileNotFoundException {
        Scanner user_reader = new Scanner(users);
        String [] data;
        boolean validate = false;
        while (user_reader.hasNextLine()) {
            String temp = user_reader.nextLine();
            String replace_temp = temp.replace(" ", "");
            data = replace_temp.split(":");
            boolean check_user = username.equals(data[0]) ? true : false;
            boolean check_pass = password.equals(data[1]) ? true : false;
            if(check_user && check_pass == true) {
                validate = true;
                break;
            }
        }
        return validate;
    }
}
