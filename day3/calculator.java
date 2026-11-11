void main(){

    double x = 0.0;
    double y = 0.0;
    int choice = 0;
    double result = 0.0;

    String firstNum = IO.readln("Enter first number: " );
    x = Double.parseDouble(firstNum);
    String secNum = IO.readln("Enter second number: ");
    y = Double.parseDouble(secNum);

    IO.println("1. Addition");
    IO.println("2. Subtraction");
    IO.println("3. Multiplication");
    IO.println("4. Division");
    String choicePrompt = IO.readln("What Operation would you like to use?: ");
    choice = Integer.parseInt(choicePrompt);

    switch(choice){
        case 1:
            IO.println("Addition");
            result = x + y;
            IO.println("Result: " + result);
            break;
        case 2:
            IO.println("Subtraction");
            result = x - y;
            IO.println("Result: " + result);
            break;
        case 3:
            IO.println("Multiplication");
            result = x * y;
            IO.println("Result: " + result);
            break;
        case 4:
            if (y == 0){
                IO.println("Error cannot divide by zero.");
                return;
            } else {
                IO.println("Division");
                result = x / y;
                IO.println("Result: " + result);
            }
            break;
        default:
            IO.println("Error not on the choices!");
    }

}
