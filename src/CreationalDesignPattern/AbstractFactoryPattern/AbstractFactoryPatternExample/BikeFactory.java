
package CreationalDesignPattern.AbstractFactoryPattern.AbstractFactoryPatternExample;

/**
 *
 * @author bethan
 */
public abstract class BikeFactory {        
    
    abstract Tire createTire();
    
    abstract Handlebar createHandlebar();        
    
}
