package hw1;

public class Task1 {
    public static void main (String[] args) {
        System.out.println("Введите значение x и y");
        Double x = Double.parseDouble(System.console().readLine());
        Double y = Double.parseDouble(System.console().readLine());
        body(x, y);
    }

    private static void body (Double x, Double y) {
        if (Math.abs(x-10)<Math.abs(y-10)) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}
