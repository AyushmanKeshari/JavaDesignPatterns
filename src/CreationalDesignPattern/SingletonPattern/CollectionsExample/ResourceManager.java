package CreationalDesignPattern.SingletonPattern.CollectionsExample;

import java.util.Collections;
import java.util.List;

//Using singletonList, singletonMap, singleton
public class ResourceManager {

    public static void main(String[] args) {

        PrintSpooler spooler = new PrintSpooler();

        List<PrintSpooler> spoolers = Collections.singletonList(spooler);   //Immutable List
        processResources(spoolers);

        PrintSpooler spooler1 = new PrintSpooler();
//        spoolers.add(spooler1); //Error : UnsupportedOperationException :  No more PrintSpooler object can be added, Singleton
    }

    //This method takes list of Resource managers as parameter
    public static <Type> void processResources(List<Type> list) {
        for (Type p: list) {
            //Code to process resources
        }
    }
}
