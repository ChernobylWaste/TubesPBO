/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Ahda
 */
public class User {
    private static User instance;
    private String username;
    private int nim;
    private String prodi;

    private User(String username, int nim, String email) {
        this.username = username;
        this.nim = nim;
        this.prodi = email;
    }

    public static User getInstance() {
        return instance;
    }

    public static void createUser(String username, int nim, String email) {
        instance = new User(username, nim, email);
    }

    public String getUsername() {
        return username;
    }

    public int getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }
}

