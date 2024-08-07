package com.meta.SpringWeb;

public class Student {
    private int id;
    private String sName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", sName=" + sName + "]";
    }
}
