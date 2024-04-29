import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Math - класс содержащий кучу полезных статических методов
        //Math.random() - метод возвращает случайное веществ число от 0 включительно до 1 не включая
        System.out.println(Math.random());
        final int FROM = -50, TO = 50;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (TO - FROM + 1) + FROM);
        }
        System.out.println(Arrays.toString(arr1));

        //for each - цикл для перебора всех элементов массива от начала и до конца
        //for(тип имя : массив)
        System.out.println("Перебор при помощи for each");

        //в for each невидимо для глаза происходит итерированеи от 0 до length-1
        for (int elem : arr1) {   //каждую итерацию переменная элемент получает копию значения arr[i]
            //element = arr[i]
            System.out.println(elem);
        }
        System.out.println("----------------------------");
        for (int element : arr1) {
            element = 0;
        }
        //ПРИ ПОМОЩИ ЦИКЛА FOR EACH НЕЛЬЗЯ ПРИДАТЬ ЗНАЧЕНИЕ ЭЛЕМЕНТАМ МАССИВА ПРИМИТИВОВ,Т.К. ЭТОТ ЦИКЛ РАБОТАЕТ
        //НЕ С ЭЛЕМЕНТАМИ, А С ИХ КОПИЯМИ
        System.out.println(Arrays.toString(arr1));
    }
}
