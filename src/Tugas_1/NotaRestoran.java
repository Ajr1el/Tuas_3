package Modul_3.Tugas_1;

import java.util.Scanner;

public class NotaRestoran {

    // --- ATTRIBUTE (Variabel Kelas) ---
    private static final double PAJAK_LAYANAN = 0.10; // 10%

    public static void main(String[] args) {
        // [PSVM] - Gunakan Autocomplete (psvm + Tab/Enter) di IDE untuk blok ini
        // [SOUT] - Gunakan Autocomplete (sout + Tab/Enter) untuk mencetak

        Scanner scanner = new Scanner(System.in);
        String namaPelanggan;
        double totalHargaBersih = 0;

        System.out.println("=========================================");
        System.out.println("          NOTARAN - Nota Restoran        ");
        System.out.println("=========================================");

        System.out.print("Masukkan Nama Pelanggan: ");
        namaPelanggan = scanner.nextLine();
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        System.out.println("\n--- MENU PESANAN ---");

        totalHargaBersih += inputPesanan("Nasi Goreng Spesial", 25000, scanner);

        totalHargaBersih += inputPesanan("Es Teh Manis", 5000, scanner);

        totalHargaBersih += inputPesanan("Tahu Isi", 10000, scanner);

        System.out.println("\n-----------------------------------------");
        System.out.println("TOTAL HARGA BERSIH (Subtotal): Rp" + totalHargaBersih);
        System.out.println("-----------------------------------------");

        // Pemanggilan method hitungTotalAkhir
        hitungTotalAkhir(totalHargaBersih);

        scanner.close();
        System.out.println("\n=========================================");
        System.out.println("   Terima Kasih Atas Kunjungan Anda!  ");
        System.out.println("=========================================");
    }

    //METHOD: Untuk menerima input pesanan dan menghitung subtotal
    public static double inputPesanan(String namaMenu, double hargaSatuan, Scanner sc) {
        System.out.print("Jumlah " + namaMenu + " (Rp" + hargaSatuan + "): ");
        // Pastikan Anda menggunakan Autocomplete saat memanggil method sc.nextInt()
        int jumlah = sc.nextInt();

        double subtotal = hargaSatuan * jumlah;
        System.out.println("  -> Subtotal " + namaMenu + ": Rp" + subtotal);
        return subtotal;
    }

    //Untuk menghitung total akhir (TEMPAT IMPLEMENTASI LIVE TEMPLATE)
    public static void hitungTotalAkhir(double subtotal) {

        double biayaPajak = subtotal * PAJAK_LAYANAN;
        double diskon = 0;

        if (subtotal >= 50000) {
            diskon = subtotal * 0.05; // 5% Diskon jika subtotal >= Rp50.000
            System.out.println("  Mendapatkan Diskon 5%!");
        }

        double totalSetelahPajak = subtotal + biayaPajak;
        double totalAkhir = totalSetelahPajak - diskon;

        System.out.println("Biaya Pajak (" + (PAJAK_LAYANAN * 100) + "%): Rp" + biayaPajak);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("-----------------------------------------");
        System.out.println("TOTAL YANG HARUS DIBAYAR: Rp" + totalAkhir);
    }
}