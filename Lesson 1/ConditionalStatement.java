public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 21;
        if (age > 20) {
            System.out.println("Возраст больше 21 года.");
        }

        char sex = 'M';
        if (sex == 'M') {
            System.out.println("Пол мужской");
        }

        if (sex != 'M') {
            System.out.println("Пол НЕ мужской");
        }

        double height = 1.75d;
        if (height < 1.80) {
            System.out.println("Получается ниже 180 см.");
        } else {
            System.out.println("Получается выше 180 см.");
        }

        char firstLetterName = 'W';
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на \"М\"");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается на \"I\"");
        } else {
            System.out.println("Не понятно как начинается имя..");
        }
    }
}