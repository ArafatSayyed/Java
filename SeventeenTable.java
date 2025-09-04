//1st Method
public class SeventeenTable
/*{
    public static void main(String[] args)
    {
        for (int i=17;i<=170;i++)
        {
            if (i%17==0)
            {
                System.out.println(i+ " ");
            }
        }
    }
}*/
//it will breake 171

//This code is not good because its have 154 iteration means this 154 times loop will be run
//2nd Method
/*{
    public static void main(String[] args)
    {
        for (int i = 17; i <= 170; i = i + 17) {
            System.out.print(i + " ");
        }
    }
}*/
//it will breake 187

//3rd Method
{
    public static void main(String[] args)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.print(i*17+ " ");
        }
    }
}
//In this code will run 10 times