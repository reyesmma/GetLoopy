import java.util.Random;

public class DieRollar
{
    public static void main()
    {
        Random ranNum = new Random();
        int die1 = 1;
        int die2 = 2;
        int die3 = 3;
        int totRolls = 0;
        int sum = 0;

        System.out.printf("Roll\tDie1\tDie2\tDie3\tSum\n");
        System.out.printf("------------------------------------\n");
        while(!(die1 == die2 && die2 == die3))
        {
            die1 = ranNum.nextInt(6) + 1;
            die2 = ranNum.nextInt(6) + 1;
            die3 = ranNum.nextInt(6) + 1;
            totRolls++;
            sum = die1 + die2 + die3;

            System.out.printf("%3d\t%6d\t%6d\t%6d\t%6d\n", totRolls, die1, die2, die3, sum);
        }
    }
}
