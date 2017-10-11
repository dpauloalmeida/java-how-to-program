package com.deitel.exercicios.Capitulo24.Cap24_2_3;

import javax.swing.*;
import java.sql.SQLException;

public class AppConsulting extends JFrame{

    public static void main(String[] args) throws SQLException {
        JFrame main = new JFrame("Consulting");
        main.add(new ConsultingComboBox().consultingPanel);

        PrepareStatementQueries query = new PrepareStatementQueries();


        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(500, 500);
        main.setVisible(true);
    }
}
