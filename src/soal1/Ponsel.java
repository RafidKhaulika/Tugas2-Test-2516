package soal1;

/**
 * Ponsel adalah jenis perangkat yang punya kapasitas penyimpanan dan jumlah kamera.
 * Kelas ini mewarisi data merek, harga, dan garansi dari Perangkat.
 */
public class Ponsel extends Perangkat{

    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Membuat ponsel baru.
     *
     * @param merek untuk merek ponsel, tidak boleh kosong
     * @param harga untuk harga ponsel, tidak boleh negatif
     * @param garansiBulan untuk lama garansi dalam bulan
     * @param kapasitasGb untuk kapasitas penyimpanan dalam gigabyte
     * @param jumlahKamera untuk jumlah kamera pada ponsel
     * @throws IllegalArgumentException jika merek kosong atau harga negatif
     */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera){
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * Membuat keterangan singkat ponsel.
     *
     * @return teks berisi merek, garansi, kapasitas, dan jumlah kamera
     */
    @Override
    public String infoSingkat(){
        return super.infoSingkat() + " | " + this.kapasitasGb + " GB | " + this.jumlahKamera + " kamera";
    }
}