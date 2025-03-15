import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileService {

    public void readFile(String pathFile){
        try {
            File myFile = new File(pathFile);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                /*
                    Traitement des données ici
                 */
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
