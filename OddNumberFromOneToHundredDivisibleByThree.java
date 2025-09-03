public class OddNumberFromOneToHundredDivisibleByThree
{
    public static void main(String[] args)
    {
        for (int i=0;i<=100;i++)
        {
            if (i%2!=0)
            {
                if (i%3==0)
                {
                    System.out.print(i+ " ");
                }
            }
        }
    }
}
