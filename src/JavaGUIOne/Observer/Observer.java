package JavaGUIOne.Observer;

// Dizajn pattern - Observer opisuje relaciju jedan na više
// SWING aplikacija GUI
// JavaFX
// Observer je 'posmatrač'; 
// Observable (Subject ili predmet posmatranja) je 'posmatrani' (ima listu svojih 'posmatrača' koje obavještava i ažurira GUI)

// Standard za pretplatnike
public interface Observer { // Obzerver šablon "one to many"; Prinicipi OOP - programirajte u interface ili apstraktne klase
    
    public void update(float temperature, float humidity, float pressure);
    
    
    
    
}


// OOP - AKo pravimo npr. printer, prvo se pitamo šta jedan printer radi (metode); a onda klase u koje ćemo staviti
//       metode