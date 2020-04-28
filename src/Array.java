import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
            Declare String variable
            Open for loop
                start from word length minus 1
                print char at that specific index
                ends when length less than 0.
         */

        String word;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to revers word application.");
        System.out.println("Enter a word: ");
        word = in.nextLine();

        for (int i = word.length() - 1; i >= 0 ; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println();
        System.out.println("===========================================");

        /*
            Declare and initialize integer array of size 10
            For loop 1-10
                prompt user to enter values
                store values in the array we created
                stop the array when it reached 10
             Rearrange the array in ascending order using sort method.
             Display the first number on index 0.
             For loop 0 to length minus 1
                check if previous printed value is not equal with the next coming number
                if not equal display the next number
                end loop.
         */

        int userValues [] = new int[10];
        int count;

        for (int i = 0; i <userValues.length ; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            userValues [i] = in.nextInt();
        }

        Arrays.sort(userValues); // arrange the array small to large order.

        System.out.print(userValues[0] +","); // print the first value
        for (int i = 0; i < userValues.length - 1 ; i++) {
            if(userValues[i] != userValues[i+1])
            {
                System.out.print(userValues[i+1] + ",");
            }
        }
        System.out.println();
        System.out.println("=============================================");


        /*
            Declare two integer arrays
            prompt user to enter values for these two arrays
            Display both arrays
            Using two nested for loop go through each combination and find
            the combination that gave us the sum equal to 13
            then display those combination.
         */

        int arr1 [] = {1,7,6,5,9};
        int arr2 [] = {2,7,6,3,4};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == 13) {
                    System.out.println("(" + arr1[i] + "," + arr2[j] + ")");
                }
            }

        }
        System.out.println("=============================================");

        /*
            Declare integer array, and two integer variables
            prompt user to enter 10 numbers
            check
            if the value entered is even if true store the value on one the variables
            else store on the other variable
            finally display the array, sum of the even and odd numbers.
         */

        int arr4 [] = new int [10];
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr4.length; i++) {
            System.out.print("Enter value " + (i+1) +": ");
            arr4 [i] = in.nextInt();
            in.nextLine();
            if(arr4[i] % 2 == 0){
                evenSum += arr4[i];
            }
            else{
                oddSum += arr4[i];
            }
       }

        System.out.println("Array = " + Arrays.toString(arr4));
        System.out.println("Even numbers sum: " + evenSum);
        System.out.println("Odd numbers sum: " + oddSum);

        System.out.println("=============================================");

        /*
            Declare String variable and String array variable.
            Prompt users to enter a sentence with a max character of 132
            Split the sentence and store in the array
            Display the user input using for loop from the array
            Display the numbers of character each word contain.

         */

        String sentence;
        String words [];

        System.out.println("Enter a string (max number of characters is 132)");
        sentence = in.nextLine();
        words = sentence.split(" ");

        System.out.println("You entered: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " has " + words[i].length() +" characters.");

        }
        
    }
}
