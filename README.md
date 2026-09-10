# Sistem Pengelolaan Servis Laptop

## Deskripsi Program

Sistem Pengelolaan Servis Laptop adalah program sederhana berbasis Java yang dibuat untuk membantu mencatat dan mengelola data servis laptop pada toko atau tempat servis.

Program berjalan melalui terminal (command line) dan menyediakan beberapa proses pengelolaan data, yaitu menambah, menampilkan, mengubah, menghapus, dan mencari data servis.

Data yang dikelola dalam program dibagi menjadi tiga bagian:

- **Data Pelanggan**: ID pelanggan, nama, nomor telepon, dan alamat.
- **Data Laptop**: ID laptop, merek, tipe, dan keterangan kerusakan.
- **Data Servis**: ID servis, tanggal masuk, status pengerjaan, dan biaya servis.

Program ini dibuat menggunakan bahasa **Java** dengan menerapkan konsep **Pemrograman Berorientasi Objek (PBO)**. Class yang digunakan terdiri dari `Pelanggan`, `Laptop`, `Servis`, dan `ServisLaptop` sebagai class utama yang menjalankan menu dan mengatur jalannya program.

## Fitur Program

1. **Tambah Data Servis**  
   Menambahkan data pelanggan, laptop, dan servis baru.

2. **Tampilkan Data Servis**  
   Menampilkan seluruh data servis yang telah tersimpan.

3. **Ubah Data Servis**  
   Mengubah informasi status, biaya, dan kerusakan laptop.

4. **Hapus Data Servis**  
   Menghapus data servis berdasarkan ID servis.

5. **Cari Data Servis**  
   Mencari data servis berdasarkan ID servis.

6. **Keluar Program**  
   Mengakhiri program melalui menu keluar.

7. **Validasi Input**  
   Memastikan data yang dimasukkan sesuai dengan ketentuan, seperti input tidak boleh kosong, nomor telepon harus berupa angka, biaya tidak boleh negatif, dan ID tidak boleh duplikat.

8. **Konfirmasi Penghapusan**  
   Meminta konfirmasi pengguna sebelum data servis dihapus untuk mencegah penghapusan secara tidak sengaja.

## Konsep PBO yang Diterapkan

Program menerapkan beberapa konsep dasar Pemrograman Berorientasi Objek, yaitu:

- **Class dan Object**
- **Constructor**
- **Encapsulation**
- **Access Modifier**
- **Getter dan Setter**
- **ArrayList**
- **Percabangan**
- **Perulangan**
- **Validasi Input**

## Alur Program

```text
Mulai
  ↓
Menampilkan Menu Utama
  ↓
Memilih Menu
  ↓
┌───────────────────────────────┐
│ 1. Tambah Data Servis         │
│ 2. Tampilkan Data Servis      │
│ 3. Ubah Data Servis            │
│ 4. Hapus Data Servis           │
│ 5. Cari Data Servis            │
│ 6. Keluar                      │
└───────────────────────────────┘
  ↓
Menjalankan proses sesuai pilihan
  ↓
Kembali ke Menu Utama
  ↓
Pilih 6?
  ├── Tidak → Kembali ke Menu
  └── Ya → Program Selesai
