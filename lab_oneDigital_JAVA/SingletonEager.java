package lab_oneDigital_JAVA;

// * Singleton "Apressado".

//**

/***@author falvojr
 *
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
