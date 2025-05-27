
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeChecker {
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age < 18)
                throw new InvalidAgeException("Age must be 18 or older.");
            System.out.println("Age accepted.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
