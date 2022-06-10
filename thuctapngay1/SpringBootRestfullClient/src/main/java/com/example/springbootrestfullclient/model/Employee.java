package com.example.springbootrestfullclient.model;

public class Employee {

    String fullname;
    String birthday;
    String gender;
    String email;
    String address;
    String id;

    public Employee() {
    }

    public Employee(String id, String fullname, String birthday, String gender, String email, String address) {
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
        this.address = address;
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

    @Override
    public String toString() {
        return "Nhân Viên{" + "Id : " + id + ", Họ và tên : " + fullname + ", Ngày sinh : " + birthday + ", Giới tính : " + gender + ", email : " + email + ", Địa chỉ : " + address + '}';
    }

//    public void input() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhập id nhân viên :");
//        id = scan.nextLine();
//        System.out.println("Nhập Họ và Tên :");
//        fullname = scan.nextLine();
//        System.out.println("Nhap Ngay Sinh :");
//        birthday = scan.nextLine();
//        System.out.println("Nhập Giới Tính :");
//        gender = scan.nextLine();
//        System.out.println("Nhập Email : ");
//        email = scan.nextLine();
//        System.out.println("Nhập Địa Chỉ :");
//        address = scan.nextLine();
//    }
}
