public class BmiService {
    static double square(double a) {
        double result = a * a;

        return result;
    }

    public double calculate(int growth, int weight) {
        double bMI;
        double gM = growth / 100;
        bMI = weight / square(gM);
        return bMI;
    }
}
