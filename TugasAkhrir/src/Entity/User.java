/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Akhrizal
 */
public class User {
    private String user;
   private String  password;

    public String getUser() {
        user = "admin";
        return user;
    }

    public String getPassword() {
        password = "admin"; 
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
