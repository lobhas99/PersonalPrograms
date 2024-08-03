package Mathematics; 
public class SquareRoot {
    public static void main(String[] args) {
        int number=9876;
        if (number == 0) {
            System.out.println("0");;
        }

        // Initial guess
        float guess = number / 2.0f;

        // Tolerance level
        float tolerance = 0.01f;

        // Iterate until the difference is within the tolerance level
        while (Math.abs(guess * guess - number) > tolerance) {
            guess = (guess + number / guess) / 2.0f;
            System.out.println(guess);
        }

        System.out.println(guess);
    }
}
