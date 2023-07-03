import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenericHomeWorkMatrix {

//    Створіть шаблонний клас Array, що являє собою масив, що дає можливість зберігати об’єкти
//    заданого типу. Необхідно реалізувати:
// заповнення масиву з клавіатури
// заповнення масиву випадковими числами
// вивід масиву
// пошук максимального значення
// пошук мінімального значення
// підрахунок середньо арифметичного значення
// сортування масиву по зростанню
// сортування масиву по спаданню
// пошук значень в масиві, використовуючи бінарний пошук
// заміна значення в масиві на нове значення

   static public class Array<T extends Comparable<T>> {
       private T[] array;

       public Array(int size) {
           array = (T[]) new Comparable[size];
       }

       public void enterFromKeyboard() {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter array elements: ");
           for (int i = 0; i < array.length; i++) {
               System.out.print("Element " + (i + 1) + ": ");
               array[i] = (T) scanner.next();
           }
       }

       public void fillRandomly() {
           Random random = new Random();
           for (int i = 0; i < array.length; i++) {
               array[i] = (T) Integer.valueOf(random.nextInt(100));
           }
       }

       public void print() {
           System.out.println(Arrays.toString(array));
       }

       public T findMax() {
           T max = array[0];

           for (int i = 1; i < array.length; i++) {
               if (array[i].compareTo(max) > 0) {
                   max = array[i];
               }
           }

           return max;
       }

       public T findMin() {
           T min = array[0];

           for (int i = 1; i < array.length; i++) {
               if (array[i].compareTo(min) < 0) {
                   min = array[i];
               }
           }

           return min;
       }

       public double findAverage() {
           double sum = 0;

           for (int i = 0; i < array.length; i++) {
               // Assuming T is Number or a subclass of Number
               sum += ((Number) array[i]).doubleValue();
           }

           return sum / array.length;
       }

       public void sortAscending() {
           Arrays.sort(array);
       }

       public void sortDescending() {
           Arrays.sort(array, (a, b) -> b.compareTo(a));
       }

       public int binarySearch(T key) {
           return Arrays.binarySearch(array, key);
       }

       public void replaceValue(T oldValue, T newValue) {
           for (int i = 0; i < array.length; i++) {
               if (array[i].equals(oldValue)) {
                   array[i] = newValue;
               }
           }
       }
   }
    public static void main(String[]arg)
    {

        Array<Integer> intArray = new Array<>(5);
        intArray.enterFromKeyboard();
        intArray.print();

        //----------------------------
        Array<Integer> sortedIntArray = new Array<>(5);
        sortedIntArray.fillRandomly();
        sortedIntArray.sortDescending();
        sortedIntArray.print();
        System.out.println("Max: " + sortedIntArray.findMax());

    }
}
