package CreationalDesignPattern.PrototypePattern.MutabilityExample;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setOwner("Bethan");

        Rabbit rabbitCopy = rabbit.clone();

        System.out.println("Owner of original rabbit : " + rabbit.getOwner().getName());
        System.out.println("Owner of cloned rabbit : " + rabbitCopy.getOwner().getName());

        rabbitCopy.getOwner().setName("Palmer");
        //Problem : Mutable object person, Name of original owner is also changed.  Share same obj Person.
        //Solution : Implement clone method for Person object as well.

        System.out.println(rabbit.getOwner().getName());
        System.out.println(rabbitCopy.getOwner().getName());
    }
}
