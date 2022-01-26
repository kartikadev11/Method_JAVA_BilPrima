import java.util.Scanner;

public class MethodBilPrima {
    private static void CetakJudul(){
        String nim;
        String nama;
        String kelas;
        String  Tugas;
        nim = "21090097";
        nama = "Kartika Deviani";
        kelas = "1C";
        Tugas= "Bilangan Prima";
        System.out.println("NIM  : "+nim);
        System.out.println("NAMA : "+nama);
        System.out.println("KELAS: "+kelas);
        System.out.println("TUGAS: "+Tugas);

    }
    private static void HitungBilanganPrima(){
        Scanner inputangka = new Scanner(System.in);
        System.out.println("\nMasukkan Angka = ");
        int angka;
        int c;
        c = 0;
        angka = inputangka.nextInt();

        //Bilangan Prima adalah bilangan yang hanya memiliki 2 faktor pembagi
        // yaitu 1 (satu) dan bilangan itu sendiri
        for (int b = 1; b <= angka; b++){
            if (angka%b == 0){
                c++;
            }
        }
        if (c == 2){ // Karena Bilangan Prima hanya memiliki 2 faktor pembagi ,maka c harus sama dengan 2
            System.out.println(angka+" Adalah Bilangan Prima");
        }else {
            System.out.println(angka+" BUKAN Bilangan Prima");
        }
    }

    public static void main(String[] args) {
        CetakJudul();
        System.out.println("\n");
        HitungBilanganPrima();

    }

}
