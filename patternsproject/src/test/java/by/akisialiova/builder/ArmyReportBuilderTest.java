package by.akisialiova.builder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArmyReportBuilderTest {


    @Test(expected = IllegalArgumentException.class)
    public void testMissRequiredFieldReport() {
        new ArmyReportBuilder(null);
    }

    @Test
    public void testArmyAviationReport() {
        Director director = new Director();
        List<Countries> countries = Arrays.asList(Countries.USSSR, Countries.GERMANY);
        ArmyReportBuilder armyBuilder = new ArmyReportBuilder(countries);
        director.constructArmyAviationReport(armyBuilder);
        ArmyReport report = armyBuilder.getResult();

        Assert.assertNotNull(report);
        Assert.assertEquals(countries, report.getCountries());
        Assert.assertEquals((Integer) 165_000, report.getSoldiersCount());
        Assert.assertEquals((Integer) 33_000, report.getNumberOfDeaths());
        List<Weapons> weapons = Arrays.asList(Weapons.YAK_9, Weapons.MESSERSCHMITT_BF_10);
        Assert.assertEquals(weapons, report.getThePowerfulWeapons());
        Assert.assertEquals(TroopTypes.AVIATION, report.getTroopType());
    }
}
