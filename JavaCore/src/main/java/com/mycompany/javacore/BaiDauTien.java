/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vanli
 */

/*
    - Ten lop chua ham main phai co ten trung voi file
    - Diem bat dau va diem ket thuc cua khoi lenh
    - Moi 1 chuong trinh thuc thi phai co 1 phuong thuc main

    - public chi ra bang phuong thuc main co the goi boi bat ky doi tuong
    - static chi ra bang phuong thuc main la mot phuong thuc lop
    - void chi ra bang phuong thuc main khong tr ve bat ky gia tri nao
    - Dinh danh phan theo cach dat ten rieng cua chuong trinh

    - Bien la vung nho dung de luu tru cac gia tri cua chuong trinh
    - Moi bien gan lien voi mot kieu du lieu va mot dinh danh duy nhat goi la ten bien
    - Bien co the khai bao o moi noi trong chuong trinh

    - Cach khai bao : <kieu_du_lieu> <ten_bien> ;               (vd: String a;)
                        <kieu_du_lieu> <ten_bien> = <gia_tri>;              (String a= "ten toi la";)
    - Bien toan cuc : la bien co the truy xuat o khap noi trong chuong trinh, thuong duoc khai bao dung tu khoa "public" hoac dat chung trong class
    - Bien cuc bo : la bien chi co the truy xuat trong khoi lenh no khai bao
    'a' la mot gia tri
    "a\null" ;a mot ky tu

    - toan tu ep kieu:
        <ten_bien> = (Kieu_du_lieu) <ten_bien>;
        float a = 2.2;
        int b = (int) a;
      ep kieu hep va ep kieu rong.

      - hang so:
        +) hang la 1 gia tri bat bien trong chuong trinh
        +) ten hang duoc dat theo qui uoc giong nhu ten bien
        +) hang ky tu : la 1 ky tu don nam giua 2 dau nhay don
        +) hang chuoi la tap hop cac ky tu duoc dat giua hai dau nhay kep "". Mot chuoi khong co kys tu nao la mot hang chuoi rong.
        +) hang chuoi khong phai la 1 kieu du lieu co so nhung van duoc khai bao va su dung trong cac chuong trinh


    


 */
//Java to chuc theo class cac leh va cac ham phai thuoc lop nao do, chung khong duoc dung ben ngoai cua lop
public class BaiDauTien {

    // Giai phuong trinh ax+b =o;
    public static void GiaiPhuongTrinhBacNhat() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vui long nhap a:");
        float a = scan.nextFloat();
        System.out.println("Vui long nhap b:");
        float b = scan.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo so nghiem");
            }
        } else {
            float x = -b / a;
            System.out.println("Phuong trinh co nghiem x =" + x);
        }
    }

    public static void TimUocChung() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        do {
            int dem = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    dem++;
                    System.out.println("\t" + i);
                }
            }
            System.out.println();
            if (dem == 2) {
                System.out.println(n + "la SNT");
            } else {
                System.out.println(n + "khong la SNT");
            }
        } while (n > 0);
    }

    public static void Mang1Chieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = sc.nextInt();
        System.out.println("Gia tri cua cac phan tu trong mag la:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang da nhap la ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    static void Chuoi() {
        String s1 = "Xin chao cac ban";
        String s2 = new String(s1);
        String s3 = s1;
        if (s1 == s2) {
            System.out.println("S1 bằng S2");
        } else {
            System.out.println("S1 khac s2");
        }
        if (s1.equals(s2)) {
            System.out.println("S1 bang s2");
        } else {
            System.out.println("S1 khong bang s2");
        }
        if(s1.compareTo(s3)==0){
            System.out.println("S1 = S3");
        }
        else if(s1.compareTo(s2) <0){
        System.out.println("S1 < S2");
    }
        else{
            System.out.println("S1 > S2");
        }
        String str1 = "Xin chao";
        for(int i=str1.length() - 1;i>=0;i--){
            System.out.println(str1.charAt(i));
        }
    }

    public static void main(String[] args) throws IOException {
//        GiaiPhuongTrinhBacNhat();
//        TimUocChung();
//        System.out.println("Hello World");
//        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in)); // cau lenh giong scanner
//        String s = inStream.readLine();
//        System.out.println(s);
//        Mang1Chieu();
//        String sdc = "Hello World";
//        System.out.println("Ký tự o đầu tiên là : " + sdc.indexOf("o"));
//        System.out.println("Ký tự o cuối cùng là : " + sdc.lastIndexOf("o"));
//        Chuoi();
LamBaiTap1 a = new LamBaiTap1();
        a.nhap();
        a.xuat();
        a.laySTC();
    }

}
