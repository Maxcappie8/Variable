public class Wolf {

    char sex;
    String name;
    float weight;
    int age;
    String color;

    void move() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    String howl() {
        System.out.println(name + " издает вой: ауууу");
        return "ayyyy";
    }
}
