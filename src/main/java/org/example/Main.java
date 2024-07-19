package org.example;

import javax.swing.*;
import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* String url="jdbc:mysql://localhost:3306/Estudiantes2024a";
        String user="root";
        String password="123456";
        Scanner sc=new Scanner(System.in);



        try(Connection connection= DriverManager.getConnection(url,user,password)){
            System.out.println("Conexion exitosa");
            System.out.println("Ingrese el numero de cedula del estudiante: ");
            String opcion=sc.nextLine();
            String query="select *, round((b1+b2)/2,2) as promedio from estudiantes where cedula= '"+opcion+"'";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);


            while(resultSet.next()){
                System.out.print("El estudiante "+resultSet.getString("nombre")+" con numero de cedula: "+resultSet.getString("cedula")+" tiene las siguientes notas: "+resultSet.getString("b1")+" - "+resultSet.getString("b2")+" y su promedio es: "+resultSet.getString("promedio"));
                System.out.println();
                float promedio=resultSet.getFloat("promedio");

                if(promedio>14){
                    System.out.println("El estudiante paso el semestre");
                }else {
                    float supletorios=14-promedio;
                    float supletoriosR=Math.round(supletorios);
                    System.out.println("El estudiante necesita: "+supletoriosR+" para pasar el semestre");
                }

            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }*/
        JFrame frame = new JFrame("Inicia Sesion");
        frame.setContentPane(new form1().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);

    }
}