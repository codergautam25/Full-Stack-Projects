import java.io.*;
import java.util.Scanner;


public class AddingNewFile {
    String fileName;

    public void addFile() {
        Scanner userFileName = new Scanner(System.in);
        fileName = userFileName.nextLine();

        File file = new File("I:\\Phase 1 Project\\rootFile" + "/" + fileName);
            if (file.exists()) {
                System.out.println(fileName + " " + "Already Exist");
            } else {
                try (FileOutputStream fos = new FileOutputStream(file);
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                    oos.writeObject(file);
                System.out.println(fileName + " " + "Write  Successfully");
            } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
