package predavanje4;

        import java.util.ArrayList;
        import javax.swing.JOptionPane;

public class SwitchLearningMonths {
    public static void main(String[] args){
        String monthNumberInput = JOptionPane.showInputDialog("Unesi zadnji mjesec");
        int monthNumber = Integer.parseInt(monthNumberInput);
        ArrayList<String> monthNames = new ArrayList<>();
        switch(monthNumber){
            case 1: monthNames.add("JANUAR");
            case 2: monthNames.add("FEBRUAR");
            case 3: monthNames.add("MART");
            case 4: monthNames.add("APRIL");
            case 5: monthNames.add("MAJ");
            case 6: monthNames.add("JUNI");
            case 7: monthNames.add("JULI");
            case 8: monthNames.add("AVGUST");
            case 9: monthNames.add("SEPTEMBAR");
            case 10: monthNames.add("OKTOBAR");
            case 11: monthNames.add("NOVEMBAR");
            case 12: monthNames.add("DECEMBAR");
            default: break;
        }
        monthNames.forEach(System.out :: println);
    }
    
}
