package JavaGUIOne.Observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticDisplay implements Observer, DisplayElement{
    
    private final List<Float> temperatures = new ArrayList<>();
    private final List<Float> humidities = new ArrayList<>();
    private final List<Float> pressures = new ArrayList<>();

    
    
    StatisticDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);
        display();
    }

    @Override
    public void display() {
        float averageTemp = average(temperatures);
        float averageHumidity = average(humidities);
        float averagePressure = average(pressures);
        System.out.printf(System.lineSeparator() + "Average temp/humidity/pressure = %s/%s/%s%n", averageTemp, averageHumidity, averagePressure);
    }
    
    private float average(List<Float> values){
        float sum = 0f;
        for(Float value : values){
            sum += value;}
        
    float average = sum/values.size();
        return average;
    }
}
   
