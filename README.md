# News App

## Deskripsi

News App adalah aplikasi Android yang menyediakan informasi terkini tentang berita dari berbagai sumber. Aplikasi ini dirancang untuk memberikan pengalaman pengguna yang intuitif dengan fitur pencarian berita, pemilihan sumber berita, dan tampilan daftar berita yang terperinci. Dibangun dengan Kotlin dan menggunakan arsitektur modern Android, aplikasi ini memanfaatkan teknologi Room untuk penyimpanan lokal dan Retrofit untuk pengambilan data dari API berita.

## Fitur Utama

- **Pencarian Berita**: Memungkinkan pengguna untuk mencari berita berdasarkan judul. Saran pencarian ditampilkan berdasarkan riwayat pencarian terbaru.
- **Filter Berdasarkan Sumber**: Pengguna dapat memilih dari berbagai sumber berita atau melihat berita dari semua sumber.
- **Daftar Berita**: Menampilkan daftar berita dengan judul, ringkasan, tanggal terbit, dan gambar.
- **Penyimpanan Riwayat Pencarian**: Menyimpan dan menampilkan riwayat pencarian terbaru pengguna.
- **Tampilan Responsif**: Dirancang untuk bekerja dengan baik di berbagai ukuran layar.

## Teknologi yang Digunakan

- **Kotlin**: Bahasa pemrograman utama untuk pengembangan Android.
- **Android Jetpack**: Menggunakan komponen Jetpack seperti LiveData, ViewModel, dan Room.
- **Retrofit**: Untuk mengambil data dari API berita.
- **Room**: Untuk penyimpanan lokal dan manajemen riwayat pencarian.
- **RecyclerView**: Untuk menampilkan daftar berita dengan tampilan yang efisien.
- **SearchView**: Untuk pencarian berita dan saran pencarian.

## API yang Digunakan

- **Spaceflight News API**: Menyediakan data berita terkait penerbangan luar angkasa. API ini menawarkan berbagai endpoint untuk mengambil berita terbaru, detail berita, dan filter berita berdasarkan kriteria tertentu. Untuk detail lebih lanjut mengenai API ini, kunjungi [Spaceflight News API Documentation](https://api.spaceflightnewsapi.net/v4/docs/).

## Instalasi dan Penggunaan

1. **Clone Repository**: 
   ```bash
   git clone https://github.com/username/repository.git
