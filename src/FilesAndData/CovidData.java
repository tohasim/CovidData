package FilesAndData;

import java.util.Date;

public class CovidData {
    private String region, aldersgruppe, dato;
    private int bekræftedeTilfælde, døde, indlagteIntensiv, indlagte;

    public CovidData(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.dato = dato;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public String getDato() {
        return dato;
    }

    public int getBekræftedeTilfælde() {
        return bekræftedeTilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagteIntensiv() {
        return indlagteIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }
}
