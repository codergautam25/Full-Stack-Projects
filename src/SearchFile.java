import java.io.File;
import java.util.Scanner;

public class SearchFile {
    int counter;
    Scanner src = new Scanner(System.in);
    String searchFile = src.nextLine();

    public void search() {

        File fileName= new File("I:\\Phase 1 Project\\rootFile");
        File pathName=new File("I:\\Phase 1 Project\\rootFile"+"/"+ searchFile);

        String[] rootFiles = fileName.list();


        if (rootFiles != null) {
            for (String files : rootFiles) {
                if (files.equals(searchFile)) {
                    counter++;
                    break;
                }

            }
        }

        if (counter==1){
            if (pathName.exists()) {
                System.out.println("Result :" + " " + searchFile+ " " + "File found");
            }

        }else {
            System.out.println("Result :" + " " +searchFile + " " + " File Not Found");
        }
    }
}
