public class FinancialForecast {

    // Recursive method to calculate future value
    public double calculateFutureValue(double currentValue,
                                       double growthRate,
                                       int years) {

        // Base Case
        if (years == 0) {
            return currentValue;
        }

        // Recursive Call
        return calculateFutureValue(
                currentValue * (1 + growthRate / 100),
                growthRate,
                years - 1
        );
    }
}
