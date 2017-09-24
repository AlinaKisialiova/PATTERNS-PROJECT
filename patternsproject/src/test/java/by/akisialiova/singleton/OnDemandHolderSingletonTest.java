package by.akisialiova.singleton;

public class OnDemandHolderSingletonTest extends SingletonTest<OnDemandHolderSingleton> {

    public OnDemandHolderSingletonTest() {
        super(OnDemandHolderSingleton::getInstance);
    }
}