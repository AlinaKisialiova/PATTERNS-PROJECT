package by.akisialiova.singleton;

/**
 * + Lazy loading, high productivity
 */
public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton instance;

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            //Synchronization is useful only first time. After that it just get time. So use double check
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
