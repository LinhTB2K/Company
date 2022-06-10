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
public class KeThuaTinhHinhTron extends TinhHinhTron{
    private float bankinh;
    public KeThuaTinhHinhTron(){}
    public KeThuaTinhHinhTron(float bankinh){
    this.bankinh = bankinh;}
    
    @Override
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Ban Kinh : ");
        bankinh = sc.nextFloat();
    }
    @Override
    public void Xuat(){
        System.out.println("Hinh Trong co ban kinh la : " + bankinh + "");
    }
    @Override
    public float TinhDienTich(){
        float pi = (float) 3.14;
        return bankinh*pi ; 
    }
    
}
