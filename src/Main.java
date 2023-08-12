public class Main {

    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double weight = 136;
        double height = 1.69;
        int index = bmi.calculate(weight, height);
        System.out.println(index);
    }
}