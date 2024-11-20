import java.util.Scanner;

public class Solution {
    public static double calculateTotalCost(double[] prices, int size) {
    double totalCost = 0.0;  // Variable to store total cost

        for (int i = 0; i < size; i++) {
            // Check if price is greater than 100 and apply 10% discount
            if (prices[i] > 100) {
                totalCost += prices[i] * 0.90;  // Apply 10% discount
            } else {
                totalCost += prices[i];  // No discount
            }
        }

        return totalCost;
    }
   public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    int arraysize = input.nextInt();
    double[] array = new double[arraysize];
    for (int i = 0; i < arraysize; i++) {
    array[i] = input.nextInt();
          }
    double result = calculateTotalCost(array, arraysize);
        System.out.println(result);
   } 
}