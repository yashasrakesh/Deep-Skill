

public class FinancialForecast {

    
    public static double forecastValue(double initialValue, double growthRate, int years) {
        
        if (years == 0) {
            return initialValue;
        }
        
        return forecastValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;   
        double annualGrowthRate = 0.05;   
        int forecastYears = 5;            

        double futureValue = forecastValue(initialValue, annualGrowthRate, forecastYears);
        System.out.printf("Forecasted Value after %d years: %.2f%n", forecastYears, futureValue);
    }
}
