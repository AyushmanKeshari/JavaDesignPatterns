package CreationalDesignPattern.PrototypePattern.PrototypeExample;

public class Rabbit implements Cloneable {

    @Override
    public Rabbit clone() { //method is actually of java obj class. Cloneable interface has no methods
        try {
            Rabbit clone = (Rabbit) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LION_HEAD,
        DUTCH
    }

    private int age;
    private Breed breed;

    public Rabbit() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
