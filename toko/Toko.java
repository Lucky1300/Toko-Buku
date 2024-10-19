package toko;

import buku.Buku;  // Importing the Buku class from buku package
import java.util.ArrayList;

public class Toko {
    private ArrayList<Buku> daftarBuku;

    public Toko() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam toko.");
        } else {
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
            }
        }
    }

    public void cariBuku(String judul) {
        boolean ditemukan = false;
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.tampilkanInfo();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
        }
    }

    public void hapusBuku(String judul) {
        boolean dihapus = false;
        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getJudul().equalsIgnoreCase(judul)) {
                daftarBuku.remove(i);
                System.out.println("Buku dengan judul \"" + judul + "\" berhasil dihapus.");
                dihapus = true;
                break;
            }
        }
        if (!dihapus) {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
        }
    }
}
