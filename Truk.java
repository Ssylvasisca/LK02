public class Truk extends Kendaraan{
    private int kapasitasMuatan;
    private String jenisBak;
    private int jumlahMuatan;

    public Truk (String jns, String drv, String plat, int max, int kapasitasMuatan, String jenisBak){
        super (jns, drv, plat, max);
        this.kapasitasMuatan = kapasitasMuatan;
        this.jenisBak = jenisBak;
        this.jumlahMuatan = 0;
    }
    public void informasiTRUK (){
        System.out.println("====== FASILITAS TRUK ======");
        System.out.println("Kapasitas muatan truk : "+kapasitasMuatan+" ton");
        System.out.println("Jenis Bak             : "+jenisBak);
    }
    public void angkutBarang(){
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("Truk sedang menganggkut barang berat");
        System.out.println("------------------------------------------");
    }
    public void turunkanBarang(){
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("Truk sedang menurunkan barang berat");
        System.out.println("------------------------------------------");
    }

    public void cekMuatan(){
        System.out.println("Muatan saat ini        : "+this.jumlahMuatan);
        System.out.println("------------------------------------------");
    }
    public void tambahMuatan(int tambah){
        System.out.println("Masukkan berat muatan yang akan diangkut : "+tambah);
        int current = this.jumlahMuatan;
        if (current + tambah > this.kapasitasMuatan){
            System.out.println("------------------------------------------");
            System.out.println("Maaf berat muatan melebihi kapasitas");
        }
        else{
            this.jumlahMuatan += tambah;
            System.out.println("------------------------------------------");
            System.out.println("Muatan berhasil diangkut");
        }
        cekMuatan();
    }

    public void MuatanTurun(int kurang){
        System.out.println("Masukkan berat muatan yang akan diangkut : "+kurang);
        int current = this.jumlahMuatan;
        if (current - kurang < 0){
            System.out.println("------------------------------------------");
            System.out.println("Maaf tidak ada lagi muatan yang tesisa");
        }
        else{
            this.jumlahMuatan -= kurang;
            System.out.println("------------------------------------------");
            System.out.println("Muatan berhasil diturunkan");
        }
        cekMuatan();
    }
}