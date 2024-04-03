public class Kendaraan {
    String jenisKendaraan, driver, platNomor;
    int jmlPenumpang, maxPenumpang;

    Kendaraan(String jns, String  drv, String plat, int max){
        this.jenisKendaraan = jns;
        this.driver = drv;
        this.platNomor = plat;
        this.maxPenumpang = max;
        this.jmlPenumpang = 0;
    }

    public void informasiKendaraan(){
        System.out.println("Jenis Kendaraan     : "+jenisKendaraan);
        System.out.println("Driver              : "+driver);
        System.out.println("Plat nomor          : "+platNomor);
        System.out.println("Kapasitas penumpang : "+maxPenumpang);
    }

    public void cekPenumpang(){
        System.out.println("Penumpang saat ini: "+this.jmlPenumpang);
        System.out.println("------------------------------------------");
    }

    public void penumpangNaik(int naik){
        int current = this.jmlPenumpang;
        if (current + naik > this.maxPenumpang){
            System.out.println("------------------------------------------");
            System.out.println("Maaf penumpang melebihi kapasitas");
        }
        else{
            this.jmlPenumpang += naik;
            System.out.println("------------------------------------------");
            System.out.println("Penumpang berhasil naik!");
        }
        cekPenumpang();
    }

    public void penumpangTurun(int turun){
        int current = this.jmlPenumpang;
        if (current - turun < 0){
            System.out.println("------------------------------------------");
            System.out.println("Maaf penumpang ghoib yang turun");
        }
        else{
            this.jmlPenumpang -= turun;
            System.out.println("------------------------------------------");
            System.out.println("Penumpang berhasil turun");
        }
        cekPenumpang();
    }

}
