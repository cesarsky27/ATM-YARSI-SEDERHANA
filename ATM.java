import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        int pilihan,tambah,kurang,hasil,simpan;
        int saldo = 50000;
        Scanner input = new Scanner (System.in);
        while (true) {
            System.out.println("===== Selamat datang di ATM YARSI =====");
            System.out.println("-1. LIHAT SALDO");
            System.out.println("-2. MENABUNG");
            System.out.println("-3. TARIK TUNAI");
            System.out.println("-4. EXIT");
            System.out.println("======================================");
            System.out.print("Masukan Pilihan anda: ");
            pilihan = Integer.parseInt(input.next());

            switch (pilihan) {
                case 1 :
                    System.out.println("Saldo anda adalah: Rp. "+saldo);
                    break;

                    case 2:
                      System.out.print("Masukan Jumlah Uang Yang Ingin Anda Tabung = Rp. ");
     tambah = input.nextInt();
     saldo += tambah;
                    System.out.println("Saldo anda adalah Rp." + saldo);
                       break;
   
   case 3 :
     System.out.print("Masukan Jumlah Uang Yang Ingin Anda Ambil = Rp. ");
     kurang = input.nextInt(); 
                    System.out.println("Saldo anda adalah Rp.");
     System.out.println(saldo-kurang);
     simpan = saldo - kurang;
       if (simpan < 50000) {
                          System.out.println("Saldo anda adalah Rp." + saldo + " batas minimal saldo Rp.50000");
                       } else {
                           System.out.println("Saldo anda adalah Rp." + simpan);
                     }
                       break;
   
   case 4 :
    System.exit(0);
   break;
   
   default:
                      System.out.println("Anda Harus memilih menu (1,2,3,4)");
                      break;
   }
 }
 }
}  