import java.util.Scanner; // Import the Scanner class to read user input
public class FirstChapter{ 
    //L-1
    public static void main(String[] args ){
        System.out.println("Hello World!"); // Print "Hello World!" to the console
        System.out.println("This is my first Java program."); 
        System.out.println("I am learning Java!"); 
        second();
        third();
        fourth();
    }
    //L-2
    public static void second(){
        System.out.println("Program to add two numbers:");
        int a = 15;
        int b = 25;
        int c = a+b; // Add a and b
        System.out.println("The Suma and b is: " + c);
    }
    //L-3:java lierals = a constant value that is assigned to a variable
    public static void third(){
    //Variables || Literals
        byte a=10;
        int b = 20;
        char c = 'A';
        float d = 10.5f;//float is a double by default until f is added at the end of the number
        //float d = 10.5; // This will give an error because 10.5 is a double by default
        double e = 10.5;
        boolean f = true;
        short g = 10;
        long h = 1000000000L;//long is a double by default until L is added at the end of the number
        //long h = 1000000000; // This will give an error because 1000000000 is a double by default
        String i = "Hello World!";
        System.out.println("The value of these variables are : " + a +"\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n"+ g + "\n" + h + "\n" + i + "\n" );
    }
    
    //L-4: Java User Input
    public static void fourth(){
        //taking input from user
        System.out.println("Enter your name: " );
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.nextLine();
        System.out.println("Enter your age and roll number :");
        int age = sc1.nextInt();
        int rollno = sc1.nextInt();
        boolean b = sc1.nextBoolean();
        boolean isInt = sc1.hasNextInt();//has next checks if the value is a specified type or not.
        sc1.close(); 
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age + " and your roll number is: " + rollno);
        System.out.println("True or False:");
        // System.out.println(System.getProperty("os.name"));
        // System.out.println(System.getenv("Java_HOME"));
        // System.out.println(System.currentTimeMillis());
    }


}