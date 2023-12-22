package ru.mirea.it.ivbo.nineteen.students;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class LabGroupUI extends JFrame {
    private LabGroup labGroup;
    private JButton addButton;
    private JButton infoAddButton;
    private JButton infoDeleteButton;
    private JButton infoSearchButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JTextField textField;

    public LabGroupUI(ArrayList<Student> students) {
        super("Students");
        labGroup = new LabGroup(students);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        addButton = new JButton("Add student");
        infoAddButton = new JButton("?");
        infoDeleteButton = new JButton("?");
        infoSearchButton = new JButton("?");
        deleteButton = new JButton("Delete student");
        searchButton = new JButton("Search student");
        textField = new JTextField();

        infoAddButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "To add a student, input their name, age, and GPA");
        });
        infoDeleteButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "To remove a student, input their name");
        });
        infoSearchButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this,
                    "To search for a student, input their name");
        });

        addButton.addActionListener(e -> {
            Student student;
            String studentInfo = textField.getText();
            if (Objects.equals(studentInfo, ""))
                throw new EmptyStringException();
            else {
                String[] information = studentInfo.split(" ");
                try {
                    student = new Student(information[0], Integer.parseInt(information[1]), Integer.parseInt(information[2]));
                    labGroup.addStudent(student);
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(this,
                            "Your input is not correct");
                }
            }
            updateUI();
        });
        deleteButton.addActionListener(e -> {
            try {
                String studentInfo = textField.getText();
                if (Objects.equals(studentInfo, ""))
                    throw new EmptyStringException();
                else
                    labGroup.removeStudent(studentInfo);
            } catch (StudentNotFoundException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }
            updateUI();
        });
        searchButton.addActionListener(e -> {
            try {
                String studentInfo = textField.getText();
                if (Objects.equals(studentInfo, ""))
                    throw new EmptyStringException();
                else {
                    Student student = labGroup.findStudent(studentInfo);
                    JOptionPane.showMessageDialog(this,
                            student);
                }
            } catch (StudentNotFoundException ex) {
                JOptionPane.showMessageDialog(this,
                        ex.getMessage());
            }
            updateUI();
        });

        updateUI();
    }

    public void updateUI() {
        JPanel mainPanel = new JPanel();
        GridLayout containerLayout = new GridLayout(1, 2);
        mainPanel.setLayout(containerLayout);

        JPanel studentPanel = new JPanel();
        GridLayout studentContainer = new GridLayout(labGroup.students.size(), 1);
        studentPanel.setLayout(studentContainer);

        JPanel uiPanel = new JPanel();
        GridLayout containerUi = new GridLayout(4, 1);
        uiPanel.setLayout(containerUi);

        for (int i = 0; i < labGroup.students.size(); i++) {
            JTextField jTextField = new JTextField(String.valueOf(labGroup.students.get(i)));
            studentPanel.add(jTextField);
        }

        uiPanel.add(textField);

        JPanel addPanel = new JPanel(new GridLayout(1, 2));
        addPanel.add(infoAddButton);
        addPanel.add(addButton);
        uiPanel.add(addPanel);

        JPanel deletePanel = new JPanel(new GridLayout(1, 2));
        deletePanel.add(infoDeleteButton);
        deletePanel.add(deleteButton);
        uiPanel.add(deletePanel);

        JPanel searchPanel = new JPanel(new GridLayout(1, 2));
        searchPanel.add(infoSearchButton);
        searchPanel.add(searchButton);
        uiPanel.add(searchPanel);

        mainPanel.add(uiPanel);
        mainPanel.add(studentPanel);
        this.getContentPane().removeAll();
        this.repaint();
        this.add(mainPanel);
        this.setVisible(true);
    }
}

