package FilesAndData;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private File file;

    public FileHandler() {
    }

    public ArrayList<CovidData> splitData() throws IOException {
        file = new File("Data/data.csv");
        Scanner scanner = new Scanner(file, StandardCharsets.ISO_8859_1);
        String[] data = null;
        ArrayList<CovidData> returnArray = new ArrayList<>();
        boolean firstLine = true;
        while(scanner.hasNextLine()){
            if (!firstLine){
                data = scanner.nextLine().split(";");
                returnArray.add(new CovidData(data[0], data[1], Integer.parseInt(data[2]) , Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6]));
            }
            else {
                scanner.nextLine();
                firstLine = false;
            }
        }
        return returnArray;
    }
}
