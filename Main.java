import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        boolean Lanjutkan = true;
        boolean kembali = false;

        Bus[] kendaraanBUS = new Bus[2];
        kendaraanBUS[0] = new Bus("Bus", "Bpk. Jamaludin", "AG 7904 FH", 24, 6, true, 24);
        kendaraanBUS[1] = new Bus("Bus", "Bpk. Dokoni", "A 4580 BU", 23, 4, false, 23);

        Truk[] kendaraanTRUK = new Truk[2];
        kendaraanTRUK[0] = new Truk("Truk", "Bpk. Wahyudin", "H 3709 AB", 2, 40, "Terbuka");
        kendaraanTRUK[1] = new Truk("Truk", "Bpk. Haikal", "P 8920 CK", 3, 55, "Tertutup");

        while(Lanjutkan || kembali){
            System.out.println("=================== SELAMAT DATANG ===================");
            System.out.println("1. Jenis kendaraan");
            System.out.println("2. EXIT");

            System.out.print("Silahkan masukkan angka: ");
            pilih = input.nextInt();

            switch (pilih) {
                //Pilih jenis kendaraan
                case 1:
                    System.out.println(" ");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("PILIH JENIS KENDARAAN TERSEDIA: ");
                    System.out.println("1. Bus");
                    System.out.println("2. Truk");
                    System.out.print("Silahkan masukkan angka: ");
                    int pilihJenis = input.nextInt();

                        switch (pilihJenis) {
                            //Jenis kendaraan bus
                            case 1:
                                System.out.println(" ");
                                System.out.println("******** DAFTAR BUS ********");
                                    for (int i = 0; i < kendaraanBUS.length; i++){
                                        System.out.println(" ");
                                        System.out.println("Kendaraan ke-" + (i+1));
                                        kendaraanBUS[i].informasiKendaraan();
                                    }
                                System.out.println(" ");
                                System.out.print("Silahkan pilih Bus nomor berapa? ");
                                int nomorBus = input.nextInt();
                                    switch (nomorBus) {
                                        //jenis bus 1
                                        case 1:
                                        int menuBUS1;
                                            do {
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println("=== SELAMAT DATANG DI BUS NOPOL [AG 7904 FH] ===");
                                                kendaraanBUS[0].informasiKendaraan();
                                                kendaraanBUS[0].informasiBUS();
                                                System.out.println(" ");
                                                System.out.println("Pilihan Menu");
                                                System.out.println("1. Naik");
                                                System.out.println("2. Turun");
                                                System.out.println("3. Cek Penumpang");
                                                System.out.println("4. Cek status bus");
                                                System.out.println("5. Keluar");
                                                System.out.print("Silahkan masukkan angka: ");
                                                menuBUS1 = input.nextInt();
                                                        
                                                    switch (menuBUS1) {
                                                        //menubus 1
                                                        case 1:
                                                            System.out.println(" ");
                                                            System.out.print("Berapa jumlah penumpang naik? ");
                                                            int naik = input.nextInt();
                                                            kendaraanBUS[0].penumpangNaik(naik);
                                                            break;
                                                        case 2:
                                                            System.out.println(" ");
                                                            System.out.print("Berapa jumlah penumpang turun? ");
                                                            int turun = input.nextInt();
                                                            kendaraanBUS[0].penumpangTurun(turun);
                                                            break;
                                                        case 3:
                                                            kendaraanBUS[0].cekPenumpang();
                                                            break;
                                                        case 4:
                                                            kendaraanBUS[0].antarPenumpang();
                                                            break;
                                                        case 5:
                                                            System.out.println("Terima kasih!");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                                            continue;
                                                    }
                                                    System.out.println(" ");
                                                    System.out.println("Apakah anda ingin melanjutkan aktifitas? ");
                                                    System.out.println("1. Ya");
                                                    System.out.println("2. Tidak");
                                                    System.out.print("Silahkan masukkan angka: ");
                                                    int lanjutBUS1 = input.nextInt();

                                                    if(lanjutBUS1 == 2){
                                                        break;
                                                    } else if (!(lanjutBUS1 == 1)){
                                                        System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                                    }


                                           } while (menuBUS1 != 4); 
                                            break;
                                        //jenis bus2        
                                        case 2:
                                        int menuBUS2;
                                            do {
                                                System.out.println(" ");
                                                System.out.println(" ");
                                                System.out.println("=== SELAMAT DATANG DI BUS NOPOL [A 4580 BU] ===");
                                                kendaraanBUS[1].informasiKendaraan();
                                                kendaraanBUS[1].informasiBUS();
                                                System.out.println(" ");
                                                System.out.println("Pilihan Menu");
                                                System.out.println("1. Naik");
                                                System.out.println("2. Turun");
                                                System.out.println("3. Cek Penumpang");
                                                System.out.println("4. Cek status penumpang");
                                                System.out.println("5. Keluar");
                                                System.out.print("Silahkan masukkan angka: ");
                                                menuBUS2 = input.nextInt();
                                                    
                                                    switch (menuBUS2) {
                                                        case 1:
                                                            System.out.println(" ");
                                                            System.out.print("Berapa jumlah penumpang naik? ");
                                                            int naik = input.nextInt();
                                                            kendaraanBUS[1].penumpangNaik(naik);
                                                            break;
                                                        case 2:
                                                            System.out.println(" ");
                                                            System.out.print("Berapa jumlah penumpang turun? ");
                                                            int turun = input.nextInt();
                                                            kendaraanBUS[1].penumpangTurun(turun);
                                                            break;
                                                        case 3:
                                                            kendaraanBUS[1].cekPenumpang();
                                                            break;
                                                        case 4:
                                                            kendaraanBUS[1].jemputPenumpang();
                                                            break;
                                                        case 5:
                                                            System.out.println("Terima kasih!");
                                                            break;
                                                        default:
                                                            System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                                            continue;
                                                    }
                                                    System.out.println(" ");
                                                    System.out.println("Apakah anda ingin melanjutkan aktifitas? ");
                                                    System.out.println("1. Ya");
                                                    System.out.println("2. Tidak");
                                                    System.out.print("Silahkan masukkan angka: ");
                                                    int lanjutBUS2 = input.nextInt();

                                                    if(lanjutBUS2 == 2){
                                                        break;
                                                    } else if (!(lanjutBUS2 == 1)){
                                                        System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                                    }
                                            } while (menuBUS2 != 4); 
                                                break;
                                        //default jenis bus
                                        default:
                                        System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                            break;
                                    }
                                    break;
                            //jenis kendaraan truk
                            case 2:
                                System.out.println(" ");
                                System.out.println("******** DAFTAR TRUK ********");
                                    for (int i = 0; i < kendaraanTRUK.length; i++){
                                    System.out.println(" ");
                                    System.out.println("Kendaraan ke-" + (i+1));
                                    kendaraanTRUK[i].informasiKendaraan();
                                    }
                                System.out.println(" ");
                                System.out.print("Silahkan pilih TRUK nomor berapa? ");
                                int nomorTRUK = input.nextInt();
                                
                                switch (nomorTRUK) {
                                    //truk1
                                    case 1:
                                    int menuTRUK1;
                                        do {
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println("=== SELAMAT DATANG DI TRUK NOPOL [P 8920 CK] ===");
                                            kendaraanTRUK[0].informasiKendaraan();
                                            kendaraanTRUK[0].informasiTRUK();
                                            System.out.println(" ");
                                            System.out.println("Pilihan Menu");
                                            System.out.println("1. Penumpang naik");
                                            System.out.println("2. Penumpang Turun");
                                            System.out.println("3. Cek Penumpang");
                                            System.out.println("4. Menaikkan muatan");
                                            System.out.println("5. Menurunkan muatan");
                                            System.out.println("6. Cek berat muatan");
                                            System.out.println("7. Status barang di truk");
                                            System.out.println("8. Keluar");
                                            System.out.print("Silahkan masukkan angka: ");
                                            menuTRUK1 = input.nextInt();
                                            
                                            switch (menuTRUK1) {
                                                case 1:
                                                    System.out.println(" ");
                                                    System.out.print("Berapa jumlah penumpang naik? ");
                                                    int naik = input.nextInt();
                                                    kendaraanTRUK[0].penumpangNaik(naik);
                                                    break;
                                                case 2:
                                                    System.out.print("Berapa jumlah penumpang turun? ");
                                                    int turun = input.nextInt();
                                                    kendaraanTRUK[0].penumpangTurun(turun);
                                                    break;
                                                case 3:
                                                    kendaraanTRUK[0].cekPenumpang();
                                                    break;
                                                case 4:
                                                    System.out.println(" ");
                                                    System.out.print("Masukkan jumlah berat muatan: ");
                                                    int tambah = input.nextInt();
                                                    kendaraanTRUK[0].tambahMuatan(tambah);
                                                    break;
                                                case 5:
                                                    System.out.print("Masukkan jumlah berat muatan: ");
                                                    int kurang = input.nextInt();
                                                    kendaraanTRUK[0].MuatanTurun(kurang);
                                                    break;
                                                case 6:
                                                    kendaraanTRUK[0].cekMuatan();
                                                    break;
                                                case 7:
                                                    kendaraanTRUK[0].angkutBarang();
                                                    break;
                                                case 8:
                                                    System.out.println("Terima kasih!");
                                                    break;
                                                default:
                                                    System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                                    continue;
                                            }
                                            System.out.println(" ");
                                            System.out.println("Apakah anda ingin melanjutkan aktifitas? ");
                                            System.out.println("1. Ya");
                                            System.out.println("2. Tidak");
                                            System.out.print("Silahkan masukkan angka: ");
                                            int lanjutTRUK1= input.nextInt();

                                            if(lanjutTRUK1 == 2){
                                                break;
                                            } else if (!(lanjutTRUK1 == 1)){
                                                System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                            }
                                        } while (menuTRUK1!= 4); 
                                            break;

                                    case 2:
                                    int menuTRUK2;
                                        do {
                                            System.out.println(" ");
                                            System.out.println(" ");
                                            System.out.println("=== SELAMAT DATANG DI TRUK NOPOL [P 8920 CK] ===");
                                            kendaraanTRUK[1].informasiKendaraan();
                                            kendaraanTRUK[1].informasiTRUK();
                                            System.out.println(" ");
                                            System.out.println("Pilihan Menu");
                                            System.out.println("1. Penumpang naik");
                                            System.out.println("2. Penumpang Turun");
                                            System.out.println("3. Cek Penumpang");
                                            System.out.println("4. Menaikkan muatan");
                                            System.out.println("5. Menurunkan muatan");
                                            System.out.println("6. Cek berat muatan");
                                            System.out.println("7. Status barang di truk");
                                            System.out.println("8. Keluar");
                                            System.out.print("Silahkan masukkan angka: ");
                                            menuTRUK2 = input.nextInt();
                                            
                                            switch (menuTRUK2) {
                                                case 1:
                                                    System.out.println(" ");
                                                    System.out.print("Berapa jumlah penumpang naik?");
                                                    int naik = input.nextInt();
                                                    kendaraanTRUK[1].penumpangNaik(naik);
                                                    break;
                                                case 2:
                                                    System.out.println("Berapa jumlah penumpang turun?");
                                                    System.out.print("Masukkan angka: ");
                                                    int turun = input.nextInt();
                                                    kendaraanTRUK[1].penumpangTurun(turun);
                                                    break;
                                                case 3:
                                                    kendaraanTRUK[1].cekPenumpang();
                                                    break;
                                                case 4:
                                                    System.out.println(" ");
                                                    System.out.print("Masukkan jumlah berat muatan: ");
                                                    int tambah = input.nextInt();
                                                    kendaraanTRUK[1].tambahMuatan(tambah);
                                                    break;
                                                case 5:
                                                    System.out.print("Masukkan jumlah berat muatan: ");
                                                    int kurang = input.nextInt();
                                                    kendaraanTRUK[1].MuatanTurun(kurang);
                                                    break;
                                                case 6:
                                                    kendaraanTRUK[1].cekMuatan();
                                                    break;
                                                case 7:
                                                    kendaraanTRUK[1].angkutBarang();
                                                    break;
                                                case 8:
                                                    System.out.println("Terima kasih!");
                                                    break;
                                                default:
                                                    System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                                    continue;
                                            }
                                            System.out.println(" ");
                                            System.out.println("Apakah anda ingin melanjutkan aktifitas? ");
                                            System.out.println("1. Ya");
                                            System.out.println("2. Tidak");
                                            System.out.print("Silahkan masukkan angka: ");
                                            int lanjutTRUK1= input.nextInt();

                                            if(lanjutTRUK1 == 2){
                                                break;
                                            } else if (!(lanjutTRUK1 == 1)){
                                                System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                            }
                                        } while (menuTRUK2!= 4); 
                                            break;
                                }

                            case 3:
                                kembali = true;
                                break;

                            default:
                                System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                                break;
                        }
                        break;

                case 2:
                    System.out.println("Terimakasih!");
                    break;
                default:
                        System.out.println("Pilihan tidak valid! Silahkan masukkan kembali angka pilihan.");
                    break;
            }
            break;
        }
    }
}
