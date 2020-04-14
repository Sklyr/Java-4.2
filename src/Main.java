public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();


        double bmi = BmiService.calculate(80, 1.51);

        System.out.println ("Индекс массы тела: " + bmi + " кг/м^2");
    }
}
