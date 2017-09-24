package by.akisialiova.singleton;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public abstract class SingletonTest<S> {

    private final Supplier<S> singletonInstanceMethod;

    public SingletonTest(Supplier<S> singletonInstanceMethod) {
        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    @Test
    public void testOneThreadingClassIsSingleton() {
        S instance1 = this.singletonInstanceMethod.get();
        S instance2 = this.singletonInstanceMethod.get();
        assertSame(instance1, instance2);
    }

    @Test
    public void testMultiThreadingClassIsSingleton() throws Exception {
        final List<Callable<S>> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add(this.singletonInstanceMethod::get);
        }

        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        final List<Future<S>> results = executorService.invokeAll(tasks);

        final S expectedInstance = this.singletonInstanceMethod.get();
        for (Future<S> res : results) {
            final S instance = res.get();
            assertNotNull(instance);
            assertSame(expectedInstance, instance);
        }

        executorService.shutdown();

    }
}
