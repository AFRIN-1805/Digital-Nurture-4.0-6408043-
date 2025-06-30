package DSA;
import java.util.Scanner;

public class FinancialForecast {

    // Method to forecast future profits based on pattern
    public static void forecastProfit(int[] weeklyProfits, int forecastDays) {
        int n = weeklyProfits.length;

        System.out.println("\nForecasted Profits:");
        for (int i = 0; i < forecastDays; i++) {
            int predictedProfit = weeklyProfits[i % n];
            System.out.println("Day " + (i + 1) + ": $" + predictedProfit);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daily profits for a week
        int[] weeklyProfits = {100, 120, 110, 130, 140, 125, 135}; // Example pattern

        System.out.print("Enter number of days to forecast: ");
        int forecastDays = sc.nextInt();

        // Call method to forecast
        forecastProfit(weeklyProfits, forecastDays);

        sc.close();
    }
}

