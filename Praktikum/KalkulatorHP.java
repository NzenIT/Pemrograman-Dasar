import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorHP extends JFrame implements ActionListener {

    JTextField display;

    double nilai = 0;
    String operator = "=";
    boolean startBaru = true; // buat mulai input baru

    public KalkulatorHP() {
        setTitle("Kalkulator HP - Kaka 😏");
        setSize(300, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // DISPLAY
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 28));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(display, BorderLayout.NORTH);

        // PANEL TOMBOL
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,4,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        String[] tombol = {
            "AC","±","%","/",
            "7","8","9","*",
            "4","5","6","-",
            "1","2","3","+",
            "0",".","=",""
        };

        for (String t : tombol) {
            if (t.equals("")) {
                panel.add(new JLabel());
                continue;
            }

            JButton btn = new JButton(t);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        // ANGKA & DESIMAL
        if ((cmd.charAt(0) >= '0' && cmd.charAt(0) <= '9') || cmd.equals(".")) {
            if (startBaru) {
                display.setText(cmd.equals(".") ? "0." : cmd);
                startBaru = false;
            } else {
                display.setText(display.getText() + cmd);
            }
        }

        // CLEAR
        else if (cmd.equals("AC")) {
            nilai = 0;
            operator = "=";
            display.setText("0");
            startBaru = true;
        }

        // PLUS MINUS
        else if (cmd.equals("±")) {
            double temp = Double.parseDouble(display.getText());
            temp = -temp;
            display.setText(String.valueOf(temp));
        }

        // PERSEN
        else if (cmd.equals("%")) {
            double temp = Double.parseDouble(display.getText());
            temp = temp / 100;
            display.setText(String.valueOf(temp));
        }

        // OPERATOR + - * / =
        else {
            hitung(Double.parseDouble(display.getText()));
            operator = cmd;
            startBaru = true;
        }
    }

    public void hitung(double angka) {
        switch (operator) {
            case "+": nilai += angka; break;
            case "-": nilai -= angka; break;
            case "*": nilai *= angka; break;
            case "/": 
                if (angka != 0) nilai /= angka;
                else {
                    display.setText("Error");
                    startBaru = true;
                    return;
                }
                break;
            case "=": nilai = angka; break;
        }
    if (nilai == (int) nilai) {
        display.setText(String.valueOf((int) nilai));
    } else {
        display.setText(String.format("%.2f", nilai));
    }
}

public static void main(String[] args) {
        new KalkulatorHP();
    }
}