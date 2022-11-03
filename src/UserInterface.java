import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public UserInterface() {
    }

    public void printData(ArrayList<CovidData> data){
        for (CovidData datum : data) {
            System.out.printf("Region: %s, Aldersgruppe: %s, Bekræftede tilfælde i alt: %s, Døde: %s, Indlagte på intensiv afdeling: %s, Indlagte: %s, Dato: %s \n",
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
