package by.akisialiova.singleton;


import java.util.function.Supplier;

public class EnumSingletonTest extends SingletonTest<EnumSingleton> {

    public EnumSingletonTest() {
        super(() -> EnumSingleton.INSTANCE);
    }
}