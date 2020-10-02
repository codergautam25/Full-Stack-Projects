
import java.io.File;
import java.util.Arrays;

public class ListFiles {
    public void listfile() {
        File listingFiles = new File("rootFile");

        String[] rootFiles = listingFiles.list();
        try {
            assert rootFiles != null;
            if (rootFiles.length > 0) {
                Arrays.sort(rootFiles);
                for (String x : rootFiles) {
                    System.out.println(x);
                }
            } else {
                System.out.println("Empty folder, please add files to list");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
