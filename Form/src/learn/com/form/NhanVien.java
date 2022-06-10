/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn.com.form;

import learn.com.form.Login;

/**
 *
 * @author vanli
 */
public class NhanVien {

    String username;
    String password;
    String id;
    String fullname;
    String birthday;
    String gender;
    String email;
    String address;
    public NhanVien() {
    }

    public NhanVien(String username, String password, String id, String fullname, String birthday, String gender, String email, String address, String intid) {
        this.username = username;
        this.password = password;
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.address = address;

    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
