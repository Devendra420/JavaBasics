//import java.util.Scanner;
//public class DEMO {
//    public static void main(String[] args) {
//        int i=0;
//        Scanner scanner = new Scanner(System.in);
//        try{
//            do {
//                System.out.print("Enter the value of i (1-7): ");
//                i = scanner.nextInt();
//                if(i <= 0 || i > 7){
//                    System.out.println("PLEASE ENTER VALID INPUT");
//                }
//            } while(i <= 0 || i > 7);
//        }catch(Exception exception){
//            System.out.println("String not allowed");
//        }
//
//
//        switch (i) {
//            case 1:
//                System.out.println("SUNDAY");
//                break;
//            case 2:
//                System.out.println("MONDAY");
//                break;
//            case 3:
//                System.out.println("TUESDAY");
//                break;
//            case 4:
//                System.out.println("WEDNESDAY");
//                break;
//            case 5:
//                System.out.println("THURSDAY");
//                break;
//            case 6:
//                System.out.println("FRIDAY");
//                break;
//            case 7:
//                System.out.println("SATURDAY");
//                break;
//        }
//        scanner.close();
//    }
//}
import java.util.Scanner;

public class DEMO {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the value of i (1-7): ");
                i = Integer.parseInt(scanner.nextLine()); // Read input as string and convert to integer
                if (i > 0 && i <= 7) {
                    break; // Exit loop if input is valid
                } else {
                    System.out.println("PLEASE ENTER VALID INPUT (1-7)");
                }
            } catch (NumberFormatException exception) {
                System.out.println("String not allowed.");
            }
        }

        switch (i) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
        }

        scanner.close();
    }
}
