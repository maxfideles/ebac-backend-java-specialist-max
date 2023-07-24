public final class Singleton {

    private static Singleton singleton;

    //private constructor
    private Singleton(){

    }

    //creating the method
    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return  singleton;
    }
}
