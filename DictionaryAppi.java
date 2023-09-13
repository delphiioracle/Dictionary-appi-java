import java.util.Scanner;

public class DictionaryAppi {


    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        while (true) {


            displayMenu();


            int choice = scanner.nextInt();


            scanner.nextLine(); // Consume the newline character


            switch (choice) {

                case 1:

                    System.out.println("function for adding word");

                    break;

                case 2:

                    System.out.println("function for deleting word");

                    break;

                case 3:

                    System.out.println("function for viewing word");

                    break;

                case 4:

                    System.out.println("function for view dictionary word");

                    break;

                case 5:

                    System.out.println("function for asearching word");

                    break;

                case 6:

                    System.out.println("Exiting Dictionary App. Goodbye!");


                    System.exit(0);


                default:


                    System.out.println("Invalid choice. Please try again.");


            }

        }

    }


    private static void displayMenu() {


        System.out.println("Dictionary App Menu:");

        System.out.println("1. Add a Word");

        System.out.println("2. Delete a Word");

        System.out.println("3. Edit a Word");

        System.out.println("4. View Dictionary");

        System.out.println("5. Search for a Word");

        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");


    }

}