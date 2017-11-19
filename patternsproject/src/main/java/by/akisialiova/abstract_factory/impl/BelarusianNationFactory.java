package by.akisialiova.abstract_factory.impl;

import by.akisialiova.abstract_factory.AbstractNationFactory;
import by.akisialiova.abstract_factory.History;
import by.akisialiova.abstract_factory.Language;
import by.akisialiova.abstract_factory.Territory;
import by.akisialiova.abstract_factory.impl.nations.belarusian.BelarusianHistory;
import by.akisialiova.abstract_factory.impl.nations.belarusian.BelarusianLanguage;
import by.akisialiova.abstract_factory.impl.nations.belarusian.BelarusianTerritory;

public class BelarusianNationFactory implements AbstractNationFactory {

    @Override
    public Territory createTerritory() {
        return new BelarusianTerritory();
    }

    @Override
    public History createHistory() {
        return new BelarusianHistory();
    }

    @Override
    public Language createLanguage() {
        return new BelarusianLanguage();
    }

    @Override
    public String toString() {
        return "Belarusian nation";
    }
}
