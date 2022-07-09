package CreationalDesignPattern.FactoryMethodPattern.IntroducingHerarchies_problem;

import java.util.ArrayList;

public abstract class Candy {
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
