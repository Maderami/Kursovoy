package com.docjpa.laba2.JPA.S.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_user;

    private String fsm_sub,  position, place_job,subdivision,phone_sub, post_address;

    private String role_sub;

    private boolean active_acc;

    public User(String fsm_sub, String position, String place_job, String subdivision, String phone_sub, String s, String post_address, Boolean active_acc) {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getFsm_sub() {
        return fsm_sub;
    }

    public void setFsm_sub(String fsm_sub) {
        this.fsm_sub = fsm_sub;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlace_job() {
        return place_job;
    }

    public void setPlace_job(String place_job) {
        this.place_job = place_job;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public String getPhone_sub() {
        return phone_sub;
    }

    public void setPhone_sub(String phone_sub) {
        this.phone_sub = phone_sub;
    }

    public String getPost_address() {
        return post_address;
    }

    public void setPost_address(String post_address) {
        this.post_address = post_address;
    }

    public String getRole_sub() {
        return role_sub;
    }

    public void setRole_sub(String role_sub) {
        this.role_sub = role_sub;
    }

    public boolean getActive_acc() {
        return active_acc;
    }

    public void setActive_acc(boolean active_acc) {
        this.active_acc = active_acc;
    }

    public User(String fsm_sub, String position, String place_job, String subdivision, String phone_sub, String post_address, String role_sub, boolean active_acc) {

        this.fsm_sub = fsm_sub;
        this.position = position;
        this.place_job = place_job;
        this.subdivision = subdivision;
        this.phone_sub = phone_sub;
        this.post_address = post_address;
        this.role_sub = role_sub;
        this.active_acc = active_acc;
    }

    public User() {
    }
}
