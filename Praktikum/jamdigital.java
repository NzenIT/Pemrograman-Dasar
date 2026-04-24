import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class jamdigital {
    private JLabel timeLabel;

    public jamdigital() {
        JFrame frame = new JFrame("Jam Digital");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(new BorderLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 60));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();

        frame.setVisible(true);
    }

    private void updateTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        timeLabel.setText(sdf.format(date));
    }
    public static void main(String[] args) {
        new jamdigital();
    }
}
