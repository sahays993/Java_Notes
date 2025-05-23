public class FourthChapter {
    public static void main(String[] srgd){
        //L-10: Java Control Statements
        //Control statements are used to control the flow of execution in a program.
        //There are three types of control statements in Java:
        //1. Conditional Statements
        //2. Looping Statements
        //3. Jump Statements

        first();
        second();
        third();
    }

    public static void first(){
        //Conditional Statements
        //if statement
        int a = 10;
        if (a > 5) {
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is less than or equal to 5");
        }

        //using logical operators with conditional statements
        int b = 20;
        if (a > 5 && b > 15) {
            System.out.println("a is greater than 5 and b is greater than 15");
        } else {
            System.out.println("Either a is less than or equal to 5 or b is less than or equal to 15");
        }
        if (a > 5 || b > 15) {
            System.out.println("a is greater than 5 and b is greater than 15");
        } else {
            System.out.println("Either a is less than or equal to 5 or b is less than or equal to 15");
        }


        //switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void second(){
        //Looping Statements
        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
        }

        //while loop
        int j = 0;
        while (j < 5) {
            System.out.println("j is: " + j);
            j++;
        }

        //do-while loop
        int k = 0;
        do {
            System.out.println("k is: " + k);
            k++;
        } while (k < 5);
    }

     //L-11
     public static void third(){
        //Jump Statements
        //break statement
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("i is: " + i);
        }

        //continue statement
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue; // Skip the iteration when i is 3
            }
            System.out.println("i is: " + i);
        }

        //return statement
        System.out.println("The sum of 5 and 10 is: " + sum(5, 10)); // Call the sum method

    }

    public static int sum(int a, int b) {
        return a + b; // Return the sum of a and b
}
    
}
