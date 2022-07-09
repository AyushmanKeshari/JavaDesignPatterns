package CreationalDesignPattern.PrototypePattern.MutabilityExample;

//Common way to implement Prototype pattern is using Cloneable Interface.
public class Rabbit implements Cloneable {

    @Override
    public Rabbit clone() { //method is actually of java obj class. Cloneable interface has no methods
        try {
            Rabbit clone = (Rabbit) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original

            clone.owner = owner.clone(); //To accommodate mutable object : Person.
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
    private Person owner; //Mutable Field.

    public Rabbit() {

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        Person owner = new Person(name);
        this.owner = owner;
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
