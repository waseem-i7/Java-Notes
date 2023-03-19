package JavaNotes.ErrorsAndExceptions;

class InvalidInputException extends Exception {

    @Override
    public String getMessage() {
        return "Cannot add 8 and 9";
    }
}

class CannotDivideByZero extends Exception {

    @Override
    public String getMessage() {
        return "Cannot Divide by Zero";
    }
}

class MaxInputException extends Exception {

    @Override
    public String getMessage() {
        return "Input Cannot be Greater than 100000";
    }
}
class MaxMultiplyInputException extends Exception {

    @Override
    public String getMessage() {
        return "Input Cannot be Greater than 7000";
    }
}

class CustomCalculator {

    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) throws MaxMultiplyInputException {
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZero {
        if (b == 0) {
            throw new CannotDivideByZero();
        }
        return a / b;
    }
}

public class ImportantQuestionCalculator {
    public static void main(String[] args) {
        /*
         * You hava to create a custom calculator with following operations:
         * 1. + -> Addition
         * 2. - -> Subtraction
         * 3. * -> Multiplication
         * 4. / -> Division
         * which throws the following exceptions
         * 1. Invalid input Exception ex : 8&9
         * 2.Cannot divide by 0 Exception
         * 3. Max Input Exception if any of the inputs is greater than 100000
         * 4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater then 7000
         */

        CustomCalculator c = new CustomCalculator();
        try {

            System.out.println(c.add(100008, 9));
        } catch (InvalidInputException e) {

            System.out.println(e.getMessage());
        } catch (MaxInputException e) {

            throw new RuntimeException(e);
        }

        try {
            c.divide(5, 0);
        } catch (CannotDivideByZero e) {
            System.out.println(e.getMessage());
        }


        try {
            c.multiply(1000000, 12);
        } catch (MaxMultiplyInputException e) {
            System.out.println(e.getMessage());
        }

    }
}
