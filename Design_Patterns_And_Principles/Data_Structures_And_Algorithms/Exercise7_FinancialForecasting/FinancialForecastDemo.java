import java.util.Scanner;

public class FinancialForecastDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FinancialForecast forecast = new FinancialForecast();

        System.out.println("========== Financial Forecast ==========");

        System.out.print("Enter Current Value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate (%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double futureValue = forecast.calculateFutureValue(
                currentValue,
                growthRate,
                years
        );

        System.out.printf("\nFuture Value after %d years = ₹%.2f",
                years,
                futureValue);

        sc.close();
    }
}
