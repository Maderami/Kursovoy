package com.docjpa.laba2.JPA.S.models;

public class Item {
    String name;
    int count;
    int countApprove;
    int countReject;

    public Item(String name, int count, int countApprove, int countReject) {
        this.name = name;
        this.count = count;
        this.countApprove = countApprove;
        this.countReject = countReject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountApprove() {
        return countApprove;
    }

    public int getCountReject() {
        return countReject;
    }
}
