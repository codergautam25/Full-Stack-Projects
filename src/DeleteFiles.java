import java.io.File;
import java.util.Scanner;

public class DeleteFiles {
    int counter =0;
    Scanner s = new Scanner(System.in);
    String DeleteFileName = s.nextLine();

    public void deleteFile() {
        File fileName = new File("I:\\Phase 1 Project\\rootFile");
        File pathName=new File("I:\\Phase 1 Project\\rootFile"+"/"+DeleteFileName);
        String[] rootFiles = fileName.list();

        if (rootFiles != null) {
            for (String files : rootFiles) {
                if (files.equals(DeleteFileName)) {
                    counter++;
                    break;
                }

            }
        }

        if (counter==1){
            if (pathName.delete()) {
                System.out.println("Result :" + " " +DeleteFileName + " " + "Deleted From Root Directory");
            }

        }else {
            System.out.println("Result :" + " " +DeleteFileName + " " + " File Not Found");
        }

        }
    }