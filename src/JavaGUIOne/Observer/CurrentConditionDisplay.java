package JavaGUIOne.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    
    private float temperature;
    private float humidity;
    private float pressure;
    
    
    public CurrentConditionDisplay(Subject subject){
        subject.registerObserver(this); // This je objekat koji će biti kreiran po šablonu ove klase (Current...)
    }
  

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
     
    public void display(){
        System.out.println("Current conditions: " + temperature + " degrees " + humidity + " percents " +  pressure + "Mb");
    }
    
    
}
