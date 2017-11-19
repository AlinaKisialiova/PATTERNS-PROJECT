package by.akisialiova.abstract_factory;

import by.akisialiova.abstract_factory.impl.BelarusianNationFactory;
import by.akisialiova.abstract_factory.impl.ChineseNationFactory;
import by.akisialiova.abstract_factory.impl.IndianNationFactory;

import java.util.Random;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 *
 * + Ensures the compatibility of products.
 * + Eliminates the client code from binding to specific product classes.
 * + Highlights the code of production of products in one place, simplifying code support.
 * + Simplifies the addition of new products to the program.
 * + It implements the principle of openness / closure.
 *
 * - Complicates the program code due to a number of additional classes.
 * - Requires the availability of all types of products in each variation.
 */
public class Main {

    private static AbstractNationFactory nationFactory;

    public static void main(String[] args) {
        configure();
        Territory territory = nationFactory.createTerritory();
        Language language = nationFactory.createLanguage();
        History history = nationFactory.createHistory();
        System.out.println("I am God of nations! Now I am creating... " +
                nationFactory + ".\n "+ language.getDescription() +
                "We have territory about " + territory.getDescription() + ". We have been known " + history.getDescription());
    }

    private static void configure() {
        int holyRandom = new Random().nextInt(3);
        switch (holyRandom){
            case 1: nationFactory = new BelarusianNationFactory(); break;
            case 2: nationFactory = new ChineseNationFactory(); break;
            case 3: nationFactory = new IndianNationFactory(); break;
            default: throw new IllegalArgumentException("Ah, I do not want create anything!");
        }
    }
}
