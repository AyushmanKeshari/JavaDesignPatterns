
package CreationalDesignPattern.AbstractFactoryPattern.ImplementExtensibleFactory;

/**
 *
 * @author bethan
 */
public class MountainBikeFactory extends BikeFactory {

    @Override
    BikePart create(String type) {
        if(type.equalsIgnoreCase("tire")) {
            return new MountainBikeTire();
        } else if (type.equalsIgnoreCase("handler")) {
            return new MountainBikeHandlebar();
        } else {
            return null;
        }
    }
}
