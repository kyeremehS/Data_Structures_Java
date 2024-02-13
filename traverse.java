import java.util.Scanner;

public class traverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take the size of array
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array that stores element
        int nums[] = new int[50];

        //Take elements to be stored in the array
        for(int i = 0; i < size; i++){
            System.out.println("Enter the elements");
            nums[i] = scanner.nextInt();
        }

        //Display elements stored in the array
        for(int i = 0; i < size; i++){
            System.out.println("The elements are" + nums[i]);
        }

        //close scanner
        scanner.close();
    }


}
