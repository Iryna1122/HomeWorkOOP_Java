import java.util.Arrays;

public class Module2Part3_GENERIC {

    //Напишіть шаблонний метод, що повертає максимум із трьох переданих параметрів
    public static <T extends Comparable<T>>T getMax(T a,T b,T c)
    {
       T max=a;
       if(b.compareTo(max)>0)
       {
           max=b;
       }
       if(c.compareTo(max)>0)
       {
           max=c;
       }
       return max;
    }

    //Напишіть шаблонний метод, що повертає мінімум із п’яти переданих параметріv
    public static <T extends Comparable <T>> T getMin(T a,T b, T c, T d, T e)
    {
        T min=a;
        if(b.compareTo(min)<0){
            min=b;
        }
        if(c.compareTo(min)<0)
        {
            min=c;
        }
        if(d.compareTo(min)<0)
        {
            min=d;
        }
        if(e.compareTo(min)<0)
        {
            min=e;
        }

        return min;
    }

    //Напишіть шаблонний метод для пошуку середньо арифметичного значення в масив
    public static <T extends Number> double calculateAvg(T[] arr)
    {
        if(arr==null || arr.length==0)
        {
            return 0.0;
        }
        double sum=0.0;

        for (T element:arr){
            sum+=element.doubleValue();
    }
        return sum/arr.length;
    }

    //Реалізуйте шаблонний метод для пошуку максимуму в масиві

    public static <T extends Comparable<T>> T findMaximum(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maximum) > 0) {
                maximum = array[i];
            }
        }
        return maximum;
    }
    //Реалізуйте шаблонний метод для пошуку мінімуму в масиві
    public static <T extends Comparable<T>> T findMinimum(T []arr)
    {
        T min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].compareTo(min)<0)
            {
                min=arr[i];
            }
        }
        return min;
    }

    //Реалізуйте шаблонний метод для сортування масиву
    public static <T extends Comparable<T>> void sortArr(T [] arr)
    {
        Arrays.sort(arr);
    }

    //Реалізуйте шаблонний метод для двійкового пошуку в масивi
    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right)/ 2;
            int comparison = key.compareTo(array[mid]);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[]arg)
    {
        //MAX from 3 digit
        int maxInt=getMax(1,15,30);
        System.out.println("Int Max = "+ maxInt);

        //MIN from 5 digit
        int minInt=getMin(5,7,3,8,9);
        System.out.println("Int Min = "+ minInt );

        // Average from array
        Integer[] array={1,10,20,30,40};
        double intAvg=calculateAvg(array);
        System.out.println("Average:  "+intAvg);

        //MAX
        Integer[] intArray = {5, 2, 9, 1, 7,3};
        Integer maxInteger = findMaximum(intArray);
        System.out.println("Maximum Integer: " + maxInteger);

        //MIN
        Integer minInteger = findMinimum(intArray);
        System.out.println("Minimum Integer: " + minInteger);


        //SORT

        System.out.println("Original array: "+ Arrays.toString(intArray));
        sortArr(intArray);
        System.out.println("Sorted array: "+ Arrays.toString(intArray));

        //Binary find

        int keyInt = 3;
        int indexInt = binarySearch(intArray, keyInt);
        System.out.println("Index of " + keyInt + " in Integer Array: " + indexInt);
    }
}
