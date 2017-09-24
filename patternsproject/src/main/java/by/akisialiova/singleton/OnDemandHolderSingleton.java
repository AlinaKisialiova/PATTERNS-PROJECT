package by.akisialiova.singleton;

/**
 * + Lazy, high productivity
 * - May be problems when use several Class Loaders, can not be used for non-static class fields
 */
public class OnDemandHolderSingleton {

    private OnDemandHolderSingleton() {
    }

    public static OnDemandHolderSingleton getInstance(){
        return Holder.INSTANCE;
    }

    //Nested classes are initialized when they are first used
    private static class Holder{
        private static final OnDemandHolderSingleton INSTANCE = new OnDemandHolderSingleton();
    }
}
