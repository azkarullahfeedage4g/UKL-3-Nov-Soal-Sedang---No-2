import java.util.Scanner;

public class UKLNO4 {

    static double hitungVolume(double jariJari, double tinggi) {
        double volume = 3.14 * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println ("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();

        System.out.println ("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();

        double hasil = hitungVolume(r, t);

        System.out.println("Volume tabung adalah: " + hasil + " cm^3");

        input.close();
    }
}
