/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapvenha;

import java.util.Scanner;

/**
 *
 * @author vanli
 */
public class NhanVien extends ConNguoi {

    int MaCN;
    int LuongCoBan;
    int PhuCap;

//    public NhanVien() {
//    }
//
//    ;
//    public NhanVien(int CMND, String HoTen, String QueQuan, String GioiTinh, int MaCN, int LuongCoBan, int PhuCap) {
//        this.MaCN = MaCN;
//        this.LuongCoBan = LuongCoBan;
//        this.PhuCap = PhuCap;
//    }

    @Override
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so chung minh nhan dan : ");
        CMND = sc.nextInt();
        sc.nextLine();
        System.out.println("Vui long nhap Ho Ten : ");
        HoTen = sc.nextLine();
        System.out.println("Vui long nhap Que Quan : ");
        QueQuan = sc.nextLine();
        System.out.println("Vui long nhap Gioi Tinh : ");
        GioiTinh = sc.nextLine();
        System.out.println("Vui long nhap Mã Công Nhân : ");
        MaCN = sc.nextInt();
        sc.nextLine();
        System.out.println("Vui long nhap Lương Cơ Bản : ");
        LuongCoBan = sc.nextInt();
        System.out.println("Vui long nhap Phụ Cấp : ");
        PhuCap = sc.nextInt();
    }

    @Override
    public void Xuat() {
        System.out.println("So chung minh nhan dan la : " + CMND);
        System.out.println("Ho Ten la :" + HoTen);
        System.out.println("Que Quan la :" + QueQuan);
        System.out.println("Gioi Tinh la :" + GioiTinh);
        System.out.println(" Mã Công Nhân là : " + MaCN);
        System.out.println("Lương Cơ Bản la :" + LuongCoBan);
        System.out.println("Phụ Cấp la :" + PhuCap);
    }

    @Override
    public int TinhLuong() {
        int luongcongnhan = LuongCoBan + PhuCap;
        System.out.println("Luong cua cong nhan là :" + luongcongnhan );
        return 0;
    }

}
