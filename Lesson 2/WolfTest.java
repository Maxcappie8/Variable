public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Vasiliy";
        System.out.println("Кличка волка: " + wolfOne.name);
        wolfOne.age = 7;
        System.out.println("Возраст: " + wolfOne.age);
        wolfOne.color = "white";
        System.out.println("Окрас: " + wolfOne.color);
        wolfOne.sex = 'M';
        System.out.println("Пол: " + wolfOne.sex);
        wolfOne.weight = 23.5f;
        System.out.println("Вес: " + wolfOne.weight);
        wolfOne.move();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.sit();
        wolfOne.hunt();
    }
}
