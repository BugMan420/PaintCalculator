package com.painter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner InputLine = new Scanner (System.in);
        String PaintName = "Bug Paint";
        int PaintCoveragePerCanInSqm = 8;
        System.out.println("Enter your first name please:");
        String UserName = InputLine.nextLine();
        System.out.println("How much does your paint cost?:");
        BigDecimal CostPerPaintCaninPence = new BigDecimal(InputLine.nextLine());
        String PaintRec = (CostPerPaintCaninPence.doubleValue() > 9.50)?"Did you know a can of Bug paint costs £9.50":"You can get better quality paint for only £9.50 from the Bug Boys";
        System.out.println(PaintRec);
        System.out.println("What is the total height of your walls in mm?");
        double WallHeightInmm = Double.parseDouble(InputLine.nextLine());
        System.out.println("What is the total width of your walls in mm?");
        double WallWidthInmm = Double.parseDouble(InputLine.nextLine());
        double WallSurfaceAreaInSqm = (WallHeightInmm/1000)*(WallWidthInmm/1000);
        int NumberOfPaintCans = (int) Math.ceil (WallSurfaceAreaInSqm/PaintCoveragePerCanInSqm);
        BigDecimal PaintCanNum = new BigDecimal(NumberOfPaintCans);
        BigDecimal TotalPrice = CostPerPaintCaninPence.multiply(PaintCanNum);

        switch(NumberOfPaintCans)
        {
            case 0: System.out.println("You don't even need to paint your house");
            break;
            case 1,2,3: System.out.println("You probably have this amount of paint laying around.");
            break;
            default: System.out.println("You should contact the Bug Boys to buy some more paint.");
            break;
        }
        
        System.out.println("Welcome "+ UserName + ". To paint the house with " + PaintName + " you will need " + NumberOfPaintCans +
                " cans of paint, which will cost you £" + TotalPrice  +" Thank you!");
        if (NumberOfPaintCans > 6)
        {
            System.out.println("I would recommend using the services of The Bug Boy Painters.");
        }
        else
        {
            System.out.println("This is a DIY Job. Call Some Friends and have some fun!");
        }
    }
}
