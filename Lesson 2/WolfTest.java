public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Vasiliy");
        System.out.println("Кличка волка: " + wolfOne.getName());
        wolfOne.setAge(6);
        System.out.println("Возраст: " + wolfOne.getAge());
        wolfOne.setColor("White");
        System.out.println("Окрас: " + wolfOne.getColor());
        wolfOne.setSex('M');
        System.out.println("Пол: " + wolfOne.getSex());
        wolfOne.setWeight(22.3f);
        System.out.println("Вес: " + wolfOne.getWeight());
        wolfOne.move();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.sit();
        wolfOne.hunt();
    }
}