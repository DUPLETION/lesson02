public class Main1 {
    public static void main(String[] args) {
        //циклы for while do while полностью аналогичны циклам си++
        //в Java массивы считаютс объектами,однако класс описывающий массивы реализован не средствами джава
        //int[] arr1 = null; - ссылка ни на что не указывает
        int[] arr1 = null;
        arr1 = new int[5];
        //изменить размер уже созданного массива нельзя
        System.out.println(arr1.length);
        System.out.println(arr1[1]);
        System.out.println(arr1[arr1.length-1]);
        //Java числовые массивы автоматически заполняются 0, ссылки null
    }
}
