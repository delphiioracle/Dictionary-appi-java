import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DictionaryAppi {
    private static Map<String, String> dictionary = new HashMap<>();
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

                    System.out.println("function for searching word");

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


    private static void addWord() {

        System.out.print("Enter the word to add: ");
        String word = scanner.nextLine();
        System.out.print("Enter the definition: ");
        String definition = scanner.nextLine();
        DictionaryAppi.put(word, definition);
        System.out.println("Word added to the dictionary.");
    }

    private static void deleteWord() {

        System.out.print("Enter the word to delete: ");
        String word = scanner.nextLine();
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            System.out.println("Word deleted from the dictionary.");

        } else {

            System.out.println("Word not found in the dictionary.");
        }
    }

    private static void editWord() {

        System.out.print("Enter the word to edit: ");
        String word = scanner.nextLine();
        if (dictionary.containsKey(word)) {
            System.out.print("Enter the new definition: ");
            String newDefinition = scanner.nextLine();
            dictionary.put(word, newDefinition);
            System.out.println("Word edited successfully.");

        } else {

            System.out.println("Word not found in the dictionary.");

        }
    }

    private static void viewDictionary() {

        System.out.println("Dictionary Contents:");

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }

