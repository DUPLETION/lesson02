public class Main4 {
    public static void main(String[] args) {
        //switch
        //по номеру поры года вывести название(1 зима и т.д.)

        int x = 2;

        switch (x) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;

            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Что-то не так");
                break;


        }
    }
}
