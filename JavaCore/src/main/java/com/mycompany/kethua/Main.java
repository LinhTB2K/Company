/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kethua;

import java.util.Scanner;

/**
 *
 * @author vanli
 */
public class Main {
    public static void main(String[] args) {
//        KeThuaTinhHinhVuong kb = new KeThuaTinhHinhVuong();
//        kb.Nhap();
//        kb.Xuat();
//        kb.TinhDienTich();
Scanner sc = new Scanner(System.in);
int n;
        System.out.println("Nhap n");
        n = sc.nextInt();
        TinhHinhVuong[] arr = new TinhHinhVuong[n];
        for(int i =0; i<n ; i++){
            arr[i] = new TinhHinhVuong();
            arr[i].Nhap();
        }
        for(int i =0; i<n ; i++)
        {
            arr[i].Xuat();
            System.out.println("S = "+ arr[i].TinhDienTich());
        }
    }
    
}
