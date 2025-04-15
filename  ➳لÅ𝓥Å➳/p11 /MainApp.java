import calculator.Addition;
import calculator.Subtraction;

public class MainApp {
    public static void main(String[] args) {
        Addition addObj = new Addition();
        Subtraction subObj = new Subtraction();

        int sum = addObj.add(15, 7);
        int diff = subObj.subtract(15, 7);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }
}
