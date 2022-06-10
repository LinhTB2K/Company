package com.example.dataspringmvc;

public class User {
    String user;
    String pass;

    public User(){
    }

    public User(String user,String pass){
        this.pass = pass;
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}

