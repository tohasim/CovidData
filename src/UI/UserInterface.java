package UI;

import FilesAndData.CovidData;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public UserInterface() {
    }

    public void velkommen(){
        System.out.print("Velkommen til dataovervågningssystemet 6000!\n");
    }

    public void printData(ArrayList<CovidData> data){
        for (CovidData datum : data) {
            System.out.printf("Region: %-15s Aldersgruppe: %-15s Bekræftede tilfælde i alt: %-15s Døde: %-15s Indlagte på intensiv afdeling: %-15s Indlagte: %-15s Dato: %-15s \n",
                    datum.getRegion(),
                    datum.getAldersgruppe(),
                    datum.getBekræftedeTilfælde(),
                    datum.getDøde(),
                    datum.getIndlagteIntensiv(),
                    datum.getIndlagte(),
                    datum.getDato());
        }
    }
}
