/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph;

/**
 *
 * @author HP-VICTUS
 */
public class Account {
    String userName;
    String password;

    public void getLogin() {
        System.out.println("Logging in user: " + userName);
    }

    public void generatePassword() {
        this.password = "AutoGen123";
    }
}

