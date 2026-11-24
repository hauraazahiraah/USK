import javax.swing.JOptionPane;

public class Soal3 {

    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1 : "));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2 : "));
        int nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 3 :" ));

        double rata = (nilai1 + nilai2 + nilai3) / 3.0; 

        System.out.println("Rata-rata : " + rata);

        String hasil;
        if (rata >= 60) {
            hasil = "Lulus";
        } else {
            hasil = "Gagal";
        }

             JOptionPane.showMessageDialog(null,
                            "Nilai1 : " + nilai1 + 
                            "\nNilai2 : " + nilai2 + 
                            "\nRata-rata : " + rata +
                            "\nHasil : " + hasil 
            );

        }
    }
