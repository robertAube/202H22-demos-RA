package demoEnum;

import java.util.Locale;

public enum Province {

    ON("Ontario", "Toronto", 14915270),
    QC("Québec", "Québec", 8631147),
    NS("Nouvelle-Écosse", "Halifax", 998832);

    private String province;
    private String capitale;
    private int  population;

    Province(String province, String capitale, int population) {
        this.province = province;
        this.capitale = capitale;
        this.population = population;
    }

    public String getCodeMin() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public String getProvince() {
        return province;
    }

    public String getCapitale() {
        return capitale;
    }

    public int getPopulation() {
        return population;
    }
}
