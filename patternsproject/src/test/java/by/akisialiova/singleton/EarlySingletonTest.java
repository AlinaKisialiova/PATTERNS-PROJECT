package by.akisialiova.singleton;

public class EarlySingletonTest extends SingletonTest<EarlySingleton>{

    public EarlySingletonTest() {
        super(EarlySingleton::getInstance);
    }
}
