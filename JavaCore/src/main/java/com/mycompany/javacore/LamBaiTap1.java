/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javacore;

import java.util.Scanner;

/**
 *
 * @author vanli
 */
public class LamBaiTap1 {
    int MaMH;
    String TenMH;
    int SoTC;
   public void nhap(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Vui long nhap ma mon hoc : ");
            MaMH = sc.nextInt();
            sc.nextLine();
            System.out.print("Vui long nhap ten mon hoc : ");
            TenMH = sc.nextLine();
            System.out.print("Vui long nhap So tin chi : ");
            SoTC = sc.nextInt();
            sc.close();
    }
   public void xuat(){
        System.out.println("Ma mon hoc la :" + MaMH);
        System.out.println("Ten mon hoc la :" + TenMH);
        System.out.println("So tin chi la :" + SoTC);
    }
    public int laySTC(){
        return SoTC;
    }
}
