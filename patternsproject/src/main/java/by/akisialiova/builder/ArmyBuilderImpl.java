package by.akisialiova.builder;

import java.util.List;

public class ArmyBuilderImpl implements ArmyBuilder {

    private Countries country;

    private TroopTypes troopType;

    private Integer soldiersCount;

    private List<Weapons> thePowerfulWeapon;

    public ArmyBuilderImpl(Countries country) {
        if (country == null ) {
            throw new IllegalArgumentException("Country can not be null");
        }
        this.country = country;
    }

    Army getResult() {
        return new Army(country, troopType, soldiersCount, thePowerfulWeapon);
    }

    @Override
    public void setSoldiersCount(Integer count) {
        this.soldiersCount = count;
    }

    @Override
    public void setThePowerfulWeapons(List<Weapons> weapon) {
        this.thePowerfulWeapon = weapon;
    }

    @Override
    public void setTroopType(TroopTypes type) {
        this.troopType = type;
    }
}
