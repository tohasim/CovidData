import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler =  new FileHandler();
        UserInterface ui = new UserInterface();
        ArrayList<CovidData> data =  fileHandler.splitData();
        ui.printData(data);
    }
}
