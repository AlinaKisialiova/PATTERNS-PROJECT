package by.akisialiova.builder;

import java.util.List;

public interface ArmyBuilder {

    void setSoldiersCount(Integer count);

    void setThePowerfulWeapons(List<Weapons> weapon);

    void setTroopType(TroopTypes type);

}
