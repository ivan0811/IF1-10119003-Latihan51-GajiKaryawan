package com.ivanfaathirza;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan dan menghitung gaji karyawan kordinaat menggunakan konsep inheritance dan polymorphism
 */


public class Main {

    public static void main(String[] args) {
	    Manager manager = new Manager();
	    Locale locale = Locale.forLanguageTag("id");
        Scanner scan = new Scanner(System.in);

	    System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        manager.setNik(scan.nextLine());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scan.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scan.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scan.next().toUpperCase());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scan.nextInt());

        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : ".concat(manager.getNik()));
        System.out.println("NAMA : ".concat(manager.getNama()));
        System.out.println("GOLONGAN : " + manager.getGolongan());
        System.out.println("JABATAN : ".concat(manager.getJabatan()));
        System.out.printf(locale, "\nTUNJANGAN GOLONGAN : Rp. %,.0f,-%n",  manager.tunjanganGolongan(manager.getGolongan()));
        System.out.printf(locale, "TUNJANGAN JABATAN  : Rp. %,.0f,-%n", manager.tunjanganJabatan(manager.getJabatan()));
        System.out.printf(locale, "TUNJANGAN KEHADIRAN  : Rp. %,.0f,-%n", manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.printf(locale, "\nGAJI TOTAL  : Rp. %,.0f,-%n", manager.gajiTotal());
    }
}
