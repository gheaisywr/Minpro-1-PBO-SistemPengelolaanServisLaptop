# Sistem Pengelolaan Servis Laptop
Nama : Ghea Aisyah Windraswari\
NIM  : 2509116022
## Deskripsi Program

**Sistem Pengelolaan Servis Laptop** merupakan program berbasis Java yang dibuat untuk membantu proses pengelolaan data servis laptop secara sederhana dan terstruktur melalui terminal.

Program ini digunakan untuk mengelola tiga jenis data utama, yaitu **data pelanggan, data laptop, dan data servis**. Data pelanggan digunakan untuk menyimpan informasi pemilik laptop, data laptop digunakan untuk menyimpan informasi perangkat yang akan diservis, sedangkan data servis digunakan untuk menyimpan informasi mengenai proses servis laptop.

Program memiliki beberapa fitur utama, yaitu **Tambah Data Servis, Tampilkan Data Servis, Ubah Data Servis, Hapus Data Servis, dan Cari Data Servis**. Dengan adanya fitur tersebut, pengguna dapat melakukan pengelolaan data servis tanpa perlu mengubah data secara langsung melalui kode program.

Program dibuat menggunakan bahasa pemrograman **Java** dengan menerapkan konsep **Pemrograman Berorientasi Objek (PBO)**. Konsep PBO yang diterapkan meliputi class, object, constructor, encapsulation, access modifier, getter dan setter. Program juga menggunakan `ArrayList` sebagai tempat penyimpanan data selama program dijalankan.

---

# Penjelasan Alur Program

## 1. Penyimpanan Data Menggunakan ArrayList

Program menggunakan `ArrayList` untuk menyimpan kumpulan data pelanggan, laptop, dan servis. Masing-masing `ArrayList` digunakan untuk menyimpan object berdasarkan class yang sesuai.

```java
static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
static ArrayList<Laptop> daftarLaptop = new ArrayList<>();
static ArrayList<Servis> daftarServis = new ArrayList<>();
```

`daftarPelanggan` digunakan untuk menyimpan object dari class `Pelanggan`, `daftarLaptop` digunakan untuk menyimpan object dari class `Laptop`, sedangkan `daftarServis` digunakan untuk menyimpan object dari class `Servis`.

Penggunaan `ArrayList` memungkinkan program untuk menyimpan beberapa data dan melakukan proses penambahan maupun penghapusan data selama program berjalan.

### Dokumentasi ArrayList
<img width="403" height="44" alt="ArrayList" src="https://github.com/user-attachments/assets/e1fba7c3-762a-475f-99fa-98aac2312a22" />


---

## 2. Class dan Object

Program memiliki tiga class entity utama, yaitu `Pelanggan`, `Laptop`, dan `Servis`. Ketiga class tersebut digunakan untuk mengelompokkan data sesuai dengan fungsi masing-masing.

### Class Pelanggan

Class `Pelanggan` digunakan untuk menyimpan informasi mengenai pelanggan yang menggunakan layanan servis laptop.

Atribut yang terdapat pada class `Pelanggan` yaitu:

- `idPelanggan`
- `nama`
- `noTelepon`
- `alamat`

Contoh penerapannya:

```java
public class Pelanggan {

    private String idPelanggan;
    private String nama;
    private String noTelepon;
    private String alamat;
}
```

### Dokumentasi Class Pelanggan
<img width="200" height="89" alt="class pelanggan" src="https://github.com/user-attachments/assets/8d756e78-36b0-422f-8265-98be1ccd3fbf" />




### Class Laptop

Class `Laptop` digunakan untuk menyimpan informasi mengenai laptop yang akan diservis.

Atribut yang terdapat pada class `Laptop` yaitu:

- `idLaptop`
- `merk`
- `tipe`
- `kerusakan`

### Dokumentasi Class Laptop
<img width="188" height="89" alt="class laptop" src="https://github.com/user-attachments/assets/46668e24-f877-4925-a462-6742eba2c3e2" />



### Class Servis

Class `Servis` digunakan untuk menyimpan informasi mengenai proses servis laptop.

Atribut yang terdapat pada class `Servis` yaitu:

- `idServis`
- `tanggalMasuk`
- `status`
- `biaya`

