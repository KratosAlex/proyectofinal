/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JTextField;

/**
 *
 * @author T-101
 */
public class Usuario {
    private String login;
    private String password;

    public Usuario(JTextField txtlogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Usuario() {
    }
    
    
    
}
