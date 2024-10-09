# **Studi Kasus Music Organizer**

**Nama** : Adyuta Prajahita Murdianto

**NRP** : 5025221186

**Kelas** : PBO A

## **Class Track**

![Track](Resources/screenshot/Track.png)

### **Fungsi**

Kelas ini merepresentasikan setiap musik yang akan di kelola.

### **Atribut**

**title**

Atribut ini adalah representasi dari judul dari lagu atau `track` yang menggunakan tipe data `string`.

**filePath**

Atribut ini merupakan path ke lagu yang tersimpan pada sistem operasi, berfungsi untuk mengidentifikasi lokasi dimana lagu tersimpan.

### **Method**

**constuctor**

Berfungsi untuk mengisi value dari atribut `title` dan `filepath` sesuai input parameter saat pembuatan objek.

**getTitle**

Berfungsi sebagai `getter` dari atribut `title`, yang dimana akan mendapatkan value dari `title`.

**getFilePath**

Berfungsi sebagai `getter` dari atribut `filePath`, yang dimana akan mendapatkan value dari `filePath`.

**toString**

Berfungsi untuk mendapatkan versi string dari objek. 

## **Class TrackReader**

![TrackReader](Resources/screenshot/TrackReader.png)

### **Fungsi**

Kelas ini berfungsi untuk melaksanakan tugas sebagai track reader, yaitu bertugas untuk membaca file `.mp3` dari sebuah direktori dengan bantuan ekstensi `File` bawaaan dari java dan memasukkannya ke penyimpanan lagu pada program yang berupa `ArrayList`.

### **Method**

**readTracks**

Berfungsi sebagai logika utama dalam menjalankan fungsional sebagai track reader. Kembalian dari method ini adalah sebuath `ArrayList` yang berisi lagu-lagu yang berhasil terbaca. Pertama, method akan membuat sebuah `ArrayList` baru bernama `tracks` sebagai tempat untuk menyimpan lagu. Lalu akan menginisiasi sebuah variable bernama `directory` yang dimana akan diarahkan ke `path` dari direktori letak lagu-lagu yang ingin di load. Lalu dilakukan pengecekan terhadap variabel `directory` yang dimana jika variable tersebut tidak bertipe `directory` maka akan menampilkan pesan error `Folder not found.`. Namun jika merupakan `directory` yang valid, maka setiap file yang berada didalam folder tersebut, yang dimana memiliki nama dan ekstensi `.mp3`, nama dari file tersebut akan disimpan pada variable `title` dan path dari file tersebut akan disimpan ke dalam variabel `filePath`. Lalu, kedua variabel tersebut akan digunakan untuk membuat objek `Track` baru yang merepresentasikan sebuah lagu yang sudah dibaca dan akan ditambahkan kedalam `tracks`. Lalu method akan mengembalikan `tracks` setelah selesai melakukan proses pembacaan track.

## **Class MusicPlayer**

![MusicPlayer](Resources/screenshot/MusicPlayer.png)

### **Fungsi**

Fungsi kelas ini adalah menjalankan tugas sebagai music player. 

### **Atribut**

**isPlaying**

Berfungsi sebagai sarana pengecekan apakah terdapat suatu lagu yang sedang berjalan saat ini. 

### **Method**

**play**

Berfungsi untuk menjalankan track sesuai parameter input. Parameter yang diterima adalah objek dari `Track` yang ingin dijalankan. Jika saat ini sedang ada lagu yang dijalankan, maka akan mengeluarkan pesan error `A track is already playing. Stop it first.`. Namun, jika tidak ada lagu yang sedang berjalan, maka akan menjalankan lagu ditandai dengan pesan `Playing: ` diikuti oleh nama lagunya dengan memamnggil method `getNme` dari `track`. Setelah itu akan mengupdate nilai `isPlaying` menjadi `true` untuk memberi tahu sistem bahwa saat ini sedang ada lagu yang dijalankan.

**stop**

Berfungsi untuk memberhentikan lagu yang saat ini sedang berjalan. Pertama dilakukan pengecekan apakah terdapat lagu yang sedang berjalan, jika ada maka akan memberhentikan lagu yang ditandai pesan `Music stopped.` serta mengganti value `isPlaying` menjadi `false`. JIka tidak ada lagu yang sedang berjalan, maka akan mengeluarkan pesan error `No track is currently playing.`.

## **Class MainOrganizer**

![MainOrganizer](Resources/screenshot/MainOrganizer.png)

### **Fungsi**

Berfungsi sebagai kelas yang menjalankan keseluruhan sistem pada music organizer.

### **Atribut**

**tracks** 

Merupakan representasi dari tempat penyimpanan lagu dari program yang menggunakan tipe data `ArrayList<Track>`.

**player** 

Variabel yang akan digunakan sebagai pemutar lagu dengan tipe data `MusicPlayer`.

**trackReader**

Variabel yang akan digunakan sebagai track reader dengan tipe data `TrackReader`.

### **Method**

**constructor**

Berfungsi untuk menginisiasi setiap atribut-atribut pada kelas dengan objek baru sesuai tipe datanya masing-masing.

**addTrack**

Berfungsi untuk meload lagu pada direktori dengan `folderPath` sesuai input parameter dan akan memanggil method `readTracks` pada `trackReader` dan hasilnya akan dimasukkan ke variabel `track` yang merupakan `ArrayList`.

**listAllTrack**

Berfungsi untuk menampilkan list lagu yang sudah di load. Pertama fungsi akan mengecek apakah sudah terdapat lagu yang di load, jika belum akan menampilkan pesan error `No tracks available.` dan jika sudah ada maka akan menampilkan setiap judul lagu yang tersimpan yang didapat dari pemanggilan method `getTitle` pada setiap objek pada `tracks` beserta sistem penomoran yang benar.

**playTrack**

Berfungsi untuk menjalankan lagu sesuai nomor yang diinputkan. Pertama kita akan melakukan `decrement` satu kali pada `number`, karena `ArrayList` indeksnya dimulai dari 0. Kita melakukan `decrement` karena penyetelan lagu bisa dilakukan sesuai dengan penomoran yang ditampilkan. Lalu dilakukan pengecekan apakah nomor yang dimasukkan sesuai dengan penomoran, jika tidak akan menampilkan pesan error `Invalid track number.` dan jika sesuai makan akan menjalankan lagu sesuai nomor yang diinputkan dengan memanggil method `play` pada `player`. 

**stopPlaying**

Berfungsi untuk berhenti menjalankan suatu lagu dengan memanggil method `stop` dari `player`.

**main**

Merupakan method utama yang akan menjalankan keseluruhan program. Pertama disini kita akan menginisiasi variabel `organizer` yang akan menyimpan objek dari kelas `MainOrganizer`. Lalu untuk menjalankan sistem, kita akan memanggil beberapa method pada objek `organizer`.

## **Hsil**

![result](Resources/screenshot/result.png)