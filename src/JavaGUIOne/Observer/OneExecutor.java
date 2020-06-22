
package JavaGUIOne.Observer;

public class OneExecutor {

    public static void main(String[] args) {
        // Subject/Observable
        WeatherData weatherData = new WeatherData();
        
        // Observer
        Observer observer1 = new CurrentConditionDisplay(weatherData);
        Observer observer2 = new StatisticDisplay(weatherData);
        
        // Ažuriranje stanja
        weatherData.setMeasurements(23, 70, 950);
        
        weatherData.removeObserver(observer1);
        
        weatherData.setMeasurements(2, 3, 980);
        
            
        }
    }
// Observer -> CurrentDisplay -> StatisticDisplay
// Update poziva ostale meetode