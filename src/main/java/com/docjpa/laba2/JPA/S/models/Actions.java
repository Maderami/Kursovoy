package com.docjpa.laba2.JPA.S.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Actions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_actions;

    public Actions() {
    }

    public Actions(Long id_actions) {
        this.id_actions = id_actions;
    }

    public Long getId_actions() {
        return id_actions;
    }

    public void setId_actions(Long id_actions) {
        this.id_actions = id_actions;
    }
}
