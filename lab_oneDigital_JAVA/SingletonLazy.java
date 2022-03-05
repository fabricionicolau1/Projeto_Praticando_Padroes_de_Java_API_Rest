package lab_oneDigital_JAVA;

// * Singleton "preguiçoso".

//**

/***@author fabricionicolau1
 *
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
