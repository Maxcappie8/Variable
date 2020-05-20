public class Person {

    String name = "Max";
    char sex = 'M';
    int age = 25;
    float height = 1.81f;
    float weight = 88.8f;

    void move() {
        System.out.println(name + "пошел");
    }

    void sit() {
        System.out.println(name + "сел");
    }

    void run() {
        System.out.println(name + "побежал");
    }

    String talk() {
        return "Какая-то фраза на человеческом";
    }

    boolean learnJava() {
        System.out.println(name + "Учит Java");
        return true;
    }
}
