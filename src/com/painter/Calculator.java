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
        System.out.println("What is the total height of your walls in mm?");
        double WallHeightInmm = Double.parseDouble(InputLine.nextLine());
        System.out.println("What is the total width of your walls in mm?");
        double WallWidthInmm = Double.parseDouble(InputLine.nextLine());
        double WallSurfaceAreaInSqm = (WallHeightInmm/1000)*(WallWidthInmm/1000);
        int NumberOfPaintCans = (int) Math.ceil (WallSurfaceAreaInSqm/PaintCoveragePerCanInSqm);
        BigDecimal PaintCanNum = new BigDecimal(NumberOfPaintCans);
        BigDecimal TotalPrice = CostPerPaintCaninPence.multiply(PaintCanNum);

        System.out.println(WallSurfaceAreaInSqm);
        System.out.println(NumberOfPaintCans);

        System.out.println("Welcome "+ UserName + ". To paint the house with " + PaintName + " you will need " + NumberOfPaintCans +
                " cans of paint, which will cost you £" + TotalPrice  +" Thank you!");
    }
}
