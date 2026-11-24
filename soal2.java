import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Harga Barang : ");
        double harga = input.nextDouble();

        System.out.print("Diskon : ");
        double diskon = input.nextDouble(); 

        double diskonRp = harga * diskon / 100; 
        double totalHarga = harga - diskonRp;
        
        System.out.println("Diskon : " + (int)diskon + "%"); 
        System.out.printf("Diskon (Rp.) : Rp. %,.0f%n", diskonRp);
        System.out.printf("TotalHarga : Rp. %,.0f%n", totalHarga);

        input.close();
    }
}
