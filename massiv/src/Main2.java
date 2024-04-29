import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        //const - слово есть но за ним ничего не закреплено
        //а используется - final - слово к-е означает, что величина может быть проинициализирована только 1 раз

        final int SIZE = 10;
        int[] arr1 = new int[SIZE];//int[] - int*


        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();//для перевода курсора на новую строку после вывода массива

        //альтернативная форма создания массива
        int arr2[] = new int[SIZE];

        //создание массива и его инициализация

        int[] arr3 = new int[]{1, 2, 3, 4, -10, 5};

        System.out.println("Вывод массива в обратном порядке");
        for (int i = arr3.length - 1; i >= 0; i--) {
            System.out.println(arr3[i]);

        }

        //альтернативное создание массива и инициализация без new

        int[] arr4 = {1, 5, -45, 9, 17};
        //отсутствие new не означает что не создается объект

        //Arrays - класс который содержит множество удобных для работы с массивами статических методов
        //Arrays.toString(arr4);//метод возвращает массив в виде строки
        System.out.println(Arrays.toString(arr4));
    }
}
