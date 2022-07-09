package StructuralDesignPatterns.AdapterPattern.Solution_WeatherWarnings;

public interface City {
    String getName();
    double getTemperature();
    String getTemperatureScale();
    boolean getHasWeatherWarning();
    void setHasWeatherWarning(boolean hasWeatherWarning);
}
