public class Wolf {

    private char sex;
    private String name;
    private float weight;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println(name + " идет");
    }

    public void sit() {
        System.out.println(name + " сидит");
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public String howl() {
        System.out.println(name + " издает вой: \"ауууу\"");
        return "ayyyy";
    }

    public void hunt() {
        System.out.println(name + " вышел на охоту..");
    }
}