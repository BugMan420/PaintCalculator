package com.painter;

public class Calculator {
    public static void main(String[] args)
    {
        String PaintName = "Bug Paint";
        int PaintCoveragePerCanInSqm = 8;
        double WallHeightInmm = 6900;
        double WallWidthInmm =  7205;
        double WallSurfaceAreaInSqm = (WallHeightInmm/1000)*(WallWidthInmm/1000);
        int NumberOfPaintCans = (int) Math.ceil (WallSurfaceAreaInSqm/PaintCoveragePerCanInSqm);
        double CostPerPaintCaninPence = 8.67;

        System.out.println(WallSurfaceAreaInSqm);
        System.out.println(NumberOfPaintCans);

        System.out.println("To paint the house with " + PaintName + " you will need " + NumberOfPaintCans +
                " cans of paint, which will cost you £" + (NumberOfPaintCans*(CostPerPaintCaninPence)));
    }
}
