public class ThirdChapter {
  
    public static void main(String[] args) {
        first();
        second();
        third();

    }

    public static void first(){
         //L-9: String Methods --Strings are immutable in Java, meaning once created, their values cannot be changed.
         // However, you can create new strings based on existing ones using various methods.
         // Strings are objects in Java, and they come with a variety of methods for manipulation.
    


        String str = new String("Hello World!");//string has special support in java
         //String str = "Hello World!"; // Another way to create a string
        System.out.println("The original string is: " + str); // Original string
        System.out.println("The length of the string is: " + str.length()); // Length of the string
        System.out.println("The character at index 0 is: " + str.charAt(0)); // Character at index 0
        System.out.println("The substring from index 0 to 5 is: " + str.substring(0, 5)); // Substring from index 0 to 5
        System.out.println("The string in uppercase is: " + str.toUpperCase()); // String in uppercase
        System.out.println("The string in lowercase is: " + str.toLowerCase()); // String in lowercase
        System.out.println("The string after replacing 'o' with 'a' is: " + str.replace('o', 'a')); // Replace 'o' with 'a'
        System.out.println("The string after trimming is: " + str.trim()); // Trim the string
        System.out.println("The string after splitting is: " + str.split(" ")); // Split the string
        System.out.println("The string after concatenating is: " + str.concat(" How are you?")); // Concatenate the string
        System.out.println("The string after comparing is: " + str.compareTo("Hello World!")); // Compare the string
        System.out.println("The string after comparing ignore case is: " + str.compareToIgnoreCase("hello world!")); // Compare the string ignore case
        System.out.println("The string after checking if it contains 'World' is: " + str.contains("World")); // Check if the string contains 'World'
        System.out.println("The string after checking if it starts with 'Hello' is: " + str.startsWith("Hello")); // Check if the string starts with 'Hello'
        System.out.println("The string after checking if it ends with '!' is: " + str.endsWith("!")); // Check if the string ends with '!'
        System.out.println("The string after checking if it is empty is: " + str.isEmpty()); // Check if the string is empty
        System.out.println("The string after checking if it is blank is: " + str.isBlank()); // Check if the string is blank
        System.out.println("The string after checking if it is equal to 'Hello World!' is: " + str.equals("Hello World!")); // Check if the string is equal to 'Hello World!'
        System.out.println("The string after checking if it is equal to 'hello world!' ignore case is: " + str.equalsIgnoreCase("hello world!")); // Check if the string is equal to 'hello world!' ignore case
        System.out.println("The string after checking if it is equal to 'Hello World!' using == is: " + (str == "Hello World!")); // Check if the string is equal to 'Hello World!' using ==
        System.out.println("The string after checking if it is equal to 'Hello World!' using equals() is: " + str.equals("Hello World!")); // Check if the string is equal to 'Hello World!' using equals()
    
        }

        //NOTE -1:
        public static void second(){
            // StringBuilder and StringBuffer

            //StringBuilder is mutable, meaning you can change its content without creating a new object.
            //StringBuffer is also mutable but is synchronized, making it thread-safe.
            //StringBuilder is faster than StringBuffer because it is not synchronized.
            StringBuilder sb = new StringBuilder("Hello World!");
            System.out.println("The original StringBuilder is: " + sb); // Original StringBuilder
            sb.append(" How are you?"); // Append to the StringBuilder
            System.out.println("The StringBuilder after appending is: " + sb); // StringBuilder after appending
            sb.insert(0, "Hi! "); // Insert into the StringBuilder
            System.out.println("The StringBuilder after inserting is: " + sb); // StringBuilder after inserting
            sb.delete(0, 3); // Delete from the StringBuilder
            System.out.println("The StringBuilder after deleting is: " + sb); // StringBuilder after deleting
            sb.replace(0, 3, "Hey"); // Replace in the StringBuilder



        }
        //NOTE-2:
        public static void third(){
         // Different ways to print in Java
         // Print using System.out.println()
         System.out.println("Hello World!"); // Print with a newline
         // Print using System.out.print()
         System.out.println("Hello World!"); // Print without a newline
         // Print using System.out.printf()
         System.out.printf("Hello %s!%n", "World"); // Print formatted string
         // Print using System.out.format()
         System.out.format("Hello %s!%n", "World"); // Print formatted string



        }





}
