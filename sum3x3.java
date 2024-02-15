import java.util.Arrays;
import java.util.Scanner;;
public class sum3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Created 2D array
        int sum[][] = new int[3][3];

        //Take input from users
        for(int i = 0; i < 3; i++){
             for(int j = 0; j < 3; j++){
                System.out.println("Enter number: ");
                sum[i][j] = scanner.nextInt();
             }

        }

        for( int i = 0; i < 3; i++){
            System.err.println(Arrays.deepToString(sum));
            }
            

            //Sum of matrix
            int total = 0;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                   total = total + sum[i][j];

    }
}
    // close scanner
    scanner.close();
    }}
