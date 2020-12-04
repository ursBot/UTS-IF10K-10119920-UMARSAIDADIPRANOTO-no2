/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119920.umarsaidadipranoto.no2;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

class Tabungan {
    
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
    
}

public class UTSno2 {
    
    private static int awal, tarik, akhir;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal : ");
        awal = input.nextInt();
        System.out.print("Jumlah uang yang diambil : ");
        tarik = input.nextInt();
        Tabungan tabungan = new Tabungan(awal);
        akhir = tabungan.ambilUang(tarik);
        System.out.println("Saldo Anda Sekarang : " + akhir);
    }
}