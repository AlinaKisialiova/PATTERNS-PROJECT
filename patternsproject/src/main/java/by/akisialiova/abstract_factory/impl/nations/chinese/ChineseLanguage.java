package by.akisialiova.abstract_factory.impl.nations.chinese;

import by.akisialiova.abstract_factory.Language;

public class ChineseLanguage implements Language {

    @Override
    public String getDescription() {
        return "你好世界！";
    }
}
