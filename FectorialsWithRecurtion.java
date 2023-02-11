package design.test;

public class FectorialsWithRecurtion {
    public static void main(String[] args) {

        System.out.println(fectorial(6));

    }

    public static int fectorial(int number) {

        return (number <= 1) ? number: number * fectorial(number - 1);

    }
}
