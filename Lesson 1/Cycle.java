public class Cycle {

    public static void main(String[] args) {
        //Выведите на консоль с помощью цикла for все числа от [0, 20]
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        //Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
        int a = 6;
        while (a > -7) {
            System.out.println(a);
            a -= 2;
        }

        //Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20], и выведите ее на консоль
        int b = 11;
        int sum = 0;
        do {
            sum += b;
            b += 2;
        } while (b < 21);
        System.out.println(sum);
    }
}
