public class Task05
{
    public static void main()
    {
        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print("*" + " ");
                if(i==j)
                    break;
            }
            if(i<4)
                System.out.print("\n");
        }
    }
}
