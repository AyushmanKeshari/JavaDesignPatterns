package CreationalDesignPattern.SingletonPattern.singleton;

//Singleton Class

//Use Synchronized
//Lazy initialization is preferred over Eager initialization :  Java implements lazy internally so Eager will not work even if defined.
public class PrintSpooler {

//    Eager Initialization
//    private static final PrintSpooler spooler = new PrintSpooler();

    private static PrintSpooler spooler;

    private static boolean initialized = false;

    //Private Constructor: No class can create its object.
    private PrintSpooler() {
    }

    private void init() {
        //Code to initialize print spooler
        System.out.println("init");
    }

    //Synchronize: Java keyword to restrict access to a method. To solve concurrency problem from multiple thread.
    //Provide Single instance always.
    public static synchronized PrintSpooler getInstance() {

        System.out.println("PrintSpooler");
        if (initialized) return spooler;

        spooler = new PrintSpooler();   //Lazy initialization : Object created when required.
        spooler.init();
        initialized = true;
        return spooler;
    }
}
