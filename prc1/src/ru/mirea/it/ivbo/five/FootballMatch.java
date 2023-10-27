package ru.mirea.it.ivbo.five;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FootballMatch{
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";
    private String winner = "DRAW";

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public FootballMatch() {
        JFrame frame = new JFrame("Football Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "AC Milan";
                updateResult();
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer = "Real Madrid";
                updateResult();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);

        frame.add(panel);
        frame.setVisible(true);

    }

    private void updateResult() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        if (milanScore > madridScore)
            winner = "AC Milan";
        else if (milanScore < madridScore)
            winner = "Real Madrid";
        else
            winner = "N/A";
        winnerLabel.setText("Winner: " + winner);
    }

    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();
    };
}
