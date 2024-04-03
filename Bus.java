public class Bus extends Kendaraan {
    private int jmlBagasi;
    private boolean toilet;
    private int jmlKursi;

    public Bus(String jns, String drv, String plat, int max, int jmlBagasi, boolean toilet, int jmlKursi) {
        super(jns, drv, plat, max);
        this.jmlBagasi = jmlBagasi;
        this.toilet = toilet;
        this.jmlKursi = jmlKursi;
    }

    public void informasiBUS() {
        System.out.println(" ");
        System.out.println("================ FASILITAS BUS =================");
        System.out.println("Jumlah bagasi bus : " + jmlBagasi);
        System.out.println("Memiliki toilet   : " + (toilet ? "Ya" : "Tidak"));
        System.out.println("Jumlah kursi bus  : " + jmlKursi);
    }

    public void antarPenumpang() {
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("Bus sedang mengantar penumpang ke terminal");
        System.out.println("------------------------------------------");
    }

    public void jemputPenumpang() {
        System.out.println(" ");
        System.out.println("------------------------------------------");
        System.out.println("Bus sedang menjemput penumpang di terminal");
        System.out.println("------------------------------------------");
    }
}
