//Abstract Class Example
abstract class Animal
{
    abstract void makeSound();
    public void eat()
    {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal
{
    public void makeSound()
    {
        System.out.println("Bark bark.");
    }
}

public class Program81 
{
    public static void main(String[] args)
    {
        Dog obj=new Dog();
        obj.makeSound();
        obj.eat();
    }   
}