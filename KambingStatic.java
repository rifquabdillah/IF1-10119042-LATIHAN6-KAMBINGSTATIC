/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Stks
 */
public class Mamalia{
    //variable jumlahKambing di deklarasikan sebagai statik
    public static int jumlahKambing;
}

public class KambingStatic {

//NAMA_KAMBING sebagai konstanta
public static final String NAMA_KAMBING = "MIDUN";

public static void main (String[] args){
   Mamalia.jumlahKambing = 485000;
   System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak" + Mamalia.jumlahKambing);
}
    
}
