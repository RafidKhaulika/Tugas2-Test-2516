package soal1;

/**
 * Kelas untuk menguji hierarki perangkat pada Soal 1.
 */
public class TesSoal1{

    /**
     * Membuat tiga perangkat lalu mencetak keterangan, pajak, dan harga promonya.
     *
     * @param args untuk argumen baris perintah
     */
    public static void main(String[] args){
        Laptop l = new Laptop("ThinkPad", 8000000, 24, 16, 14.0);
        Ponsel p = new Ponsel("Samsung", 5000000, 12, 128, 3);
        LaptopGaming g = new LaptopGaming("Victus", 16000000, 12, 32, 15.6, "RTX 4060");

        System.out.println(l.infoSingkat());
        System.out.println(p.infoSingkat());
        System.out.println(g.infoSingkat());
        System.out.printf("Pajak laptop: Rp%.0f%n", l.hitungPajak());
        System.out.printf("Promo laptop 10 persen: Rp%.0f%n", l.hitungHargaPromo(10));
    }
}