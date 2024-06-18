package one.digitalinnovation.gof.singleton;

/**
 * "Singleton Apressado"
 * @author diiggoo
 */
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){

        return instance;
    }

}