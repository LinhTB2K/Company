package learn.com.data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vanli
 */
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.time.LocalDate;
//import java.util.Vector;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author vanli
 */
public class Employee {

    int empno;
    String ename;
    String job;
    int mgr;
    Date hiredate;
    int sal;
    int comm;
    int deptno;
    int id;
    String name;
    String email;
    String country;
    String password;

    public Employee() {
    }

    public Employee(int empno, String ename, String job, int mgr, int sal, int comm, int deptno, int id, String name, String email, String country, String password)// Date hiredate thiếu
    {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
//        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
        this.id = id;
        this.country = country;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public int getEmpNo() {
        return empno;
    }

    public void setEmpNo(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgr() {
        return mgr;
    }

    public void setMgr(int mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptno;
    }

    public void setDeptNo(int deptno) {
        this.deptno = deptno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getPassword() {
        return password;
    }
    
    public void setPassword(){
        this.password = password;
    }

    //To change body of generated methods, choose Tools | Templates.
//    public void setHiredate(LocalDate toLocalDate) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    

    public void getName(String ename) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
