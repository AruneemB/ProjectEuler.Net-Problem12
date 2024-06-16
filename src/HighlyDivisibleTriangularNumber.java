import java.util.ArrayList;

public class HighlyDivisibleTriangularNumber
{
    public static int countDivisors(long number)
    {
        if(number == 0) return 0;
        int count = 0;
        long sqrt = (long) Math.sqrt(number);
        for(long i = 1; i <= sqrt; i++)
        {
            if(number % i == 0)
            {
                if(i == number/i) count += 1;
                else count += 2;
            }
        }
        return count;
    }

    public static long getHighlyDivisibleTriangularNumber(int numberOfDivisors)
    {
        long triangularNumber = 0;
        long nextNumber = 1;

        while(countDivisors(triangularNumber) <= numberOfDivisors)
        {
            triangularNumber += nextNumber;
            nextNumber++;
        }

        return triangularNumber;
    }

    public static void main(String[] args)
    {
        System.out.println(getHighlyDivisibleTriangularNumber(500));
    }
}