### Dokumentasi Class Servis
<img width="202" height="86" alt="class servis" src="https://github.com/user-attachments/assets/22e99525-b54c-447f-92c1-abe93682bc68" />




---

## 3. Constructor

Setiap class entity memiliki constructor yang digunakan untuk memberikan nilai awal pada atribut ketika sebuah object dibuat.

### Constructor Class Pelanggan

Constructor pada class `Pelanggan` menerima parameter berupa ID pelanggan, nama, nomor telepon, dan alamat.

```java
public Pelanggan(String idPelanggan, String nama, String noTelepon, String alamat) {
    this.idPelanggan = idPelanggan;
    this.nama = nama;
    this.noTelepon = noTelepon;
    this.alamat = alamat;
}
```

### Dokumentasi Constructor Pelanggan
<img width="532" height="103" alt="constructor Pelanggan" src="https://github.com/user-attachments/assets/0cb701a6-2ff8-4cfa-ba68-4473931b3929" />



### Constructor Class Laptop

Constructor pada class `Laptop` digunakan untuk memberikan nilai awal berupa ID laptop, merek, tipe, dan kerusakan.

```java
public Laptop(String idLaptop, String merk, String tipe, String kerusakan) {
    this.idLaptop = idLaptop;
    this.merk = merk;
    this.tipe = tipe;
    this.kerusakan = kerusakan;
}
```

### Dokumentasi Constructor Laptop

<img width="475" height="95" alt="constructor Laptop" src="https://github.com/user-attachments/assets/c6be4fff-b917-41c4-9056-a148797facb2" />


### Constructor Class Servis

Constructor pada class `Servis` digunakan untuk memberikan nilai awal berupa ID servis, tanggal masuk, status, dan biaya.

```java
public Servis(String idServis, String tanggalMasuk, String status, double biaya) {
    this.idServis = idServis;
    this.tanggalMasuk = tanggalMasuk;
    this.status = status;
    this.biaya = biaya;
}
```
<img width="403" height="44" alt="ArrayList" src="https://github.com/user-attachments/assets/1cfb2c5d-a3ed-4c3e-93fe-0f819acfc9fb" />

### Dokumentasi Constructor Servis
<img width="512" height="98" alt="constructor Servis" src="https://github.com/user-attachments/assets/ee04eff7-4131-484e-bf75-0bb0300928e8" />


---

## 4. Proses Pembuatan Object

Pada saat proses tambah data servis, program membuat object dari masing-masing class menggunakan constructor yang telah dibuat.

Object `Pelanggan` dibuat berdasarkan data pelanggan yang telah dimasukkan pengguna.

```java
Pelanggan pelanggan = new Pelanggan(
    idPelanggan,
    nama,
    noTelepon,
    alamat
);
```

Object `Laptop` dibuat berdasarkan data laptop.

```java
Laptop laptop = new Laptop(
    idLaptop,
    merk,
    tipe,
    kerusakan
);
```

Object `Servis` dibuat berdasarkan data servis.

```java
Servis servis = new Servis(
    idServis,
    tanggalMasuk,
    status,
    biaya
);
```

Object yang telah dibuat kemudian dimasukkan ke dalam `ArrayList` sehingga dapat digunakan pada proses selanjutnya, seperti menampilkan, mengubah, menghapus, dan mencari data.

### Dokumentasi Object Pelanggan
<img width="247" height="88" alt="objek Pelanggan" src="https://github.com/user-attachments/assets/2b682412-2886-43db-850a-54f6b225c77c" />

### Dokumentasi Object Laptop
<img width="190" height="88" alt="objek Laptop" src="https://github.com/user-attachments/assets/8e9655da-e41e-4372-ba2d-0ce58f5d83ad" />


### Dokumentasi Object Servis
<img width="194" height="88" alt="objek Servis" src="https://github.com/user-attachments/assets/cd88d7d5-ed4e-4bff-a7d5-4874e43ce0fb" />


---

## 5. Menu Utama

Ketika program pertama kali dijalankan, sistem akan menampilkan menu utama pada terminal.

Menu utama terdiri dari:

```text
1. Tambah Data Servis
2. Tampilkan Data Servis
3. Ubah Data Servis
4. Hapus Data Servis
5. Cari Data Servis
6. Keluar
```

