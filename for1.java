import java.util.Scanner;

public class for1 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter starting number : ");
        int starting = scan.nextInt();
        System.out.print("Enter ending number : ");
        int ending = scan.nextInt();
        scan.close();

        for (int i = starting; i <= ending; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println(i);

            }

        }

    }

}