public class MyFirstGame {

    public static void main(String[] args) {
        int randomNumber = 40;
        int usersNumber;
        do {
            // игрок вводит число
            usersNumber = 40;
            // проверка введеного играком числа
            if (usersNumber > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (usersNumber < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            }
        } while (randomNumber != usersNumber);
        System.out.println("Вы угадали!");
    }
}