Pengguna dapat memilih menu dengan memasukkan nomor pilihan.

Menu utama dibuat menggunakan perulangan `do-while`. Dengan perulangan tersebut, menu akan terus ditampilkan setelah pengguna menyelesaikan suatu proses.

Program hanya akan berhenti apabila pengguna memilih pilihan **6. Keluar**.

### Dokumentasi Kode Menu Utama
<img width="431" height="187" alt="menu" src="https://github.com/user-attachments/assets/6d41ebf2-9e61-4249-aa09-c7bfcec2b908" />

### Dokumentasi Output Menu Utama
<img width="239" height="145" alt="output menu" src="https://github.com/user-attachments/assets/9518cfa8-329e-4312-b2bc-381174f7298c" />



---

## 6. Percabangan Menu

Setelah pengguna memasukkan pilihan menu, program menggunakan percabangan `switch-case` untuk menentukan proses yang akan dijalankan.

Contoh kode:

```java
switch (pilihan) {

    case 1:
        tambahDataServis();
        break;

    case 2:
        tampilkanDataServis();
        break;

    case 3:
        ubahDataServis();
        break;

    case 4:
        hapusDataServis();
        break;

    case 5:
        cariDataServis();
        break;

    case 6:
        System.out.println("\nProgram selesai. Terima kasih!");
        break;

    default:
        System.out.println("\nMenu tidak tersedia!");
}
```

Jika pengguna memilih angka `1`, program menjalankan method `tambahDataServis()`.

Jika pengguna memilih angka `2`, program menjalankan method `tampilkanDataServis()`.

Begitu pula dengan pilihan lainnya. Jika pengguna memasukkan pilihan yang tidak tersedia, bagian `default` akan dijalankan dan program menampilkan pesan bahwa menu tidak tersedia.

### Dokumentasi Percabangan
<img width="399" height="396" alt="percabangan" src="https://github.com/user-attachments/assets/fde7a77a-03ae-4c3b-86fe-ecceb743dac4" />



---

## 7. Proses Tambah Data Servis

Proses tambah data dijalankan ketika pengguna memilih menu **1. Tambah Data Servis**.

Program akan meminta pengguna memasukkan data pelanggan terlebih dahulu.

Data pelanggan terdiri dari:

- ID Pelanggan
- Nama Pelanggan
- Nomor Telepon
- Alamat

Selanjutnya pengguna memasukkan data laptop yang akan diservis, yaitu:

- ID Laptop
- Merek Laptop
- Tipe Laptop
- Kerusakan

Setelah itu pengguna memasukkan data servis yang terdiri dari:

- ID Servis
- Tanggal Masuk
- Status
- Biaya

Setiap data yang dimasukkan akan melalui proses validasi. Setelah data dinyatakan valid, program membuat object `Pelanggan`, `Laptop`, dan `Servis`.

Object tersebut kemudian disimpan ke dalam `ArrayList`.

Dengan proses ini, data yang dimasukkan pengguna dapat digunakan kembali pada fitur tampil, ubah, hapus, dan cari data.

---

## 8. Proses Tampilkan Data Servis

Pada menu **2. Tampilkan Data Servis**, program menampilkan seluruh data yang telah tersimpan.

Program mengambil data dari `ArrayList` kemudian menampilkannya pada terminal.

Untuk mengambil nilai atribut dari object, program menggunakan method getter.

Contohnya:

```java
System.out.println("ID Servis      : " + servis.getIdServis());
System.out.println("Tanggal Masuk  : " + servis.getTanggalMasuk());

System.out.println("ID Pelanggan   : " + pelanggan.getIdPelanggan());
System.out.println("Nama Pelanggan : " + pelanggan.getNama());
System.out.println("No. Telepon    : " + pelanggan.getNoTelepon());
System.out.println("Alamat         : " + pelanggan.getAlamat());

System.out.println("ID Laptop      : " + laptop.getIdLaptop());
System.out.println("Merek Laptop   : " + laptop.getMerk());
System.out.println("Tipe Laptop    : " + laptop.getTipe());
System.out.println("Kerusakan      : " + laptop.getKerusakan());

System.out.println("Status         : " + servis.getStatus());
System.out.println("Biaya          : Rp" + servis.getBiaya());
```

