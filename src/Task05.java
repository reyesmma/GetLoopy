public class Task05
{
    public static void main()
    {
        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(i>=j)
                    System.out.print("*" + " ");
            }
            if(i<4)
                System.out.print("\n");
        }
    }
}
