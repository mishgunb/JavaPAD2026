package lr2.Task8;

public class Main1 {
    public static void main(String[] args) {

        Dog dog = new Dog("Гаврик", 1, "Мопс");
        Cat cat = new Cat("Муся", 4, "Рыба");
        Bird bird = new Bird("Кеша", 1, true);


        dog.displayInfo();
        dog.makeSound();
        dog.fetch();

        cat.displayInfo();
        cat.makeSound();
        cat.sleep();

        bird.displayInfo();
        bird.makeSound();
        bird.fly();
    }
}