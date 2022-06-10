package com.mycompany.javacore;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vanli
 */
public class LamBaiTap1_1 {

    int MSV;
    String TSV;
    int ML;
    int SoLuongMOnDaDangKy;
    int[] arr;

    void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap Ma Sinh Vien");
        MSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Vui long nhap Ten Sinh Vien");
        TSV = sc.nextLine();
        System.out.println("Vui long nhap Ma Lop");
        ML = sc.nextInt();
        sc.nextLine();
        System.out.println("So luong mon da dang ky ");
        SoLuongMOnDaDangKy = sc.nextInt();
//        arr[] = new MonHoc[SoLuongMOnDaDangKy];
//        int[] MonHoc = new MonHoc [SoLuongMOnDaDangKy];
        for (int i = 0; i < SoLuongMOnDaDangKy; i++) {
//            arr[i] = new MonHoc[];
        }
    }

    void Xuat() {
        System.out.print("Ma Sinh Vien la : " + MSV);
    }

    public static void main(String[] args) {
        LamBaiTap1_1 chay = new LamBaiTap1_1();
        chay.Nhap();
        chay.Xuat();
    }

}
