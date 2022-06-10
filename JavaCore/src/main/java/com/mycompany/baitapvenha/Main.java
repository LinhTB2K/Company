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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon;
        System.out.println("Menu :");
        System.out.println("1: Nhap Thong tin Giang Vien ");
        System.out.println("2: Nhap thong tin Nhan Vien ");
        System.out.println("3: Nhap thong tin Giang Vien va Nhan Vien ");
        System.out.println("4: Thoat!!!");
        System.out.println();
        System.out.println("Vui long nhap lua chon :");


        luachon = sc.nextInt();
        switch (luachon) {
            case 1:
                GiangVien gv = new GiangVien();
                gv.Nhap();
                gv.Xuat();
                gv.TinhLuong();
                break;
            case 2:
                NhanVien nv = new NhanVien();
                nv.Nhap();
                nv.Xuat();
                nv.TinhLuong();
                break;
            case 3:
                GiangVien db = new GiangVien();
                db.Nhap();
                db.Xuat();
                db.TinhLuong();
                NhanVien dd = new NhanVien();
                dd.Nhap();
                dd.Xuat();
                dd.TinhLuong();
                break;
            default:
                System.out.println("Thoat!!!");
                break;
        }
    }

}
