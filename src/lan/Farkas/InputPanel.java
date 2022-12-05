package lan.Farkas;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
/**
 * Az input panel csináltuk meg jar fájl segitségével
 * Farkas Csaba Szoft II/N 2022.12.05
 * @author Farkas Csaba
 * @version 1.0
 * @since 2022.12.05
 */

public class InputPanel extends JPanel {

    private JLabel label;
    private JTextField field;
    public InputPanel() {
        this.label = new JLabel("InputPanel");
        this.field = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(5, 10, 5, 10));
        this.label.setBorder(new EmptyBorder(0, 0, 0, 10));
        this.addComponent();
    }
    public void addComponent() {
        this.add(label);
        this.add(field);
    }
    /**
     * Konstruktor label
     * @param label
     */
    public InputPanel(JLabel label) {
        this.label = label;
    }
    /**
     * szöveg irás
     */
    public void setText(String text) {
        this.label.setText(text);
    }
    /*szöveg lekérdezés */
    public String getText() {
        return this.label.getText();
    }    
    /*érték beálitás */
    public void setValue(String value) {
        this.field.setText(value);
    }
    /*komponens érték lekérdezés */
    public String getValue() {
        return this.field.getText();
    }
}