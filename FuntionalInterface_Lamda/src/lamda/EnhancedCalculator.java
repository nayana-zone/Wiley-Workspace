package lamda;

    interface Operation{
	double operation(int num1,int num2,double num3);
    }

    public class EnhancedCalculator{
	 public static double calculate(int num1, int num2, double num3, Operation operation) {
	        return operation.operation(num1, num2, num3);
	    }

	 public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 5;
	        double num3 = 2.5;

	        // Addition operation
	        double additionResult = calculate(num1, num2, num3, (a, b, c) -> a + b + c);
	        System.out.println("Addition Result: " + additionResult);
	        
	        double subtractionResult = calculate(num1, num2, num3, (a, b, c) -> a - b - c);
	        System.out.println("Subtraction Result: " + subtractionResult);

	        double multiplicationResult = calculate(num1, num2, num3, (a, b, c) -> a * b * c);
	        System.out.println("Multiplication Result: " + multiplicationResult);

	        double divisionResult = calculate(num1, num2, num3, (a, b, c) -> {
	            if (b != 0) {
	                return (double) (a) / (double) (b) / c;
	            } else {
	                System.out.println("Division by zero is not allowed.");
	                return 0;
	            }
	        }
	        );
	        System.out.println("Division Result: " + divisionResult);
	}
    }

