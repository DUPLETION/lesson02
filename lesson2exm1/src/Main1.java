public class Main1 {
    public static void main(String[] args) {
        byte b1 =1;
        short sh1 =1;
        int i1 = 1;
        long l1 = 1;

        //в переменные типов данных большего объема можно записывать значеня переменных меньшего объема
        l1 = i1;

        //в меньшую записать большую нельзя без явнного преобразованяи типов(но возможна потеря данных)
        //sh1 = l1;


        float f1 = 2.1f;
        double d1 = 2.1;


        //аналогично целочисленным
        d1 = f1;


        boolean bool1 = false;
        //недоступно даже с учетом преобразования
        //bool1 = (boolean) 1;

        byte b2 = 2, b3 = 2, result = 0;


        //result = b2 + b3 - будет ошибка
        //продвижение типов данных при арифметике
        //byte, short, int - люьые выражения с ними приводят к появлению типа инт
        result = (byte) (b2 + b3);

        long resultL = 0;
        int resultI = 0;

        //если в арифметическом выражении есть переменная типа лонг то продвижение идет к типу лонг
        //resultI = i1 + l1; - не пройдет
        resultI = (int) (i1 + l1);
        resultL = l1 + i1;

        float resultF = 0;
        double resultD = 0;

        //float + double -> double
        resultF = (float) (f1 + d1);
        resultD = f1 + d1;

        //byte short int long float -> float

        //resultL = b1 + sh1 + i1 + l1 + f1; - будет ошибка

        resultF = b1 + sh1 + i1 + l1 + f1;


    }
}
