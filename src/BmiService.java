public class BmiService {
    public static double calculate(double mass , double height) {
        double bmi = mass / height / height;
        return bmi;
    }
}