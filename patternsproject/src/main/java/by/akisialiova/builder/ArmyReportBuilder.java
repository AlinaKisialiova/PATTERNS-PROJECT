package by.akisialiova.builder;

import java.util.Arrays;
import java.util.List;

public class ArmyReportBuilder implements ArmyBuilder {

    private List<Countries> countries;

    private TroopTypes troopType;

    private Integer soldiersCount;

    private Integer numberOfDeaths;

    private List<Weapons> thePowerfulWeapons;

    public ArmyReportBuilder(List<Countries> countries) {
        if (countries == null ) {
            throw new IllegalArgumentException("Countries can not be null");
        }
        this.countries = countries;
    }

    ArmyReport getResult() {
        return new ArmyReport(countries, troopType, soldiersCount, numberOfDeaths, thePowerfulWeapons);
    }

    @Override
    public void setSoldiersCount(Integer count) {
        this.soldiersCount = count;
        this.numberOfDeaths = count / 5;
    }

    @Override
    public void setThePowerfulWeapons(List<Weapons> weapon) {
        this.thePowerfulWeapons = weapon;
    }

    @Override
    public void setTroopType(TroopTypes type) {
        this.troopType = type;
    }
}
