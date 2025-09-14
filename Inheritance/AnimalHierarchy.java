// Superclass
class Animal {
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Common method
    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Dog
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    // Overriding method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    // Overriding method
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    // Overriding method
    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}

// Main class to test
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);

        // Polymorphism: same method behaves differently
        dog.showInfo();
        dog.makeSound();

        cat.showInfo();
        cat.makeSound();

        bird.showInfo();
        bird.makeSound();
    }
}
