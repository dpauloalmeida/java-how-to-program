package com.deitel.exercicios.Capitulo24.Cap24_2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConsultingComboBox {

    public JPanel consultingPanel;
    private JComboBox queriesComboBox;
    private JTextField interationTextField;
    private JButton okButton;

    private JPanel resultPanel;
    private JTable resultTable;

    public ConsultingComboBox() {

        resultTable = new JTable();
        resultPanel.add(new JScrollPane(resultTable), BorderLayout.CENTER);


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

            }
        });
    }
}
