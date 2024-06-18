package one.digitalinnovation.gof.singleton;

/**
 * "Singleton Preguiçoso"
 * @author diiggoo
 */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}