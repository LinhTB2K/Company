/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.util.Scanner;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author vanli
 */
/*@Entity
@Table(name = "tbnhanvien")*/
public class Employee {

//    @Column(name ="nv_fullname")
    String fullname;

//    @Column(name = "nv_birthday")
    String birthday;

//    @Column(name = "nv_gender")
    String gender;

//    @Column(name = "nv_email")
    String email;

//    @Column(name = "nv_address")
    String address;

//    @Id
//    @Column(name = "nv_id")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

//    @Column(name = "user")
    String user;



    public Employee() {
    }

    public Employee(int id, String fullname, String birthday, String gender, String email, String address) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Nhân Viên{" + "Id : " + id + ", Họ và tên : " + fullname + ", Ngày sinh : " + birthday + ", Giới tính : " + gender + ", email : " + email + ", Địa chỉ : " + address + '}';
    }
    
    public void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập id nhân viên :");
        id = scan.nextInt();
        System.out.println("Nhập Họ và Tên :");
        fullname = scan.nextLine();
        System.out.println("Nhap Ngay Sinh :");
        birthday = scan.nextLine();
        System.out.println("Nhập Giới Tính :");
        gender = scan.nextLine();
        System.out.println("Nhập Email : ");
        email = scan.nextLine();
        System.out.println("Nhập Địa Chỉ :");
        address = scan.nextLine();
    }
}
