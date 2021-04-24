package Main;

import numbersytems.FromToNumbersystems;
import numbersytems.Numbersystem;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingVersion extends JFrame implements ActionListener {
    String[] numberSystems = {"Decimal", "Hexadecimal", "Binary", "Octal"};
    JComboBox sourceSystemComboBox;
    JComboBox targetSystemComboBox;
    JLabel sourceSystemLabel;
    JLabel targetSystemLabel;
    JTextField resultTextfield;
    JLabel labelForResult;
    JTextField inputFiled;
    JLabel inputLabel;
    JButton copyButton;
    JLabel errorLabel;
    JPanel titelPanel;
    JLabel titelLabel;
    JPanel content;
    JButton convertButton;
    FromToNumbersystems ftns = new FromToNumbersystems();
    String result;

    public SwingVersion() {
        initComponents();
    }

    private void initComponents() {
        setSize(800, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number System Converter");
        titelPanel = new JPanel();
        titelLabel = new JLabel("Number System Converter");
        add(titelPanel, BorderLayout.NORTH);
        titelLabel.setFont(titelLabel.getFont().deriveFont(25f));
        titelPanel.add(titelLabel);
        sourceSystemLabel = new JLabel("From: ");
        sourceSystemComboBox = new JComboBox(numberSystems);
        targetSystemLabel = new JLabel("To: ");
        targetSystemComboBox = new JComboBox(numberSystems);
        convertButton = new JButton("Convert input");
        inputFiled = new JTextField();
        content = new JPanel();
        errorLabel = new JLabel();
        errorLabel.setForeground(Color.RED);
        errorLabel.setFont(errorLabel.getFont().deriveFont(16f));
        resultTextfield = new JTextField();
        resultTextfield.setBackground(Color.lightGray);
        resultTextfield.setOpaque(true);
        resultTextfield.setFont(resultTextfield.getFont().deriveFont(16f));
        resultTextfield.setEditable(false);
        labelForResult = new JLabel("Your convertet number : ");
        copyButton = new JButton("Copy the result");
        add(content);
        content.setLayout(new GridLayout(20, 2));
        content.add(sourceSystemLabel);
        content.add(sourceSystemComboBox);
        content.add(targetSystemLabel);
        content.add(targetSystemComboBox);
        content.add(errorLabel);
        content.add(inputFiled);
        content.add(convertButton);
        content.add(labelForResult);
        content.add(resultTextfield);
        content.add(copyButton);
        convertButton.addActionListener(this);
        copyButton.addActionListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingVersion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            if (inputFiled.getText().isEmpty()) {
                errorLabel.setText("No input! Please enter a number");
            } else {
                errorLabel.setText("");
                String input = inputFiled.getText();
                System.out.println(input);
                int sourceSystem = sourceSystemComboBox.getSelectedIndex() + 1;
                int targetSystem = targetSystemComboBox.getSelectedIndex() + 1;
                System.out.println(sourceSystem);
                System.out.println(targetSystem);
                try {
                    Numbersystem sourceNumbersystem = ftns.makeNumbersystems(sourceSystem, input);
                    result = ftns.toTarget(targetSystem, sourceNumbersystem);
                    resultTextfield.setText(result);
                } catch (NumberFormatException ex) {
                    errorLabel.setText(input + " is a invalid input in the " + ftns.numbersystemIntToString(sourceSystem));
                }
            }

        } else if (e.getSource() == copyButton) {
            copyButton.setText("Result copied");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(result), null);
        }
    }

}

