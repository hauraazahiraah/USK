import javax.swing.JOptionPane;

public class Soal4 {
    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1 : "));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2 : ")); 

        int kali = nilai1 * nilai2;

        String pesan = "Nilai 1 : " + nilai1 + "\n"
                     + "Nilai 2 : " + nilai2 + "\n"
                     + "Hasil   : " + kali; 

        JOptionPane.showMessageDialog(null, pesan);

    }
    
}
