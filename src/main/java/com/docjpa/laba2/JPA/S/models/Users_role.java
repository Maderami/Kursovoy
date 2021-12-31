package com.docjpa.laba2.JPA.S.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users_role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_role;
    private String name_role;
    private int lvl_role;

    public Long getId_role() {
        return id_role;
    }

    public void setId_role(Long id_role) {
        this.id_role = id_role;
    }

    public String getName_role() {
        return name_role;
    }

    public void setName_role(String name_role) {
        this.name_role = name_role;
    }

    public int getLvl_role() {
        return lvl_role;
    }

    public void setLvl_role(int lvl_role) {
        this.lvl_role = lvl_role;
    }

    public Users_role(Long id_role, String name_role, int lvl_role) {
        this.id_role = id_role;
        this.name_role = name_role;
        this.lvl_role = lvl_role;
    }

    public Users_role() {
    }
}
