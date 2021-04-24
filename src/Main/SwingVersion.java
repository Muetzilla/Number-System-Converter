package Main;

import javax.swing.*;
import java.awt.*;

public class SwingVersion extends JFrame {
    String[] numberSystems = { "Decimal", "Hexadecimal", "Binary", "Octal"};
    JComboBox sourceSystemComboBox;
    JComboBox targetSystemComboBox;
    JLabel sourceSystemLabel;
    JLabel targetSystemLabel;
    JLabel resultLabel;
    JLabel LabelForResult;
    JTextField inputFiled;
    JLabel inputLabel;
    JButton copyButton;
    JPanel titelPanel;
    JLabel titelLabel;
    JPanel content;
    public SwingVersion(){
        initComponents();
    }

    private void initComponents() {
        setSize(800,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number System Converter");
        titelPanel = new JPanel();
        titelLabel = new JLabel("Number System Converter");
        add(titelPanel,BorderLayout.NORTH);
        titelLabel.setFont(titelLabel.getFont().deriveFont(25f));
        titelPanel.add(titelLabel);
        sourceSystemLabel = new JLabel("From: ");
        sourceSystemComboBox = new JComboBox(numberSystems);
        targetSystemLabel = new JLabel("To: ");
        targetSystemComboBox = new JComboBox(numberSystems);
        inputLabel = new JLabel("Your input: ");
        inputFiled = new JTextField();
        content = new JPanel();
        add(content);
        content.setLayout(new GridLayout(0,2));
        content.add(sourceSystemLabel);
        content.add(sourceSystemComboBox);
        content.add(targetSystemLabel);
        content.add(targetSystemComboBox);
        content.add(inputLabel);
        content.add(inputFiled);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingVersion();
    }
}
