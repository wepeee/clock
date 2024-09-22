import java.awt.Color;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    static JFrame frame;
    static JLabel label;

    public static void main(String[] args) {
        frame = new JFrame("Clock Display");
        Calendar now = Calendar.getInstance();
        Timer timer = new Timer();

        int detiks = now.get(Calendar.SECOND);
        int menits = now.get(Calendar.MINUTE);
        int jams = now.get(Calendar.HOUR);

        clockdisplay clock = new clockdisplay(detiks, menits, jams);
        
        frame.setSize(300, 100);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel(clock.getdisplayclock());
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
        
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                label.setText(clock.getdisplayclock());
                clock.timeincrement();
                
            }
        }, 0, 1000);
    }
}
