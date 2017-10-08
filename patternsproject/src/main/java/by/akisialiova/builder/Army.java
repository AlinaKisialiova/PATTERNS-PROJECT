package by.akisialiova.builder;

import java.util.List;

public class Army {
    
    private Countries country;

    private TroopTypes troopType;

    private Integer soldiersCount;

    private List<Weapons> thePowerfulWeapons;

    public Army(Countries country, TroopTypes troopType, Integer soldiersCount, List<Weapons> thePowerfulWeapons) {
        this.country = country;
        this.troopType = troopType;
        this.soldiersCount = soldiersCount;
        this.thePowerfulWeapons=thePowerfulWeapons;
    }

    public Countries getCountry() {
        return country;
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
}