Penggunaan getter memungkinkan program mengambil data dari atribut yang bersifat `private`.

### Dokumentasi Penggunaan Getter
<img width="449" height="221" alt="getter" src="https://github.com/user-attachments/assets/b13fae2f-c24f-4cb6-8bb9-372953c70850" />



---

## 9. Proses Ubah Data Servis

Menu **3. Ubah Data Servis** digunakan untuk mengubah data servis yang telah tersimpan.

Pengguna terlebih dahulu memasukkan ID Servis yang ingin diubah.

Program kemudian melakukan pencarian terhadap ID tersebut. Jika ID Servis ditemukan, pengguna dapat memasukkan data baru untuk menggantikan data sebelumnya.

Data yang telah diubah kemudian disimpan kembali pada object yang bersangkutan.

Jika ID Servis tidak ditemukan, program akan menampilkan informasi bahwa data servis tidak tersedia.

---

## 10. Proses Hapus Data Servis

Menu **4. Hapus Data Servis** digunakan untuk menghapus data servis berdasarkan ID Servis.

Pengguna memasukkan ID Servis yang ingin dihapus. Program kemudian mencari data tersebut.

Jika data ditemukan, program tidak langsung menghapus data. Program terlebih dahulu meminta konfirmasi kepada pengguna.

Contoh kode konfirmasi:

```java
System.out.print("Yakin ingin menghapus? (y/n): ");
String konfirmasi = input.nextLine();
```

Jika pengguna memilih `y`, data akan dihapus dari masing-masing `ArrayList`.

```java
daftarServis.remove(index);
daftarPelanggan.remove(index);
daftarLaptop.remove(index);
```

Jika pengguna memilih selain `y`, data tidak akan dihapus.

### Dokumentasi Konfirmasi Sebelum Menghapus
<img width="362" height="155" alt="konfirmasi sebelum menghapus data" src="https://github.com/user-attachments/assets/f41d117c-0071-47ba-9243-5658c357e04b" />



---

## 11. Proses Cari Data Servis

Menu **5. Cari Data Servis** digunakan untuk mencari data servis berdasarkan ID Servis.

Pengguna cukup memasukkan ID Servis yang ingin dicari. Program kemudian melakukan pencarian terhadap data yang tersimpan.

Jika ID ditemukan, informasi servis yang berkaitan akan ditampilkan kepada pengguna.

Jika ID tidak ditemukan, program akan memberikan pemberitahuan bahwa data tidak tersedia.

Fitur pencarian ini membantu pengguna menemukan data servis tertentu tanpa harus memeriksa seluruh data yang tersimpan.

---

## 12. Perulangan Program

Program menggunakan perulangan agar sistem dapat berjalan secara terus-menerus sampai pengguna memilih menu keluar.

Perulangan `do-while` digunakan pada menu utama.

Contohnya:

```java
do {
    // Menampilkan menu
    // Memasukkan pilihan
    // Menjalankan proses berdasarkan pilihan
} while (pilihan != 6);
```

Selama nilai `pilihan` tidak sama dengan `6`, program akan kembali menampilkan menu utama.

Selain digunakan pada menu utama, perulangan juga digunakan dalam proses validasi input agar pengguna dapat memasukkan kembali data apabila input sebelumnya tidak sesuai.

---

# Penjelasan Letak Penerapan Nilai Tambah

Selain fitur dasar CRUD, program menerapkan beberapa nilai tambah untuk membuat program lebih terstruktur, aman dalam pengelolaan data, dan lebih mudah digunakan.

Nilai tambah yang diterapkan pada program meliputi **encapsulation, access modifier, getter dan setter, validasi input, konfirmasi sebelum penghapusan, fitur pencarian, serta penggunaan perulangan dan percabangan**.

---

## 1. Encapsulation

Encapsulation diterapkan pada class `Pelanggan`, `Laptop`, dan `Servis`.

Atribut pada masing-masing class dibuat menggunakan access modifier `private`.

Contohnya:

```java
private String idPelanggan;
private String nama;
private String noTelepon;
private String alamat;
```

Dengan menggunakan `private`, atribut tidak dapat diakses secara langsung dari luar class.

