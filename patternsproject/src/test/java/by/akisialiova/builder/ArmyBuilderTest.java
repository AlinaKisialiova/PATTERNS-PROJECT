package by.akisialiova.builder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArmyBuilderTest {

    @Test(expected = IllegalArgumentException.class)
    public void testMissRequiredFieldArmy() {
        new ArmyBuilderImpl(null);
    }

    @Test
    public void testUSSSRAviation() {
        Director director = new Director();
        ArmyBuilderImpl armyBuilder = new ArmyBuilderImpl(Countries.USSSR);
        director.constructAviation(armyBuilder);
        Army usssrAviation = armyBuilder.getResult();

        Assert.assertNotNull(usssrAviation);
        Assert.assertEquals(Countries.USSSR, usssrAviation.getCountry());
        Assert.assertEquals(TroopTypes.AVIATION, usssrAviation.getTroopType());
        Assert.assertEquals((Integer) 15_000, usssrAviation.getSoldiersCount());
        Assert.assertEquals(Weapons.YAK_9, usssrAviation.getThePowerfulWeapons().get(0));
    }

    @Test
    public void testGermanyInfantry() {
        Director director = new Director();
        ArmyBuilderImpl armyBuilder = new ArmyBuilderImpl(Countries.GERMANY);
        director.constructInfantry(armyBuilder);
        Army germanyAviation = armyBuilder.getResult();

        Assert.assertNotNull(germanyAviation);
        Assert.assertEquals(Countries.GERMANY, germanyAviation.getCountry());
        Assert.assertEquals(TroopTypes.INFANTRY, germanyAviation.getTroopType());
        Assert.assertEquals((Integer) 150_000, germanyAviation.getSoldiersCount());
        Assert.assertEquals(Weapons.MP_40, germanyAviation.getThePowerfulWeapons().get(0));
    }
}
