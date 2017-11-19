package by.akisialiova.abstract_factory.impl;

import by.akisialiova.abstract_factory.AbstractNationFactory;
import by.akisialiova.abstract_factory.History;
import by.akisialiova.abstract_factory.Language;
import by.akisialiova.abstract_factory.Territory;
import by.akisialiova.abstract_factory.impl.nations.chinese.ChineseHistory;
import by.akisialiova.abstract_factory.impl.nations.chinese.ChineseLanguage;
import by.akisialiova.abstract_factory.impl.nations.chinese.ChineseTerritory;

public class ChineseNationFactory implements AbstractNationFactory{

    @Override
    public Territory createTerritory() {
        return new ChineseTerritory();
    }

    @Override
    public History createHistory() {
        return new ChineseHistory();
    }

    @Override
    public Language createLanguage() {
        return new ChineseLanguage();
    }

    @Override
    public String toString() {
        return "Chinese nation";
    }
}
