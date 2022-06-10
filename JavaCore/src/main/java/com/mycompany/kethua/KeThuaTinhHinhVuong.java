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
public class KeThuaTinhHinhVuong extends TinhHinhVuong{
    private float a;
    public KeThuaTinhHinhVuong(){}
    public KeThuaTinhHinhVuong(float a){
    this.a = a;}
    
    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a : ");
        a = sc.nextFloat();
    }
    @Override
    public void Xuat(){
        System.out.println("Hinh vuong : " + a + "");
    }
    @Override
    public float TinhDienTich(){
        return a*a;
    }
}

