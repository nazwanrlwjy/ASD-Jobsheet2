public class BukuMain23 {
    public static void main(String[] args) {

    Buku23 bk1 = new Buku23();
    bk1.judul = "Today Ends Tomorrow Comes";
    bk1.pengarang = "Denanda Pratiwi";
    bk1.halaman = 198;
    bk1.stok = 13;
    bk1.harga = 71000;

    bk1.tampilInformasi();
    bk1.terjual(5);
    bk1. gantiHarga(60000);
    bk1.tampilInformasi(); 
    System.out.println("Harga Total : "+ bk1.hitungHargaTotal(5));
    System.out.println("Harga Diskon : "+ bk1.hitungDiskon(bk1.hitungHargaTotal(5)));

    System.out.println();

    Buku23 bk2 = new Buku23("Self Reward", "Maheera Ayesha", 160, 29, 59000);
    bk2.terjual(11);
    bk2.tampilInformasi();

    Buku23 bukuNazwa = new Buku23 ("Lentera Malam", "Nazwa Nurul Wijaya", 250, 7, 100000);
    bukuNazwa.terjual(5);
    bukuNazwa.tampilInformasi();
    System.out.println("Harga total buku terjual :" + bukuNazwa.hitungHargaTotal(5));

}
}