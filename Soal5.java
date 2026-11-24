public class Soal5 {
    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) { //perulangan luar 

            for (int j = 0; j <= i; j++) { //perulangan dalam 
                System.out.print(j + "");
            }
            
            System.out.println();
        }
    }
}
