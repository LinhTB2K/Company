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
public class KeThuaTinhHinhChuNhat extends TinhHinhChuNhat{
    private float a;
    private float b;
    public KeThuaTinhHinhChuNhat(){}
    public KeThuaTinhHinhChuNhat(float a,float b){
    this.a = a;
    this.b =b;}
    
    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        a = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhap b : ");
        a = sc.nextFloat();
    }
    @Override
    public void Xuat(){
        System.out.println("Hinh chu nhat co canh a : " + a + " va Canh b : " + b +"");
    }
    @Override
    public float TinhDienTich(){
        return b*a;
    }
    
}
