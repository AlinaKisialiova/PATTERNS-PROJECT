package by.akisialiova.abstract_factory.impl;

import by.akisialiova.abstract_factory.AbstractNationFactory;
import by.akisialiova.abstract_factory.History;
import by.akisialiova.abstract_factory.Language;
import by.akisialiova.abstract_factory.Territory;
import by.akisialiova.abstract_factory.impl.nations.indian.IndianHistory;
import by.akisialiova.abstract_factory.impl.nations.indian.IndianLanguage;
import by.akisialiova.abstract_factory.impl.nations.indian.IndianTerritory;

public class IndianNationFactory implements AbstractNationFactory {

    @Override
    public Territory createTerritory() {
        return new IndianTerritory();
    }

    @Override
    public History createHistory() {
        return new IndianHistory();
    }

    @Override
    public Language createLanguage() {
        return new IndianLanguage();
    }

    @Override
    public String toString() {
        return "Indian nation";
    }
}
