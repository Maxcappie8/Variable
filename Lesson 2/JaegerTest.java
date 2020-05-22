public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jeagerCA = new Jaeger("Cherno Alpha", "MARK-1", "RUSSIA", 85.34f, 2.412f, 3, 10, 10);
        Jaeger jeagerSE = new Jaeger("Striker Eureka", "MARK-5", "AUSTRALIA", 76.2f, 1.850f, 10, 10, 9);

        System.out.println(jeagerCA.getName() + " speed: " + jeagerCA.getSpeed());
        System.out.println(jeagerSE.getName() + " speed: " + jeagerSE.getSpeed());
        jeagerCA.setSpeed(99);
        jeagerSE.setSpeed(77);
        System.out.println(jeagerCA.getName() + " speed: " + jeagerCA.getSpeed());
        System.out.println(jeagerSE.getName() + " speed: " + jeagerSE.getSpeed());
    }
}
