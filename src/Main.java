import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();
        int size = 10;
        Random rand = new Random();
        for(int i=0; i<size; i++)
        {
            numbers.add(rand.nextInt(1000));
        }

        bubble_sort(numbers,size);

    }

    public static void bubble_sort(Vector<Integer> vec,int size)
    {
        int memory;

        for(int i=1; i<size; i++)
        {
            for(int j=1; j<size; j++)
            {
                if(vec.get(j) < vec.get(j-1))
                {
                    memory = vec.get(j-1);
                    vec.set(j-1,vec.get(j));
                    vec.set(j,memory);
                }
            }
        }

        for(int i=0; i<size; i++)
        {
            System.out.println(vec.get(i));
        }

    }

}