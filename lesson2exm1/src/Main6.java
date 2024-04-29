import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //ввести номер дня недели и опред это будний или выходной
        System.out.println("Введите номер дня недели");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

//        switch (day) {
//            case 1:
//                System.out.println("Будний");
//                break;
//            case 2:
//                System.out.println("Будний");
//                break;
//            case 3:
//                System.out.println("Будний");
//                break;
//            case 4:
//                System.out.println("Будний");
//                break;
//            case 5:
//                System.out.println("Будний");
//                break;
//            case 6:
//                System.out.println("Выходной");
//                break;
//            case 7:
//                System.out.println("Выходной");
//                break;
//            default:
//                System.out.println("Что-то не так");
//                break;
//
//        }
//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Будний");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Выходной");
//                break;
//            default:
//                System.out.println("Что-то пошло не так");
//                break;
//        }
        switch (day){
            case 1,2,3,4,5:
                System.out.println("Будний");
                break;
            case 6,7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;

        }
        //switch - может принимать целые числа, символы, строки и перечисления
    }
}
