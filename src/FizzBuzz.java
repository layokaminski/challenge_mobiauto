public class FizzBuzz {

    public static int MAX_RANGE = 100;

    public static void execute() {
        for (int index = 1; index <= MAX_RANGE; index++) {
            if (index % 3 == 0 && index % 5 == 0) System.out.println("FizzBuzz");
            else if (index % 3 == 0) System.out.println("Fizz");
            else if (index % 5 == 0) System.out.println("Buzz");
            else System.out.println(index);
        }
    }
}