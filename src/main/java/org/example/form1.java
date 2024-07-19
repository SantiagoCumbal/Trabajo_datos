package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

public class form1 {
    private JButton button1;
    public JPanel MainPanel;
    private JLabel Texto;
    String url="jdbc:mysql://localhost:3306/Estudiantes2024a";
    String user="root";
    String password="123456";
    Scanner sc=new Scanner(System.in);


    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("Conexion exitosa");
                    String query="select * from estudiantes";
                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery(query);
                    while(resultSet.next()){
                        Texto.setText(resultSet.getString("nombre"));
                    }
                }
                catch(
                        SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });
    }
}
