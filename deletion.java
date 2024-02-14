import java.util.Scanner;
public class deletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take the size of the array
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        //Create an array to elements
        int nums[] = new int[50];

        //Take numbers to be stored in the array
        for(int i = 0; i < size; i++){
            System.out.println("Enter number to be stored in array");
            nums[i] = scanner.nextInt();
        }

        // Enter the position of the number to delete
        System.out.println("Enter position of number to delete: ");
        int pos = scanner.nextInt();

        // Check if the position is valid
        if(pos < 0 || pos >= size){
            System.out.println("Invalid position.Deletion is aborted.");
        }
        else{ 
            //shift elements to the left to fill gap
        for(int i = pos - 1; i < size - 1; i++){
            nums[i] = nums[i+1];

        }

        // Decrease the size
        size --;

        // Display numbers in the array after deletion
        for( int i = 0; i < size; i++){
            System.err.println("The numbers are: " + nums[i]);
        }

        // Scanner close
        scanner.close();
        

    }
}
}

