package by.akisialiova.singleton;

public class DoubleCheckedLockingSingletonTest extends SingletonTest<DoubleCheckedLockingSingleton> {

    public DoubleCheckedLockingSingletonTest() {
        super(DoubleCheckedLockingSingleton::getInstance);
    }
}
