public class SecondChapter {
    public static void main(String[] args) {
       first();
       second();
       third();
    }

    public static void first(){
         //L-5: Java Operators
        //Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println("The value of a + b is: " + (a + b)); // Addition
        System.out.println("The value of a - b is: " + (a - b)); // Subtraction
        System.out.println("The value of a * b is: " + (a * b)); // Multiplication
        System.out.println("The value of a / b is: " + (a / b)); // Division
        System.out.println("The value of a % b is: " + (a % b)); // Modulus

        //Relational Operators
        System.out.println("The value of a == b is: " + (a == b)); // Equal to
        System.out.println("The value of a != b is: " + (a != b)); // Not equal to
        System.out.println("The value of a > b is: " + (a > b)); // Greater than
        System.out.println("The value of a < b is: " + (a < b)); // Less than
        System.out.println("The value of a >= b is: " + (a >= b)); // Greater than or equal to
        System.out.println("The value of a <= b is: " + (a <= b)); // Less than or equal to

        //Assignment Operators
        int c = 5; // Assign 5 to c
        c += 3; // c = c + 3
        System.out.println("The value of c += 3 is: " + c); // c = 8
        c -= 2; // c = c - 2
        System.out.println("The value of c -= 2 is: " + c); // c = 6
        c *= 2; // c = c * 2
        System.out.println("The value of c *= 2 is: " + c); // c = 12   
        c /= 3; // c = c / 3
        System.out.println("The value of c /= 3 is: " + c); // c = 4
        c %= 2; // c = c % 2
        System.out.println("The value of c %= 2 is: " + c); // c = 0
        c &= 1; // c = c & 1
        System.out.println("The value of c &= 1 is: " + c); // c = 0
        c |= 1; // c = c | 1

        //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("The value of x && y is: " + (x && y)); // Logical AND
        System.out.println("The value of x || y is: " + (x || y)); // Logical OR
        System.out.println("The value of !x is: " + (!x)); // Logical NOT

        //Bitwise Operators
        int p = 5; // 0101 in binary
        int q = 3; // 0011 in binary
        System.out.println("The value of p & q is: " + (p & q)); // Bitwise AND
        System.out.println("The value of p | q is: " + (p | q)); // Bitwise OR
        System.out.println("The value of p ^ q is: " + (p ^ q)); // Bitwise XOR
        System.out.println("The value of ~p is: " + (~p)); // Bitwise NOT
        System.out.println("The value of p << 1 is: " + (p << 1)); // Left shift
        System.out.println("The value of p >> 1 is: " + (p >> 1)); // Right shift
        System.out.println("The value of p >>> 1 is: " + (p >>> 1)); // Unsigned right shift

    }

    public static void second(){
        //L-6: OPerator Precedence and Associativity

        //Operator Precedence: The order in which operators are evaluated in an expression.
        //Operator Associativity: The order in which operators of the same precedence are evaluated.
        //For example, in the expression 5 + 3 * 2, the multiplication operator (*) has higher precedence than the addition operator (+), so the multiplication is performed first.
        //The result is 5 + (3 * 2) = 5 + 6 = 11.
        //In the expression 5 + 3 - 2, the addition and subtraction operators have the same precedence, so they are evaluated from left to right.
       

        //L-7: Java Increment and Decrement Operators

        //Increment Operator: Increases the value of a variable by 1.
        //Decrement Operator: Decreases the value of a variable by 1.
        //Postfix Increment/Decrement: The operator is placed after the variable (e.g., a++ or a--).
        //Prefix Increment/Decrement: The operator is placed before the variable (e.g., ++a or --a).
        //The difference between postfix and prefix is that postfix returns the original value before incrementing/decrementing, while prefix returns the new value after incrementing/decrementing.
        //For example, if a = 5, then a++ returns 5 and a becomes 6, while ++a returns 6 and a becomes 6.
        //Similarly, if a = 5, then a-- returns 5 and a becomes 4, while --a returns 4 and a becomes 4.
        //The increment and decrement operators can be used with any numeric data type (int, float, double, etc.) and can also be used with variables of type char.
        //For example, if c = 'A', then c++ returns 'A' and c becomes 'B', while ++c returns 'B' and c becomes 'B'.
        //The increment and decrement operators can also be used in expressions. For example, if a = 5, then the expression a + a++ evaluates to 5 + 5 = 10, and a becomes 6.
        //Similarly, if a = 5, then the expression a + ++a evaluates to 5 + 6 = 11, and a becomes 6.
        
        int a = 10;
        int b = 20;
        System.out.println("The value of a++ is: " + (a++)); // Postfix increment
        System.out.println("The value of ++a is: " + (++a)); // Prefix increment
        System.out.println("The value of a-- is: " + (a--)); // Postfix decrement
        System.out.println("The value of --a is: " + (--a)); // Prefix decrement
        char c = 'A';
        System.out.println("The value of c++ is: " + (++c)); // increment to B
        //The value of a is: 10
        //The value of b is: 20
        //The value of a++ is: 10
        //The value of ++a is: 12
        //The value of a-- is: 12
        //The value of --a is: 10
    
    
    }

    public static void third(){
        //L-8: Type Casting
        //Type Casting: Converting a variable from one data type to another.
        //There are two types of type casting in Java: implicit and explicit.
        //Implicit Type Casting: Automatic conversion of a smaller data type to a larger data type.
        //For example, converting an int to a float or a char to an int.

        int a = 10; // int
        int b = 20; // int
        float c = a + b; // implicit type casting from int to float
        System.out.println("The value of c is: " + c); // c = 30.0
        float d = (float)(a) + (float)(b); // explicit type casting from int to float
        System.out.println("The value of c is: " + c); // c = 30.0

    }
}
