
package CreationalDesignPattern.AbstractFactoryPattern.ImplementExtensibleFactory;

/**
 *
 * @author bethan
 */
public abstract class BikeFactory {        
    
    abstract BikePart create(String type);
    
}
