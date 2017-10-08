package by.akisialiova.builder;

import java.util.List;

public class ArmyReport {

    private List<Countries> countries;

    private TroopTypes troopType;

    private Integer soldiersCount;

    private Integer numberOfDeaths;

    private List<Weapons> thePowerfulWeapons;

    public ArmyReport(List<Countries> country, TroopTypes troopType, Integer soldiersCount, Integer numberOfDeaths, List<Weapons> thePowerfulWeapons) {
        this.countries = country;
        this.troopType = troopType;
        this.soldiersCount = soldiersCount;
        this.numberOfDeaths = numberOfDeaths;
        this.thePowerfulWeapons = thePowerfulWeapons;
    }

    public List<Countries> getCountries() {
        return countries;
    }

    public TroopTypes getTroopType() {
        return troopType;
    }

    public Integer getSoldiersCount() {
        return soldiersCount;
    }

    public List<Weapons> getThePowerfulWeapons() {
        return thePowerfulWeapons;
    }

    public Integer getNumberOfDeaths() {
        return numberOfDeaths;
    }
}
