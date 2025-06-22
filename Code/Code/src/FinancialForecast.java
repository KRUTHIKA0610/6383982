public class FinancialForecast {

    static double forecastRecursive(double presentValue, double growthRate, int years) {
        if (years == 0) return presentValue;
        return forecastRecursive(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    static double forecastOptimized(double presentValue, double growthRate, int years) {
        return presentValue * Math.pow(1 + growthRate, years);
    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.07;
        int years = 5;

        double recursiveResult = forecastRecursive(presentValue, growthRate, years);
        double optimizedResult = forecastOptimized(presentValue, growthRate, years);

        System.out.println("Recursive Forecast: " + recursiveResult);
        System.out.println("Optimized Forecast: " + optimizedResult);
    }
}
