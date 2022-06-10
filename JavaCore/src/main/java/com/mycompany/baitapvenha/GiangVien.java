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
public class GiangVien extends ConNguoi{
    int MaGV;
    int HSL;
    
    
    @Override
    public void Nhap(){
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
        System.out.println("Nhập Ma Giao Viên : ");
        MaGV = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so học sinh lop : ");
        HSL = sc.nextInt();
    }
    @Override
    public void Xuat(){
        System.out.println("So chung minh nhan dan la : " +CMND);
        System.out.println("Ho Ten la :" + HoTen);
        System.out.println("Que Quan la :" + QueQuan);
        System.out.println("Gioi Tinh la :"+GioiTinh);
        System.out.println("Ma giao viên là :" + MaGV);
        System.out.println("So học sinh trong lop là : "  + HSL);
    }
    @Override
    public int TinhLuong(){
        System.out.println("Luong cua giao vien la :" + HSL*1410000);
        return HSL*1410000 ;
    }
}
