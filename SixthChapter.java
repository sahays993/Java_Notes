public class SixthChapter {
    //only static methods can be called in static main method without creating an object of the class
    //methods are called by arguments which is coppied to the parameters of the method




    float add(float a, float b) { // Method declaration
        return a + b; // Method body
    }



    public static void main(String[] args){
        first(10,11);//these are agruments passed to a method
        second();
        third();
        int marks[] = {10, 20, 30, 40, 50}; // Array declaration and initialization
        System.out.println("The first element of the array is: " + marks[0]);
        fourth(marks); // Passing the array , pass by reference example
        System.out.println("The first element of the array is: " + marks[0]); // Accessing the first element of the array after modification

        //creating object to call the method
        SixthChapter obj = new SixthChapter(); 
        float c=obj.add(10.0f,20.0f);
        System.out.println("Method Invocation by Object Cration: " + c); 


        //L-18: Varargs
        System.out.println("Varargs: ");
        Varargs.varArgs(1, 2, 3, 4, 5); // Calling the varArgs method with variable-length arguments
   
   
        //L-19: Recursion
        System.out.println("Recursion: ");
        int n = 5; // Number to calculate factorial
        int d = Recursion.factorial(5);
        System.out.println("The factorial of " + n + " is: " + d); // Calling the factorial method
   
   
   
    }

    public static void first(int a, int b){//these are perimeterized methods
        //L-20: Java Methods
        //Methods are used to perform a specific task. 
        System.out.println("The sum of " + a + " and " + b + " is: " + (a + b)); // Calling the add method

    }

    public static void second(){
        System.out.println("The sum of 10 and 20 is: " + add(10, 20)); // Calling the add method
    }
    
    public static int add(int a, int b) { // Method declaration
        return a + b; // Method body
    }

    public static void third(){
        //L-21: Method Overloading
        //Method overloading is a feature that allows a class to have more than one method with the same name, as long as the parameter types or number of parameters are different.
        System.out.println("The sum of 10 and 20 is: " + add(10, 20)); // Calling the add method with two parameters
        System.out.println("The sum of 10, 20 and 30 is: " + add(10, 20, 30)); // Calling the add method with three parameters
    }

    public static int add(int a, int b, int c) { // Method overloading
        return a + b + c; // Method body
    }

    public static void fourth(int[] arr) { // Method overloading
        arr[0] = 100; // Changing the first element of the array
    }


    
    
}
//try calling method using object of the class in main method
//pass by value and pass by reference
//pass by value: when a method is called, the values of the arguments are passed to the parameters of the method. This is called pass by value.
//pass by reference: when an object is passed to a method, the reference of the object is passed to the method. This is called pass by reference.



//L-33: Varargs
//Varargs: Variable-length arguments. It allows a method to accept zero or more arguments of a specified type.

class Varargs{
    public static int varArgs(int...arr){
        //Varargs are used to pass a variable number of arguments to a method.
        //Varagrs takes arguments as array of Arguments.

        for(int i:arr){
            System.out.println(i); // Accessing elements of the array using a loop
        }

        return 0;

    }

}




//L-22: Recursion
//Recursion: A method that calls itself is called a recursive method. It is used to solve problems that can be broken down into smaller subproblems of the same type.


class Recursion{
    public static int factorial(int n){
        if(n==0 || n==1) // Base case
            return 1; // Factorial of 0 or 1 is 1
        else // Recursive case
            return  factorial(n-1)*n; // Recursive call to the method

    }
       
    

}



