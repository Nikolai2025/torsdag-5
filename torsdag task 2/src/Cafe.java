import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Cafe {

    ArrayList<String> coffeMenu = new ArrayList<String>();
    void loadMenuData() {
        File file = new File("coffees.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);

        } catch (FileNotFoundException e) {

            System.out.println("File not found. Check path and filename");
            while (scan.hasNextLine()) {


                coffeMenu.add(scan.nextLine());

            }

        }
    }
}
