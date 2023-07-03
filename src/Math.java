import java.lang.reflect.Array;
import java.util.Arrays;

public class Math {
    public static void main(String[]arg)
    {
        int[]arr={1,7,2,3,9,4,5,6};
        Array array=new Array(arr);

        int max=array.max();
        System.out.println("Max: "+ max);

        int min=array.min();
        System.out.println("Min: "+ min);

        int avg=array.average();
        System.out.println("Average: "+ avg);

        array.SortAsc();
        array.displayArr();

        array.SortDesc();
        array.displayArr();
    }

    interface ISort
    {
        public void SortAsc();
        public void SortDesc();
    }
   public interface IMath
    {
        public int max();
        public int min();
        public int average();

    }
    static public class Array implements IMath,ISort
    {
        private int[] elements;
        public Array(int[]elements){
            this.elements=elements;
        }

        @Override
        public int max()
        {
            int max=elements[0];

            for(int i=0;i<elements.length;i++)
            {
                if(elements[i]>max)
                {
                    max=elements[i];
                }
            }

            return max;
        }
        @Override
        public int min()
        {
           int min=elements[0];
            for(int i=0;i<elements.length;i++)
            {
                if(elements[i]<min)
                {
                    min=elements[i];
                }
            }

           return min;
        }
        @Override
        public int average()
        {
            int sum=0;
            for(int i=0;i<elements.length;i++)
            {
                sum+=elements[i];

            }
            return sum/elements.length;
        }

        @Override
        public void SortAsc()
        {
            System.out.println("Масив по зростанню:");
            Arrays.sort(elements);
        }

        @Override
        public void SortDesc()
        {
            System.out.println("Масив по спаданню:");
            Arrays.sort(elements);
            reverseArray(elements);
        }
        private void reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public void displayArr()
        {
            for(int element:elements)
            {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
