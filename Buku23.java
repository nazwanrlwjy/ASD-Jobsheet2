public class Buku23{

        String judul, pengarang;
        int halaman, stok, harga;

        public Buku23(){}

    
        public Buku23(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
    }
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

    int hitungHargaTotal(int jml) {
        return this.harga * jml;
     }
  
     int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
           return (int)((double)hargaTotal * 0.12);
        } else {
           return hargaTotal >= 75000 && hargaTotal <= 150000 ? (int)((double)hargaTotal * 0.05) : 0;
        }
     }
  
     int hitungHargaBayar(int hargaTotal, double diskon) {
        return hargaTotal - (int)diskon;
     }
    }