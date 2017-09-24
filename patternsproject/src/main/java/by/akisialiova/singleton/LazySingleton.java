package by.akisialiova.singleton;

/**
 * + Lazy Loading
 * - Low productivity (critical section (synchronized))
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){ }

    public static synchronized LazySingleton getInstance(){
        if(instance ==  null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
