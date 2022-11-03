import Comperatorer.AldersGruppeComparator;
import Comperatorer.RegionComparator;
import FilesAndData.CovidData;
import FilesAndData.FileHandler;
import UI.UserInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    UserInterface ui;
    FileHandler fileHandler;
    ArrayList<CovidData> data;
    RegionComparator rc;
    AldersGruppeComparator ac;

    public Controller(){

    }

    public void startProgram() throws IOException {
        fileHandler =  new FileHandler();
        ui = new UserInterface();
        rc = new RegionComparator();
        ac = new AldersGruppeComparator();
        data =  fileHandler.splitData();
        ui.velkommen();
        mainLoop();
    }

    public void mainLoop() {
        boolean shouldRun = true;
        Scanner kb = new Scanner(System.in);
        while(shouldRun){

            System.out.print("""
                Hvordan vil du gerne have dataen sorteret?\s
                1: Efter region
                2: Efter aldersgruppe
                3: Først efter region, så aldersgruppe
                9: Afslut
                """);
            int userChoice = kb.nextInt();
            switch (userChoice){
                case 1 -> {
                    data.sort(rc);
                    ui.printData(data);
                }
                case 2 -> {
                    data.sort(ac);
                    ui.printData(data);
                }
                case 3->{
                    data.sort(rc.thenComparing(ac));
                    ui.printData(data);
                }
                case 9 -> shouldRun = false;
            }
        }
    }
}
