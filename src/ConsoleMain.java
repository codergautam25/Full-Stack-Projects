import java.io.IOException;
import java.util.Scanner;

public class ConsoleMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option = 0, innerOption = 0;

        System.out.println("Welcome to Bob's File Management System");
        System.out.println("Developer name : Gautam Das");
        System.out.println("Qualifications : Bachelor of Computer Application");


        System.out.println();
        do {
            System.out.println("Press 1 -> To List all files in root directory");
            System.out.println("Press 2 -> To  Add , Delete , Search File in the root directory ");
            System.out.println("Press 3 -> To Close the application");


            System.out.print("Enter your option : ");
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input is not valid");
            }

            switch (option) {
                case 1 -> {
                    System.out.println("Showing all files in the root directory");
                    listAllFile();
                }
                case 2 -> {
                    do {
                        System.out.println("Choose option from the following : ");
                        System.out.println("Press 1 -> to add.Add a file in the existing directory");
                        System.out.println("Press 2 -> to Delete a file from the existing directory");
                        System.out.println("Press 3 -> to Search a file in the existing directory");
                        System.out.println("Press 4 -> to Back to main Menu");
                        System.out.print("Enter your option : ");
                        try {
                            innerOption = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Input is not valid");
                        }
                        switch (innerOption) {
                            case 1 -> {
                                System.out.println("Add a file in the root directory");
                                add();
                            }
                            case 2 -> {
                                System.out.println("Delete a file from the root directory");
                                delete();
                            }
                            case 3 -> {
                                System.out.println("Search a file in the root directory");
                                search();
                            }
                            case 4 -> System.out.println("Back to main Menu");
                            default -> System.out.println("Invalid Choice... Choice should and must be between 1-4 only");
                        }


                    } while (innerOption != 4);
                }

                case 3 -> System.out.println("Thank You for Using the application.....Exiting From the application ");
                default -> System.out.println("Invalid Choice... Choice should and must be between 1-3 only");
            }


        } while (option != 3);

    }

    private static void listAllFile() {
        ListFiles listFiles = new ListFiles();
        listFiles.listfile();
    }


    private static void search() {
        System.out.println("Enter the name of file you want to search ");
        SearchFile searchFile = new SearchFile();
        searchFile.search();

    }

    private static void delete() throws IOException {
        System.out.println("Enter the FileName You Want to Delete");
        DeleteFiles deleteFiles = new DeleteFiles();
        deleteFiles.deleteFile();

    }

    public static void add() {
        System.out.println("Please Enter Your File Name");
        AddingNewFile addFile = new AddingNewFile();
        addFile.addFile();
    }

}
