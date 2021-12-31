package com.docjpa.laba2.JPA.S.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class loginusers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_user;

    private String login,password;

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
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

    public loginusers(Long id_user, String login, String password) {
        this.id_user = id_user;
        this.login = login;
        this.password = password;
    }

    public loginusers() {
    }
}
