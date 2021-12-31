package com.docjpa.laba2.JPA.S.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documenttype {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_doc;

    private String doc_name,description_doc,type_doc;

    private String status_doc;

    public Long getId_doc() {
        return id_doc;
    }

    public void setId_doc(Long id_doc) {
        this.id_doc = id_doc;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDescription_doc() {
        return description_doc;
    }

    public void setDescription_doc(String description_doc) {
        this.description_doc = description_doc;
    }

    public String getType_doc() {
        return type_doc;
    }

    public void setType_doc(String type_doc) {
        this.type_doc = type_doc;
    }

    public String getStatus_doc() {
        return status_doc;
    }

    public void setStatus_doc(String status_doc) {
        this.status_doc = status_doc;
    }

    public Documenttype() {
    }

    public Documenttype(Long id_doc, String doc_name, String description_doc, String type_doc, String status_doc) {
        this.id_doc = id_doc;
        this.doc_name = doc_name;
        this.description_doc = description_doc;
        this.type_doc = type_doc;
        this.status_doc = status_doc;
    }
}
