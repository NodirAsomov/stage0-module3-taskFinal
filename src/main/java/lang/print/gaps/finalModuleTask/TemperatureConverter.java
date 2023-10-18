package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
         double fahrenheit = 0.0;
         // formula for conversion
        fahrenheit = ((double) temperatureCelsius * 1.8) + 32;
        System.out.println( " value of temperature in fahrenheit:"
                        + fahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter obj =new TemperatureConverter();
        obj.toFahrenheit(33);
    }
}
