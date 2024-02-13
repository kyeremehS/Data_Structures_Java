import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take the size of the array
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        //Create an array to store the elements
        int nums[] = new int[50];

        //Take numbers to be stored in the array
        for(int i = 0; i < size; i++){
            System.out.println("Enter the numbers to be stored in the array: ");
            nums[i] = scanner.nextInt();
        }
          // Take the number you want to insert
          System.out.println("Enter the number you want to insert: ");
          int num = scanner.nextInt();


        // Take the position to insert the number
        System.out.println("Enter the position to the number: ");
        int pos = scanner.nextInt();

        //Inserting number into array with defined position
        for (int i = size - 1; i >= pos - 1; i--){
            nums[i+1] = nums[i];
        }
        nums[pos - 1] = num;
        size ++;

        //Display numbers stored in the array
        for(int i = 0; i < size; i++){
            System.out.println("The numbers stored in the array are: " + nums[i]);
        }

        //close scanner
        scanner.close();
    }
}
