public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking ");
    }
    public static void main(String[] args){
        Dog animal = new Dog();
        animal.bark();
        animal.eat();
    }

}
