package JavaGUITwo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GeekPanel extends JPanel {

    private JCheckBox chinCheckBox;
    private JCheckBox glassesCheckBox;
    private JCheckBox hairCheckBox;
    private JCheckBox teethCheckBox;
    private JLabel pictureLabel;

    public GeekPanel() {
        
        super(new BorderLayout()); // Specificiranje Layout-a; klasa koja extenda Manager-a
        //
        chinCheckBox = new JCheckBox("Chin");
        glassesCheckBox = new JCheckBox("Glasses");
        hairCheckBox = new JCheckBox("Hair");
        teethCheckBox = new JCheckBox("Teeth");
        pictureLabel = new JLabel("NO IMAGE");
        
        JPanel checkBoxPanel = new JPanel(new GridLayout(0, 1));
        checkBoxPanel.add(chinCheckBox);
        checkBoxPanel.add(glassesCheckBox);
        checkBoxPanel.add(hairCheckBox);
        checkBoxPanel.add(teethCheckBox);
        add(checkBoxPanel, BorderLayout.LINE_START);
        add(pictureLabel, BorderLayout.CENTER);

    }

}
