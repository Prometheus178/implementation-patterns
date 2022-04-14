package creational.singleton.multithread.naive;

public class MultithreadSingleton {

    private static volatile MultithreadSingleton instance;
    public String value;

    private MultithreadSingleton(String value) {
        // Этот код эмулирует медленную инициализацию.
        this.value = value;
    }

    public static MultithreadSingleton getInstance(String value) {
        MultithreadSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(MultithreadSingleton.class) {
            if (instance == null) {
                instance = new MultithreadSingleton(value);
            }
            return instance;
        }
    }
}
