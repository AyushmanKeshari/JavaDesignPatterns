
package CreationalDesignPattern.FactoryMethodPattern.CompleteFactoryMethodPattern;

import java.util.ArrayList;

/**
 *
 * @author bethan
 */
public class HardCandy_Peppermint extends Candy {
    
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList<Candy> hardCandyPackage = new ArrayList<>();
        for(int i = 1; i <= quantity; i++) {
            HardCandy_Peppermint hardCandy_Peppermint = new HardCandy_Peppermint(); 
            hardCandyPackage.add(hardCandy_Peppermint);
        }
        
        System.out.println("One package of " + quantity + " peppermints has been made!");
        return hardCandyPackage;
        
    }    
}
