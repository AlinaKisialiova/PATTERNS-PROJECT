package by.akisialiova.builder;

import java.util.Arrays;
import java.util.Collections;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructAviation(ArmyBuilder builder) {
        builder.setThePowerfulWeapons(Collections.singletonList(Weapons.YAK_9));
        builder.setSoldiersCount(15_000);
        builder.setTroopType(TroopTypes.AVIATION);
    }


    public void constructInfantry(ArmyBuilder builder) {
        builder.setThePowerfulWeapons(Collections.singletonList(Weapons.MP_40));
        builder.setSoldiersCount(150_000);
        builder.setTroopType(TroopTypes.INFANTRY);
    }

    public void constructArmyAviationReport(ArmyBuilder builder) {
        builder.setTroopType(TroopTypes.AVIATION);
        builder.setSoldiersCount(165_000);
        builder.setThePowerfulWeapons(Arrays.asList(Weapons.YAK_9, Weapons.MESSERSCHMITT_BF_10));
    }
}
