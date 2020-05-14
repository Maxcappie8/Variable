public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 21;
        char sex = 'M';
        double height = 1.75d;
        char firstLetterName = 'W';

        if (age > 20) {
            System.out.println("Возраст больше 21 года.");
        }

        if (sex == 'M') {
            System.out.println("Пол мужской");
        }

        if (sex != 'M') {
            System.out.println("Пол НЕ мужской");
        }

        if (height < 1.80) {
            System.out.println("Получается ниже 180 см.");
        } else {
            System.out.println("Получается выше 180 см.");
        }

        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на \"М\"");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается на \"I\"");
        } else {
            System.out.println("Не понятно как начинается имя..");
        }
    }
}