
package CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryPatternExample;

/**
 *
 * @author bethan
 */
public class BikeBuilder {    

    public static void main(String[] args) {
        
        createBikeWithoutAbstractFactory();
        
        createBikeWithAbstractFactory("mountain bike");
        createBikeWithAbstractFactory("road bike");

        //Try to create Road bike with both methods.  Which is easy?
    }
    
    public static void createBikeWithoutAbstractFactory() {
        //Need to completely Re-write it, if there is a need to create Road bike.
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();        
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();  
        
    }
    
    public static void createBikeWithAbstractFactory(String type) {
        
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);        
        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        Handlebar handlebar = bikeFactory.createHandlebar();
        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();  
        System.out.println();
        
    }
    
}
