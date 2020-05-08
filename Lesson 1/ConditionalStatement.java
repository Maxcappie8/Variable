public class ConditionalStatement {

    public static void main(String[] args) {

        int Age = 21;
        char Sex = 'M';
        double Height = 1.75d;
        char FirstLetterName = 'W';

        if (Age > 20) {
            System.out.println("Возраст больше 21 года.");
        }

        if (Sex == 'M') {
            System.out.println("Пол мужской");
        }

        if (Sex != 'M') {
            System.out.println("Пол НЕ мужской");
        }

        if (Height < 1.80) {
            System.out.println("Получается ниже 180 см.");
        } else {
            System.out.println("Получается выше 180 см.");
        }

        if(FirstLetterName == 'M'){
            System.out.println("Имя начинается на \"М\"");
        } else if(FirstLetterName == 'I'){
            System.out.println("Имя начинается на \"I\"");
        } else {
            System.out.println("Не понятно как начинается имя..");
        }

    }
}