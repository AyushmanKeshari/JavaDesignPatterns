package StructuralDesignPatterns.AdapterPattern.Solution_WeatherWarnings;

public class Main {
    public static void main(String[] args) {
        WeatherWarnings weatherWarnings = new WeatherWarnings();

        NorthAmericanCity chicago = new NorthAmericanCity("Chicago", 16);
        weatherWarnings.postWarning(chicago);

        NorthAmericanCity phoenix = new NorthAmericanCity("Phoenix", 104);
        weatherWarnings.postWarning(phoenix);

        NorthAmericanCity portland = new NorthAmericanCity("Portland", 70);
        weatherWarnings.postWarning(portland);

        AsianCity bangkok = new AsianCity("Bangkok", 50);
        //Should give warning. But not because checking in Fahrenheit. Use Adapter instead.
        weatherWarnings.postWarning(bangkok);

        Adapter adapter = new Adapter(bangkok);
        weatherWarnings.postWarning(adapter);
    }
}
