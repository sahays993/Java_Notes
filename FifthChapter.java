// import java.util.Arrays;

public class FifthChapter {
    //L-12: ARRAYS
    //Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
    //An array is a collection of similar data types. It is a data structure that can store a fixed-size sequential collection of elements of the same type.

    public static void main(String[] args){

        first();
        second();
        third();
        fourth();
        fifth();
    }

    public static void first(){
      //L-13: Array Declaration and Initialization
        //Array declaration: int[] arr; // Declares an array of integers
        //Array instantiation: arr = new int[5]; // Creates an array of size 5
        //Array initialization: arr = new int[]{1, 2, 3, 4, 5}; // Initializes the array with values

        int[] arr = {1, 2, 3, 4, 5}; // Declaration and initialization and Memory allocation of an array in one line
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Accessing elements of the array using a loop
        }

        System.out.println("The length of the array is: " + arr.length); // Length of the array

        int[] arr2 = new int[5];//Decleration and instantiation of an array in one step

        int[] arr3;
        arr3 = new int[5]; // Declaration and instantiation of an array in two steps
        
    }

    public static void second(){
         //L-14: One Dimensional Array
        //One-dimensional arrays are the simplest form of arrays. They are used to store a list of elements of the same type.
        int[] arr = new int[5]; // Declaration and instantiation of an array
        arr[0] = 10; // Initialization of the first element
        arr[1] = 20; // Initialization of the second element
        arr[2] = 30; // Initialization of the third element
        arr[3] = 40; // Initialization of the fourth element
        arr[4] = 50; // Initialization of the fifth element

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Accessing elements of the array using a loop
        }

    }

    public static void third(){
               //L-15: Two Dimensional Array
        //Two-dimensional arrays are used to store data in a tabular form. They are also known as matrices.
        int[][] arr = new int[3][3]; // Declaration and instantiation of a two-dimensional array
        arr[0][0] = 1; // Initialization of the first element
        arr[0][1] = 2; // Initialization of the second element
        arr[0][2] = 3; // Initialization of the third element
        arr[1][0] = 4; // Initialization of the fourth element
        arr[1][1] = 5; // Initialization of the fifth element
        arr[1][2] = 6; // Initialization of the sixth element
        arr[2][0] = 7; // Initialization of the seventh element
        arr[2][1] = 8; // Initialization of the eighth element
        arr[2][2] = 9; // Initialization of the ninth element

        System.out.println("The elements of the two-dimensional array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // Accessing elements of the two-dimensional array using nested loops
            }
            System.out.println(); // New line after each row
        }


        //differentiating next line with a line of dashes
        for (int k=0; k<10;k++){
            System.out.print("--");
        }
        System.out.println();

        

    }

    //L-16: For Each Loop
   
    public static void fourth(){
        float [] arr = { 1.2f, 2.3f, 3.4f, 4.5f, 5.6f}; // Declaration and initialization of a float array
    
        //opposite direction printing in for loop
     for (int i = arr.length-1;i>=0;i--){
        System.out.println(arr[i]); // Accessing elements of the array using a loop})
         }

     //The for-each loop is used to iterate over elements of an array or a collection. It is a simplified version of the for loop.
     for (float i:arr){
        System.out.println(i); // Accessing elements of the array using a for-each loop
      }
    
    }

    public static void fifth(){
        //L:17: Array Methods
        // for each loop for 2-D arrays
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Declaration and initialization of a two-dimensional array
        System.out.println("Array Methods: ");
        for(int[] i:arr) {
            for(int j:i) {
                System.out.print(j + " "); // Accessing elements of the two-dimensional array using nested loops
            }
            System.out.println(); // New line after each row
        }

        //Arrays class provides various methods for manipulating arrays, such as sorting, searching, and copying.
        // Arrays.sort(arr); // Sorts the array in ascending order
        // Arrays.binarySearch(arr, 3); // Searches for the element 3 in the array and returns its index
        // Arrays.copyOf(arr, 3); // Copies the first 3 elements of the array to a new array
        // Arrays.fill(arr, 0); // Fills the array with the value 0
        //  Arrays.equals(arr, arr2); // Compares two arrays for equality
        // Arrays.toString(arr); // Converts the array to a string representation
        // System.out.println(Arrays.deepToString(arr)); // Converts a two-dimensional array to a string representation
        // Arrays.asList(arr); // Converts an array to a list
        // Arrays.stream(arr); // Converts an array to a stream for functional programming
        // Arrays.parallelSort(arr); // Sorts the array in parallel using multiple threads
    }
}
//solve array questions on leetcode and gfg