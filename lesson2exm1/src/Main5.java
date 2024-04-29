import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //считывание из консоли
        //System.in - в чистом виде не удобно для считывания
        //для удобного считывания в Java испольщуют класс Scanner.универсальный/читает с консоли и файлов
        //для считывания нужно создать объект лкасса

        Scanner s1 = new Scanner(System.in);
        //s1 - ссылка, усовершенствованный указатель
        //любая переменная созданная на основании непримитивного типа данных в Java считается ссылкой и хранит не значениеб а адрес

        int x = 0;
        System.out.println("Введите число");
        //s1.nextInt() - возвращает из консоли int
        x = s1.nextInt();
        System.out.println(x);
        System.out.println("Считано число: " + x);

    }
}
