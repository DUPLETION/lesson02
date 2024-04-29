public class Main2 {
    public static void main(String[] args) {
        //выравнивание - ctrl+alt+l
        int x = 55;
        if (x > 100) {
            x++;
        } else {
            if (x > 10) {
                x -= 2;
            } else {
                x *= 3;
            }
        }
        System.out.println(x);
        if (x > 100) {
            x++;
        } else if (x > 10) {
            x -= 2;
        } else {
            x *= 3;
        }
        System.out.println(x);

    }
}
