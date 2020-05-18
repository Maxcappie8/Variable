public class MyFirstGame {

    public static void main(String[] args) {
        int randomNumber = 10;
        // начальное значение, введеное играком
        int userNumber = 4;
        do {
            // проверка введеного играком числа
            if (userNumber > randomNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNumber--;
            } else if (userNumber < randomNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNumber++;
            }
        } while (randomNumber != userNumber);
        System.out.println("Вы угадали!");
    }
}