Akses terhadap atribut dilakukan melalui method getter dan setter yang disediakan oleh masing-masing class.

Penerapan ini membuat data di dalam object lebih terkontrol.

### Dokumentasi Encapsulation
<img width="203" height="89" alt="encapsulation" src="https://github.com/user-attachments/assets/a039a79d-0443-43bb-873b-b8608fd83691" />



---

## 2. Getter dan Setter

Getter dan setter digunakan untuk mengakses dan mengubah nilai atribut yang bersifat `private`.

Getter digunakan untuk mengambil nilai dari atribut.

Contoh:

```java
public String getNama() {
    return nama;
}
```

Setter digunakan untuk mengubah nilai atribut.

Contoh:

```java
public void setNama(String nama) {
    this.nama = nama;
}
```

Getter dan setter diterapkan pada class `Pelanggan`, `Laptop`, dan `Servis`.

### Dokumentasi Getter dan Setter
<img width="305" height="425" alt="getter setter Pelanggan" src="https://github.com/user-attachments/assets/163ea70b-dc9e-427c-af71-bc6405a6dd69" />
<img width="314" height="419" alt="getter setter Laptop" src="https://github.com/user-attachments/assets/ed4f534e-241f-4ae7-9511-fa01ebaf31bc" />
<img width="324" height="422" alt="getter setter Servis" src="https://github.com/user-attachments/assets/a02678a6-ec20-4fc3-9d45-8fd811cbf450" />


---

## 3. Access Modifier

Program menggunakan access modifier `private` dan `public`.

Access modifier `private` digunakan pada atribut class entity untuk membatasi akses langsung dari luar class.

Sementara itu, access modifier `public` digunakan pada class, constructor, getter, setter, dan method yang perlu digunakan oleh bagian program lainnya.

Penerapan access modifier tersebut mendukung konsep encapsulation dalam program.

---

## 4. Validasi Input

Program menerapkan validasi input untuk memastikan data yang dimasukkan pengguna sesuai dengan ketentuan.

Beberapa validasi yang diterapkan antara lain:

- ID Pelanggan tidak boleh kosong.
- ID Pelanggan tidak boleh digunakan lebih dari satu kali.
- Nama Pelanggan tidak boleh kosong.
- Nomor Telepon tidak boleh kosong.
- Nomor Telepon hanya boleh berisi angka.
- Biaya servis tidak boleh bernilai negatif.
- Pilihan menu harus sesuai dengan pilihan yang tersedia.
- Data tertentu harus diisi sebelum dapat diproses.

Contoh validasi ID Pelanggan:

```java
if (idPelanggan.isEmpty()) {
    System.out.println("ID Pelanggan tidak boleh kosong!");
}
```

Contoh validasi nama:

```java
if (nama.isEmpty()) {
    System.out.println("Nama tidak boleh kosong!");
}
```

Contoh validasi nomor telepon:

```java
else if (!noTelepon.matches("\\d+")) {
    System.out.println("No. Telepon hanya boleh berisi angka!");
}
```

Validasi tersebut dilakukan menggunakan perulangan sehingga pengguna dapat memasukkan kembali data sampai input yang diberikan sesuai dengan ketentuan.

### Dokumentasi Validasi ID Pelanggan
<img width="353" height="77" alt="validasi id pelanggan" src="https://github.com/user-attachments/assets/c9ea352f-144a-477a-b450-b2d0afbfe845" />



### Dokumentasi Validasi Nama
<img width="362" height="127" alt="validasi nama" src="https://github.com/user-attachments/assets/5b285636-2095-4a10-95ed-3f30a76f136c" />


### Dokumentasi Validasi Nomor Telepon
<img width="445" height="113" alt="validasi input no telp" src="https://github.com/user-attachments/assets/159a4dd7-1a0c-4798-b363-a95bbf7e2991" />


---

## 5. Konfirmasi Sebelum Menghapus Data

Sebagai nilai tambah, program memberikan konfirmasi sebelum melakukan penghapusan data.

Pengguna harus memberikan pilihan `y` untuk melanjutkan proses penghapusan.

Jika pengguna memilih `n`, data tidak akan dihapus.

Fitur ini digunakan untuk mengurangi kemungkinan data terhapus secara tidak sengaja.

