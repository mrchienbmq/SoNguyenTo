package Assignment1;

public class PrimeNumbers {

    public static void main (String[] args)
    {
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= 1000; i++)
        {
            int counter=0;
            for(num =i-1; num>=2; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 0)
            {

                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("So Nguyen To tu 1 -> 1000:");
        System.out.println(primeNumbers);
    }
}
