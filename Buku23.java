import java.util.Scanner;

public class Buku23{

        String judul, pengarang;
        int halaman, stok, harga;
        
        void tampilInformasi(){
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);
    }
    void terjual(int jml){
        if (stok >= jml && stok > 0){
            stok -= jml;
        }
    }
    void restok(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    }