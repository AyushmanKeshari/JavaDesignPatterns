package CreationalDesignPattern.SingletonPattern.singleton;

public class ResourceManager {

    public static void main(String[] args) {
//        PrintSpooler printSpooler = new PrintSpooler();   //Error because private Constructor

//        PrintSpooler spooler = PrintSpooler.getInstance();


        //Problem of Concurrency without Synchronized
        Thread thread1 =  new Thread( ()-> { PrintSpooler s = PrintSpooler.getInstance();});
        Thread thread2 = new Thread( ()-> { PrintSpooler s = PrintSpooler.getInstance();});

        thread1.start();
        thread2.start();
    }
}
