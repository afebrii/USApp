package com.afebrii.usapp.data

import com.afebrii.usapp.R
import com.afebrii.usapp.model.Gallery
import com.afebrii.usapp.model.Jurusan
import com.afebrii.usapp.model.Pimpinan

object DummyData {
    val pimpinanUniv = listOf(
        Pimpinan(
            id = 1,
            name = "Dr. Ir. Nundang Busaeri, M.T., IPU., ASEAN Eng.",
            jabatan = "Rektor",
//            email = "nundangb@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.rektor
        ),
        Pimpinan(
            id = 2,
            name = "Prof. Dr. Dedi Kusmayadi, S.E., M.Si., Ak., CA., CRA., CRP., ACPA., CPA.",
            jabatan = "Wakil Rektor Bidang Akademik",
//            email = "dedikusmayadi@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.wakil_rektor_bidang_akademik
        ),
        Pimpinan(
            id = 3,
            name = "Dr. Gumilar Mulya, Drs., M.Pd.",
            jabatan = "Wakil Rektor Bidang Keuangan dan Umum",
//            email = "gumilarmulya@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.wakil_rektor_bidang_keuangan_dan_umum
        ),
        Pimpinan(
            id = 4,
            name = "Dr. Asep Suryana Abdurrahmat, S.Pd., M.Kes.",
            jabatan = "Wakil Rektor Bidang Kemahasiswaan dan Alumni",
//            email = "asepsuryana@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.wakil_rektor_bidang_kemahasiswaan_dan_alumni
        ),
        Pimpinan(
            id = 5,
            name = "Dr. Nani Ratnaningsih, Dra., M.Pd.",
            jabatan = "Dekan Fakultas Keguruan dan Ilmu Pendidikan",
//            email = "ratnaningsing@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.dekan_fakultas_keguruan_dan_ilmu_pendidikan
        ),
        Pimpinan(
            id = 6,
            name = "Dr. Ade Komaludin, S.E., M.Sc.",
            jabatan = "Dekan Fakultas Ekonomi dan Bisnis",
//            email = "adekomaludin@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.dekan_fakultas_ekonomi_dan_bisnis
        ),
        Pimpinan(
            id = 7,
            name = "Dr. Rina Nuryati, Ir., M.P.",
            jabatan = "Dekan Fakultas Pertanian",
//            email = "rinanuryati@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.dekan_fakultas_pertanian
        ),
        Pimpinan(
            id = 8,
            name = "Prof. Dr. Eng. Ir. Aripin",
            jabatan = "Dekan Fakultas Teknik",
//            email = "aripin@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.dekan_fakultas_teknik
        ),
        Pimpinan(
            id = 9,
            name = "Dr. Asep Suryanto, S. Ag., M.Ag.",
            jabatan = "Dekan Fakultas Agama Islam",
//            email = "asepsuryanto@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.dekan_fakultas_agama_islam
        ),
        Pimpinan(
            id = 10,
            name = "Dian Saraswati, S.Pd., M.Kes.",
            jabatan = "Dekan Fakultas Ilmu Kesehatan",
//            email = "diansaraswati@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.dekan_fakultas_ilmu_kesehatan
        ),
        Pimpinan(
            id = 11,
            name = "Nina Herlina, Dra., M.T.",
            jabatan = "Dekan Fakultas Ilmu Sosial dan Ilmu Politik",
//            email = "ninaherlina@unsil.ac.id",
//            alamat = "Gd. Rektorat Unsil Jln. Siliwangi no. 24 Kahuripan Tasikmalaya 46115",
            photo = R.drawable.dekan_fakultas_ilmu_sosial_dan_ilmu_politik
        ),
    )

    val jurusanUniv = listOf(
        Jurusan(
            id = 1,
            namaJurusan = "Informatika",
            fakultas = "Fakultas Teknik",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 2,
            namaJurusan = "Teknik Elektro",
            fakultas = "Fakultas Teknik",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 3,
            namaJurusan = "Teknil Sipil",
            fakultas = "Fakultas Teknik",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 4,
            namaJurusan = "Sistem Informasi",
            fakultas = "Fakultas Teknik",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 5,
            namaJurusan = "Agroteknologi",
            fakultas = "Fakultas Pertanian",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 6,
            namaJurusan = "Agribisnis",
            fakultas = "Fakultas Pertanian",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 7,
            namaJurusan = "Ilmu Politik",
            fakultas = "Fakultas Ilmu Sosial dan Ilmu Politik",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 8,
            namaJurusan = "Gizi",
            fakultas = "Fakultas Ilmu Kesehatan",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 9,
            namaJurusan = "Kesehatan Masyarakat",
            fakultas = "Fakultas Ilmu Kesehatan",
            photoJurusan = R.drawable.unsil
        ),
        Jurusan(
            id = 10,
            namaJurusan = "Pendidikan Jasmani",
            fakultas = "Fakultas Keguruan dan Ilmu Pendidikan",
            photoJurusan = R.drawable.unsil
        ),
    )

    val USGalleries = listOf(
        Gallery(
            id = 1,
            name = "1",
            photo = R.drawable.gallery1
        ),
        Gallery(
            id = 2,
            name = "1",
            photo = R.drawable.gallery2
        ),Gallery(
            id = 3,
            name = "1",
            photo = R.drawable.gallery3
        ),Gallery(
            id = 4,
            name = "1",
            photo = R.drawable.gallery4
        ),Gallery(
            id = 5,
            name = "1",
            photo = R.drawable.gallery6
        ),Gallery(
            id = 6,
            name = "1",
            photo = R.drawable.gallery7
        ),Gallery(
            id = 7,
            name = "1",
            photo = R.drawable.gallery8
        ),Gallery(
            id = 8,
            name = "1",
            photo = R.drawable.gallery9
        ),Gallery(
            id = 9,
            name = "1",
            photo = R.drawable.gallery5
        ),Gallery(
            id = 10,
            name = "1",
            photo = R.drawable.gallery10
        ),
    )
}