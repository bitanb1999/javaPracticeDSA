package practiceDSA;
//A grid-like representation of an image is divided into n rows and m columns, with each cell containing
// pixel intensity values. The aim is to improve the visibility of specific objects in the image.
/*
Each pixel located at position (i, j) within the grid corresponds to a specific element in
the image. The pixel's intensity or value is denoted by pixelintensity[i][j].
The goal is to adjust the intensity of each pixel to ensure that no pixel in the previous
rows, where O <i</in the same column, has a brightness higher or equal to the given pixel.
To achieve this, a pixel's intensity can be increased at a cost of one unit per unit of increase.
Determine the minimum cost to achieve the desired intensity in all n*m pixels.
 */

import java.util.Arrays;

public class PixelIntensityAdjustment {

    public static int calculateMinimumCost(int[][] pixelIntensity) {
        int n = pixelIntensity.length;
        int m = pixelIntensity[0].length;
        int cost = 0;

        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                if (pixelIntensity[i][j] <= pixelIntensity[i - 1][j]) {
                    cost += pixelIntensity[i - 1][j] - pixelIntensity[i][j] + 1;
                    pixelIntensity[i][j] = pixelIntensity[i - 1][j] + 1;
                }
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        int[][] pixelIntensity = {
                {2, 5},
                {7, 4},
                {3, 5}
        };


        int minimumCost = calculateMinimumCost(pixelIntensity);
        System.out.println("Minimum cost: " + minimumCost);
    }
}