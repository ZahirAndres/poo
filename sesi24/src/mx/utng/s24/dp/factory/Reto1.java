package mx.utng.s24.dp.factory;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reto1 extends JFrame{
    //numero 1 y numero 2 y sumarse
    private JTextField txtNum1;
    private JTextField txtNum2;

    public Reto1(){
        super("Suma");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        JLabel lblNum1 = new JLabel("Primer número: ");
        JLabel lblNum2 = new JLabel("Segundo número: ");
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        //boton
        JButton btnResult = new JButton("Resultado");

        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(txtNum1.getText());
                    float num2 = Float.parseFloat(txtNum2.getText());
               

                        JOptionPane.showMessageDialog(Reto1.this, "Resultado: "+(num1+num2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(Reto1.this, "Solo se aceptan números: ", "Error", JOptionPane.ERROR_MESSAGE );

                }

                
            }
        });

        panel.add(lblNum1);
        panel.add(txtNum1);
        panel.add(lblNum2);
        panel.add(txtNum2);
        panel.add(btnResult);

        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Reto1();
    }

}

