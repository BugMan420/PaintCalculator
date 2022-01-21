package com.painter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static double arraySum(double[] array) {
        double ArraySum = 0;
        for (int i = 0; i < array.length; i++)
        {
            ArraySum = ArraySum + array[i];
        }
        return ArraySum;
    }
    public static void main(String[] args)
    {
        Scanner InputLine = new Scanner (System.in);
        String PaintName = "Bug Paint";


        int PaintCoveragePerCanInSqm = 8;

        System.out.println("Enter your first name please:");
        String UserName = InputLine.nextLine();

        System.out.println("How much does your paint cost?:");
        BigDecimal CostPerPaintCaninPence = new BigDecimal(InputLine.nextLine());
        String PaintRec = (CostPerPaintCaninPence.doubleValue() > 9.50)?"Did you know a can of Bug paint costs £9.50":"You can get good quality paint for only £9.50 from the Bug Boys";

        System.out.println(PaintRec);
        System.out.println("How many walls do you have?");
        int NumberOfWalls = InputLine.nextInt();
        double WallHeightArray[] = new double[NumberOfWalls];
        double WallWidthArray[] = new double[NumberOfWalls]; ;
        double SumOfHeight = 0;
        double SumOfWidth = 0;
        for(int i=0;i<NumberOfWalls;i++)
        {
            System.out.println("What is the width of your wall in mm?");
            WallWidthArray[i] = InputLine.nextDouble();
            System.out.println("What is the height of your wall in mm?");
            WallHeightArray[i] = InputLine.nextDouble();
        }

        System.out.println(Arrays.toString(WallWidthArray));
        System.out.println(Arrays.toString(WallHeightArray));

        SumOfHeight = arraySum(WallHeightArray);
        SumOfWidth = arraySum(WallWidthArray);

        System.out.println(SumOfHeight);
        System.out.println(SumOfWidth);

        double WallSurfaceAreaInSqm = (SumOfHeight/1000)*(SumOfWidth/1000);
        System.out.println("Your total wall surface area is " + WallSurfaceAreaInSqm);

        int NumberOfPaintCans = (int) Math.ceil (WallSurfaceAreaInSqm/PaintCoveragePerCanInSqm);
        BigDecimal PaintCanNum = new BigDecimal(NumberOfPaintCans);
        BigDecimal TotalPrice = CostPerPaintCaninPence.multiply(PaintCanNum);

        System.out.println("Welcome "+ UserName + ". To paint the house with " + PaintName + " you will need " + NumberOfPaintCans +
                " cans of paint, which will cost you £" + TotalPrice  +" Thank you!");
        switch (NumberOfPaintCans)
        {
            case 0 -> System.out.println("You don't even need to paint your house");
            case 1, 2, 3 -> System.out.println("You probably have this amount of paint laying around.");
            default -> System.out.println("You should contact the Bug Boys to buy some more paint.");
        }
        if (NumberOfPaintCans > 6)
        {
            System.out.println("I would recommend using the services of The Bug Boy Painters.");
        }
        else
        {
            System.out.println("This is a DIY Job. Call Some Friends and have some fun!");
        }
        String[][] StaffNames = {{"John","Paul","Matthew"},{"Doe","Baptist","Mittens"}};
        for(int i=0;i<StaffNames.length;i++){
            for(int j=0;j<StaffNames[i].length;j++)
            {
                System.out.print(StaffNames[i][j]);
            }
        }
    }
}
