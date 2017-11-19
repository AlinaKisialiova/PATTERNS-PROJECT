package by.akisialiova.abstract_factory;

public interface AbstractNationFactory {

    Territory createTerritory();

    History createHistory();

    Language createLanguage();
}
