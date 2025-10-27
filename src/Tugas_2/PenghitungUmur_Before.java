package Modul_3.Tugas_2;

import java.util.Scanner;

public class PenghitungUmur_Before {

    // Main Method yang melakukan semua pekerjaan
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- PROGRAM LAMA ---");

        // [Refactoring 1: Nama Variabel Buruk] 'sc' kurang deskriptif
        System.out.print("Tahun Lahir (angka): ");
        int tLahir = sc.nextInt(); // [Refactoring 2: Nama Variabel Buruk] 'tLahir' kurang deskriptif

        // Menghitung tahun sekarang secara manual dan hardcode
        int thnSekarang = 2025; // [Refactoring 3: Hardcode Magic Number] Tahun di-hardcode

        // [Refactoring 4: Logic/Perhitungan tercampur di Main]
        int umur = thnSekarang - tLahir;

        // [Refactoring 5: Duplikasi output logic] Output detail digabung di sini
        System.out.println("Hasilnya:");
        System.out.println("Tahun Lahir: " + tLahir);
        System.out.println("Tahun Sekarang: " + thnSekarang);
        System.out.println("Umur Anda: " + umur + " tahun");

        // Melakukan perhitungan yang sama lagi untuk validasi
        int umurLagi = 2025 - tLahir; // [Refactoring 6: Duplikasi Logika] Perhitungan diulang

        if (umur == umurLagi) {
            System.out.println("Hasil valid!");
        }

        sc.close();
    }
}