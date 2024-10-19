
package tokobuku;

import buku.Buku;
import toko.Toko;    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Toko toko = new Toko();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Toko Buku ===");
            System.out.println("1. Tampilkan Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Cari Buku Berdasarkan Judul");
            System.out.println("4. Hapus Buku");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    toko.tampilkanBuku();
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan harga buku: ");
                    double harga = scanner.nextDouble();
                    Buku buku = new Buku(judul, penulis, harga);
                    toko.tambahBuku(buku);
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang ingin dicari: ");
                    String judulCari = scanner.nextLine();
                    toko.cariBuku(judulCari);
                    break;
                case 4:
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String judulHapus = scanner.nextLine();
                    toko.hapusBuku(judulHapus);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);
        scanner.close();
    }
}
