package lr2;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Неизвестно";
        this.age = 0;
        this.gender = "Не указан";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void printInfo() {
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
        System.out.println("Пол: " + this.gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Майкл Джордан", 63, "мужской");
        person1.printInfo();
        person1.setName("Валера Андреев");
        person1.setAge(11);
        person1.setGender("Мужской");
        System.out.println("\nИзмененные данные:");
        person1.printInfo();
    }
}