### Dokumentasi Konfirmasi Penghapusan
<img width="362" height="155" alt="konfirmasi sebelum menghapus data" src="https://github.com/user-attachments/assets/daaf26e5-5526-470b-b92d-ac4fae4cd47d" />



---

## 6. Fitur Pencarian Data

Program menyediakan fitur pencarian data servis berdasarkan ID Servis.

Fitur ini menjadi nilai tambah karena pengguna dapat menemukan data tertentu dengan lebih mudah tanpa harus melihat seluruh data servis satu per satu.

Proses pencarian dilakukan dengan memeriksa ID Servis yang dimasukkan pengguna terhadap data yang telah tersimpan.

---

## 7. Penerapan Perulangan

Perulangan diterapkan agar program dapat berjalan secara berulang.

Perulangan `do-while` digunakan untuk menjalankan menu utama sampai pengguna memilih menu **6. Keluar**.

Perulangan juga digunakan dalam proses validasi input sehingga pengguna dapat memperbaiki input apabila terjadi kesalahan.

Dengan adanya perulangan, program tidak langsung berhenti setelah satu proses selesai dan pengguna dapat melakukan beberapa proses dalam satu kali menjalankan program.

---

## 8. Penerapan Percabangan

Percabangan `switch-case` digunakan untuk menentukan proses berdasarkan pilihan menu yang dimasukkan pengguna.

Setiap pilihan menu memiliki proses yang berbeda, seperti tambah, tampil, ubah, hapus, dan cari data.

Jika pilihan yang dimasukkan tidak tersedia, program akan menjalankan bagian `default` dan menampilkan pesan bahwa menu tidak tersedia.

### Dokumentasi Percabangan
<img width="399" height="396" alt="percabangan" src="https://github.com/user-attachments/assets/4122e9b4-5ac1-4700-b0fa-02d94ae40f20" />



---

# Dokumentasi Output Program

Berikut merupakan dokumentasi tampilan program ketika dijalankan melalui terminal.

## Percobaan Sistem
Pengujian dilakukan untuk memastikan setiap fitur pada Sistem Pengelolaan Servis Laptop dapat berjalan sesuai dengan fungsi yang telah dibuat. Pengujian meliputi proses penambahan data, menampilkan data, mengubah data, mencari data, menghapus data, serta pengujian validasi input.

#### 1. Tambah Data
Pada pengujian ini, pengguna memilih menu 1. Tambah Data Servis, kemudian memasukkan data pelanggan, laptop, dan servis. Program berhasil menerima data yang dimasukkan dan menampilkan pesan “Data servis berhasil ditambahkan!”. Hal ini menunjukkan bahwa proses penambahan data berhasil dilakukan.

<img width="226" height="147" alt="Screenshot 2026-09-10 182225" src="https://github.com/user-attachments/assets/8777a9cc-9b84-4763-9083-ecf7b7cb0530" />

<img width="208" height="317" alt="Screenshot 2026-09-10 182840" src="https://github.com/user-attachments/assets/16c7250a-ac7c-46e4-a91b-88fb23d5d6a3" />



#### 2. Tampilkan Data
Setelah data berhasil ditambahkan, pengguna memilih menu 2. Tampilkan Data Servis. Program berhasil menampilkan data pelanggan, laptop, dan servis yang sebelumnya telah dimasukkan. Data yang ditampilkan meliputi ID servis, tanggal masuk, pelanggan, laptop, kerusakan, status, dan biaya.
<img width="224" height="248" alt="Screenshot 2026-09-10 182858" src="https://github.com/user-attachments/assets/b4f712ed-17ae-47bc-a2d6-4a3891f6042c" />


#### 3. Ubah Data
Pengguna memilih menu 3. Ubah Data Servis dan memasukkan ID servis 056. Program berhasil menemukan data tersebut dan memungkinkan pengguna mengubah status servis dari Menunggu menjadi Diproses, serta mengubah biaya servis dari Rp200000 menjadi Rp205000. Program kemudian menampilkan pesan “Data servis berhasil diubah!”.
<img width="241" height="223" alt="Screenshot 2026-09-10 182949" src="https://github.com/user-attachments/assets/573df60c-1c07-4bb9-8768-ab63784ebd4c" />


