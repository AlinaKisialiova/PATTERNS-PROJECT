package by.akisialiova.singleton;

public class LazySingletonTest extends SingletonTest<LazySingleton> {

    public LazySingletonTest() {
        super(LazySingleton::getInstance);
    }
}