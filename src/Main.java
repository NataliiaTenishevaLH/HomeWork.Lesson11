import java.util.*;

public class Main {

    public static void main(String args[]){

        // 1. Вызов метода, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов
        ArrayList<String> listArray = new ArrayList<String>();
        listArray.add("One");
        listArray.add("Two");
        listArray.add("Three");
        listArray.add("Four");
        listArray.add("Five");
        listArray.add("One");
        listArray.add("Six");
        listArray.add("One");

        System.out.println(Arrays.asList(listArray));
        System.out.println(getUniqueList(listArray));

       // 2. Вызов итератора по массиву
        String array[] = {"1", "2", "3", "4","5", "6" ,"7", "8"};
         Iterator<String> iterator = new ArrayIterator(array);
         while(iterator.hasNext()){
               System.out.println(iterator.next());
               iterator.remove();
         }

         //3. Вычисление корней квадратного уравнения
         calculate(10, 400, 12);
    }

    //метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов
    public static Set<String> getUniqueList(ArrayList<String> arrayList){
        Set<String> set = new HashSet<String>(arrayList);
        return set;
    }

    //метод для вычисления корней квадратного уравнения
    public static void calculate(double a, double b, double c){
        double D;

        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.printf("Корни уравнения: x1 = %.2f, x2 = %.2f", x1, x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.printf("Уравнение имеет один корень: x = %.2f", x);
        }
        else {
            System.out.println("Уравнение не имеет корней!");
        }
    }


}