#### 4. Cari Data
Pada menu 5. Cari Data Servis, pengguna memasukkan ID servis 056. Program berhasil menemukan dan menampilkan data servis yang dicari. Hasil pencarian menunjukkan bahwa data telah menggunakan status dan biaya terbaru setelah dilakukan perubahan.

<img width="198" height="200" alt="Screenshot 2026-09-10 183104" src="https://github.com/user-attachments/assets/9f7ebca4-4dfe-4958-bee7-57358fca70db" />

#### 5. Hapus Data
Pengguna memilih menu 4. Hapus Data Servis dan memasukkan ID servis 056. Sebelum data dihapus, program meminta konfirmasi melalui pilihan y/n. Setelah pengguna memilih y, program menampilkan pesan “Data servis berhasil dihapus!”. Pengujian kemudian dilanjutkan dengan memilih menu tampil data dan program menunjukkan “Belum ada data servis.” Hal ini membuktikan bahwa data berhasil dihapus.

<img width="242" height="83" alt="Screenshot 2026-09-10 183137" src="https://github.com/user-attachments/assets/2a90cbac-7d58-46d8-8269-c63e1a0e1efb" />

<img width="149" height="56" alt="Screenshot 2026-09-10 183204" src="https://github.com/user-attachments/assets/b66b8230-305a-40da-bf84-3f19f9f5fce0" />


#### 6. Pengujian Validasi Input
Program juga diuji menggunakan input yang tidak sesuai. Pada pengujian nomor telepon, pengguna memasukkan wda, kemudian program menampilkan pesan “No. Telepon hanya boleh berisi angka!”. Program kemudian meminta pengguna memasukkan nomor telepon kembali.

Selain itu, pada pengujian status servis, pengguna memasukkan huruf g ketika sistem meminta pilihan status. Program menampilkan pesan “Input harus berupa angka!” sehingga pengguna harus memasukkan pilihan yang sesuai.

<img width="218" height="101" alt="Screenshot 2026-09-10 183331" src="https://github.com/user-attachments/assets/bb7b2780-c61b-4b41-a152-a200b1b714d3" />

<img width="146" height="79" alt="Screenshot 2026-09-10 183532" src="https://github.com/user-attachments/assets/3c0a5f67-3736-4ae4-b7ad-b383ee01e508" />

#### 7. Keluar
Program akan kembali ke menu utama setelah pengguna menyelesaikan suatu proses. Program hanya akan berhenti ketika pengguna memilih **6. Keluar**.

<img width="219" height="44" alt="Screenshot 2026-09-10 183217" src="https://github.com/user-attachments/assets/beedad0d-066c-40aa-937f-533c9928536a" />


Kesimpulan Percobaan:
Berdasarkan hasil pengujian, fitur utama program dapat berjalan sesuai dengan fungsi yang dirancang. Proses tambah, tampil, ubah, cari, dan hapus data berhasil dilakukan. Validasi input juga berjalan ketika pengguna memasukkan data yang tidak sesuai, sehingga program dapat mengurangi kesalahan dalam proses penginputan data.


---

# Kesimpulan

Sistem Pengelolaan Servis Laptop merupakan program berbasis Java yang dibuat untuk membantu proses pengelolaan data pelanggan, data laptop, dan data servis melalui terminal.

Program menyediakan fitur utama berupa tambah data, tampilkan data, ubah data, hapus data, dan cari data servis. Data yang dimasukkan pengguna disimpan menggunakan `ArrayList` dan dikelola berdasarkan object dari class `Pelanggan`, `Laptop`, dan `Servis`.

Dalam penerapannya, program menggunakan konsep Pemrograman Berorientasi Objek seperti class, object, constructor, encapsulation, access modifier, getter dan setter. Program juga menerapkan percabangan dan perulangan untuk mengatur alur proses serta validasi input untuk memastikan data yang dimasukkan sesuai dengan ketentuan.

Nilai tambah yang diterapkan dalam program meliputi validasi input, pencarian data berdasarkan ID Servis, serta konfirmasi sebelum penghapusan data. Dengan adanya fitur-fitur tersebut, program menjadi lebih terstruktur dan memberikan pengalaman penggunaan yang lebih baik dalam mengelola data servis laptop.
