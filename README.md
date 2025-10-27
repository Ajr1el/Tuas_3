#  PROGRAM PENGHITUNG UMUR (VERSI REFACTORING)

Ini adalah program sederhana berbasis konsol (CLI) yang berfungsi untuk menghitung umur seseorang berdasarkan input tahun lahir. Program ini dikembangkan untuk tugas Pemrograman Lanjut dan melalui proses refactoring untuk memastikan kode yang baik.

##  Ringkasan Refactoring

Versi program ini telah ditingkatkan dari versi sebelumnya dengan minimal 6 langkah refactoring, antara lain:

1.  **Extract Method:** Memisahkan logika perhitungan ke `hitungUmur()` dan logika tampilan ke `tampilkanDetailUmur()`.
2.  **Rename Variable:** Mengubah nama variabel agar lebih jelas dan deskriptif (`scannerInput`, `tahunLahir`).
3.  **Replace Magic Number:** Mengganti nilai tahun hardcode dengan pengambilan tahun dinamis (`LocalDate.now().getYear()`).

##  Dokumentasi Teknis

Dokumentasi detail mengenai kelas dan method dapat dilihat melalui **JavaDoc** yang tertanam dalam kode sumber (`PenghitungUmur_After.java`).

| Nama Elemen | Tipe | Deskripsi Fungsionalitas |
| :--- | :--- | :--- |
| `PenghitungUmur_After` | Kelas | Kelas utama yang menjalankan seluruh program. |
| `main()` | Method | Bertanggung jawab atas aliran program dan menerima input pengguna. |
| `hitungUmur()` | Method | **Logika Utama.** Mengembalikan hasil perhitungan umur. |
| `tampilkanDetailUmur()` | Method | **Logika Tampilan.** Mencetak hasil umur ke layar. |

##  Cara Menggunakan Program

### Persyaratan
* Java Development Kit (JDK) 8 atau versi terbaru.

### Langkah-Langkah Eksekusi
1.  Kompilasi file Java (`PenghitungUmur_After.java`).
2.  Jalankan program di konsol atau melalui IDE Anda.
3.  Masukkan tahun lahir saat diminta, contoh: `1998`.
4.  Program akan menampilkan umur Anda saat ini.

---
*Dibuat oleh: [Ajriel] untuk Tugas Modul 3 Pemrograman Lanjut.*