package java_packages.Theorie.Enumeration;

public enum WeatherEnum {

    JANUARY(3.3, 70, 5),
    FEBRUARY(3.7,50,6),
    MARCH(6.8,80,5),
    APRIL(9.8,60,6),
    MAY(13.6,70,6),
    JUNE(16.2,90,4),
    JULY(18.4,70,7),
    AUGUST(18.0,50, 8),
    SEPTEMBER(14.9,60,7 ),
    OCTOBER(11.1,70,6 ),
    NOVEMBER(6.8,70,6 ),
    DECEMBER(3.9,70,4 );

    private double temperature;
    private int rainfall, sunshineHours;

    public int getRainfall() {
        return rainfall;
    }

    public int getSunshineHours() {
        return sunshineHours;
    }

    public double getTemperature(){
        return temperature;
    }

    WeatherEnum(double temperature, int rainfall, int sunshineHours) {
        this.temperature = temperature;
        this.rainfall = rainfall;
        this.sunshineHours = sunshineHours;
    }
}
