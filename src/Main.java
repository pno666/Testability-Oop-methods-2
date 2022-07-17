public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int growth = 250;
        int weight = 50;
        double bmiResult = service.calculate(growth, weight);
        System.out.println("Приблизительный индекс массы тела составляет: " + bmiResult);
    }
}
