package com.NandaEgaWijayaSaputra.PBO.Pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class DemoDatabase extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JTextField textNama;
    private JTextField textNim;
    private JSpinner sprNilai;
    private JButton submitButton;
    private JButton clearButton;
    private JTable dataTable;

    private DefaultTableModel model;
    private static Connection c;
    private static Statement s;
    private static ResultSet rs;
    public DemoDatabase(){
        super("Demo Database");

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = textNim.getText();
                String nama = textNama.getText();
                int nilai = (int) sprNilai.getValue();
                try {
                    openDb();
                    s.executeUpdate(
                            "INSERT INTO tb_mahasiswa VALUES ('"+nim+"','"+nama+"','"+nilai+"')"
                    );
                    Object[] row = {nim, nama, nilai};
                    model.addRow(row);

                    JOptionPane.showMessageDialog(null, "Data Added!");
                }catch (SQLException | ClassNotFoundException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                }finally {
                    closeDb();
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNama.setText("");
                textNim.setText("");
                sprNilai.setValue(0);
                JOptionPane.showMessageDialog(null, "Form cleared!");

            }
        });
    }

    public static void main(String[] args){
        JFrame mainFrame = new DemoDatabase();
        mainFrame.setVisible(true);
    }
    public static void openDb() throws ClassNotFoundException, SQLException{
        String URL = "jdbc:mysql://localhost:3306/db_demo";
        String Username = "root";
        String Password = "";

        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection(URL,Username,Password);
        s = c.createStatement();
    }
    private void closeDb(){
        try {
            rs.close();
            s.close();
            c.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void createUIComponents() {
        model = new DefaultTableModel();// TODO: place custom component creation code here
        dataTable = new JTable(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Nilai");

        try {
            openDb();
            rs = s.executeQuery("SELECT * FROM tb_mahasiswa");

            while (rs.next()){
                Object[] row = {
                        rs.getString("Nim"),
                        rs.getString("Nama"),
                        rs.getInt("Nilai")
                };
                model.addRow(row);
            }
        }catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }finally {
            closeDb();
        }
    }
}
