import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyForm implements ActionListener{

    JTextField txtNama;
    JTextArea txtAlamat;
    JButton btnSubmit,btnCancel;


    public MyForm(){
        JFrame frame = new JFrame("data mahasiswa");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel l1 = new JLabel("Nama");
        JLabel l2 = new JLabel("Alamat");
        txtNama = new JTextField(10);
        txtAlamat = new JTextArea(3,20);

        btnSubmit = new JButton("Submit");
        btnCancel = new JButton("Cancel");

        JPanel panel = new JPanel(new GridLayout(3,2));
        panel.setBackground(Color.PINK);
        //panel.setBackground(new Color(200,200,34))
        panel.add(l1);
        panel.add(txtNama);
        panel.add(l2);
        panel.add(txtAlamat);
        panel.add(btnSubmit);
        panel.add(btnCancel);

        frame.add(panel);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        MyForm form = new MyForm();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==btnSubmit){
            String nama = txtNama.getText();
            String alamat= txtAlamat.getText();

            String data = "Nama:"+ nama;
            data += "\nAlamat:"+ alamat;
            JOptionPane.showMessageDialog(null ,data);
        }
        else if (e.getSource()==btnCancel){
            txtNama.setText(null);
            txtAlamat.setText(null);

        }
    }



}