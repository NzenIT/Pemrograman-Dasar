import java.util.Timer;
import java.util.TimerTask;
public class timer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
        int counter = 10;
       
        @Override
        public void run() {
            if (counter > 0) {
                System.out.println("Hitung mundur: " + counter);
                counter--;
            
            } else {
                System.out.println("Waktu Habis!");
                timer.cancel();
            }

    }   
    };
    timer.scheduleAtFixedRate(task, 0, 1000);

    }
}

