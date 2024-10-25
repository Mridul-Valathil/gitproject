/**
 * Demonstrates different types of inheritance in Java.
 * Contains examples of single inheritance, multilevel inheritance,
 * hierarchical inheritance, and interface-based inheritance.
 * 
 * @author Mridul PV
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        
        dog.speak();
        cat.speak();
        
        Labrador labrador = new Labrador("Max");
        labrador.speak();
        labrador.fetch();
        
        AnimalInterface animalInterfaceDog = labrador;
        animalInterfaceDog.eat();
    }
}

/**
 * Represents a basic animal with a name.
 * Serves as the base class for single and hierarchical inheritance.
 * 
 * @author Mridul PV
 */
class Animal {
    protected String name;
    
    /**
     * Constructor for the Animal class.
     *
     * @param name the name of the animal
     * @param a simple param
     */
    public Animal(String name,int a) {
        this.name = name;
    }
    //first commit 
    /**
     * Prints a generic sound message.
     */
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

/**
 * Represents a Dog, a subclass of Animal.
 * Demonstrates single inheritance.
 * 
 * @author Mridul PV
 */
class Dog extends Animal {
    /**
     * Constructor for the Dog class.
     *
     * @param name the name of the dog
     */
    public Dog(String name) {
        super(name);
    }
    
    /**
     * Overrides the speak method to demonstrate polymorphism.
     */
    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }
}

/**
 * Represents a Labrador, a subclass of Dog.
 * Demonstrates multilevel inheritance.
 * Implements the AnimalInterface.
 * 
 * @author Mridul PV
 */
class Labrador extends Dog implements AnimalInterface {
    /**
     * Constructor for the Labrador class.
     *
     * @param name the name of the labrador
     */
    public Labrador(String name) {
        super(name);
    }
    
    /**
     * A specific behavior for Labrador.
     */
    public void fetch() {
        System.out.println(name + " fetches the ball.");
    }
    
    /**
     * Implementation of the eat method from AnimalInterface.
     */
    @Override
    public void eat() {
        System.out.println(name + " eats food.");
    }
}

/**
 * Represents a Cat, another subclass of Animal.
 * Demonstrates hierarchical inheritance.
 * 
 * @author Mridul PV
 */
class Cat extends Animal {
    /**
     * Constructor for the Cat class.
     *
     * @param name the name of the cat
     */
    public Cat(String name) {
        super(name);
    }
    
    /**
     * Overrides the speak method to demonstrate polymorphism.
     */
    @Override
    public void speak() {
        System.out.println(name + " meows.");
    }
}

/**
 * An interface representing additional behaviors for animals.
 * Demonstrates interface-based inheritance.
 * 
 * @author Mridul PV
 */
interface AnimalInterface {
    /**
     * Defines the eat behavior.
     */
    void eat();
}
