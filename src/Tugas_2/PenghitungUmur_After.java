package Modul_3.Tugas_2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Kelas PenghitungUmur_After menyediakan fungsi utama untuk menghitung
 * dan menampilkan umur seseorang berdasarkan tahun lahir.
 * <p>
 * Program ini adalah hasil refactoring dari versi sebelumnya untuk
 * meningkatkan keterbacaan dan pemeliharaan kode.
 * </p>
 * @author [Nama Anda]
 * @version 2.0 (Setelah Refactoring)
 * @since 2024-10-27
 */
public class PenghitungUmur_After {

    /**
     * Metode utama (main method) untuk menjalankan aplikasi.
     * Metode ini bertanggung jawab atas aliran program (flow control)
     * dan interaksi input/output dasar dengan pengguna.
     * @param args Argumen baris perintah (Command line arguments - tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);

        System.out.println("--- PROGRAM PENGHITUNG UMUR (Refactored) ---");

        System.out.print("Masukkan Tahun Lahir Anda (contoh: 2000): ");
        int tahunLahir = scannerInput.nextInt();

        // Memanggil method untuk perhitungan
        int umurSaatIni = hitungUmur(tahunLahir);

        // Memanggil method untuk tampilan output
        tampilkanDetailUmur(tahunLahir, umurSaatIni);

        scannerInput.close();
    }

    /**
     * Menghitung umur seseorang.
     * Proses perhitungan dilakukan dengan mengurangi tahun saat ini
     * (diambil secara dinamis) dengan tahun lahir pengguna.
     * @param tahunLahir Tahun kelahiran pengguna.
     * @return Umur seseorang dalam satuan tahun (int).
     */
    public static int hitungUmur(int tahunLahir) {
        int tahunSekarang = LocalDate.now().getYear();

        return tahunSekarang - tahunLahir;
    }

    /**
     * Menampilkan detail hasil perhitungan umur ke konsol.
     * Method ini hanya bertugas memformat dan mencetak hasil.
     * @param tahunLahir Tahun kelahiran yang digunakan dalam perhitungan.
     * @param umur Umur yang telah dihitung (hasil dari hitungUmur).
     */
    public static void tampilkanDetailUmur(int tahunLahir, int umur) {
        int tahunSekarang = LocalDate.now().getYear();

        System.out.println("Hasilnya:");
        System.out.println("Tahun Lahir: " + tahunLahir);
        System.out.println("Tahun Sekarang: " + tahunSekarang);
        System.out.println("Umur Anda: " + umur + " tahun");
    }
}