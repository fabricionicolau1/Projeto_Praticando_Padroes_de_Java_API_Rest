package lab_oneDigital_JAVA;

// * Singleton "lzy holder".

//**

/***@author fabricionicolau1
 *
 */
public class SingletonHolder {

    private static class instanceHolder {
        public static SingletonHolder instancia = new SingletonHolder();
    }
    private SingletonHolder() {
        super();
    }

    public static SingletonHolder getInstancia() {
        return instanceHolder.instancia;
    }

}
