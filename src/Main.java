
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Clock;
import java.time.ZonedDateTime;


public class Main extends Frame {

    static String theLink;
    static Robot robot = null;
    static int linkBoxes = 25;
    static int minusAmount = 70;
    static ZonedDateTime zonedDateTime;

    public static void openURL() {
        try {
            URI uri = new URI(theLink);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(long amount) {
        try {
            Thread.sleep(amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Frame frame = new Frame();

        JTextField firstLink = frame.createNewTextField(250, 40, linkBoxes, 110 - minusAmount, 250, 40);

        JTextField secondLink = frame.createNewTextField(250, 40, linkBoxes, 160 - minusAmount, 250, 40);

        JTextField thirdLink = frame.createNewTextField(250, 40, linkBoxes, 210 - minusAmount, 250, 40);

        JTextField fourthLink = frame.createNewTextField(250, 40, linkBoxes, 260 - minusAmount, 250, 40);

        JTextField fifthLink = frame.createNewTextField(250, 40, linkBoxes, 310 - minusAmount, 250, 40);

        JTextField sixthLink = frame.createNewTextField(250, 40, linkBoxes, 360 - minusAmount, 250, 40);

            /**
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    try {
                        URI uri = new URI(theLink);
                        java.awt.Desktop.getDesktop().browse(uri);
                    } catch (URISyntaxException | IOException e) {
                        e.printStackTrace();
                    }

                    cancel();
                }
            };
             **/

        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        while (true) {
                //woops forgot traditional naming convention
                String FirstLink = firstLink.getText();
                sleep(1000);
                String SecondLink = secondLink.getText();
                sleep(1000);
                String ThirdLink = thirdLink.getText();
                sleep(1000);
                String FourthLink = fourthLink.getText();
                sleep(1000);
                String FifthLink = fifthLink.getText();
                sleep(1000);
                String SixthLink = sixthLink.getText();
                sleep(1000);
                zonedDateTime = ZonedDateTime.now(Clock.systemDefaultZone());
                int currentHour = zonedDateTime.getHour();
                int currentMinute = zonedDateTime.getMinute();
                if (currentHour == frame.selectedHour && currentMinute == frame.selectedMinute) {
                    theLink = FirstLink;
                    System.out.println(theLink);
                    openURL();
                    sleep(60000);
                    continue;
                } else if (currentHour == frame.selectedHour2 && currentMinute == frame.selectedMinute2) {
                    theLink = SecondLink;
                    openURL();
                    sleep(60000);
                    continue;
                } else if (currentHour == frame.selectedHour3 && currentMinute == frame.selectedMinute3) {
                    theLink = ThirdLink;
                    openURL();
                    sleep(60000);
                    continue;
                } else if (currentHour == frame.selectedHour4 && currentMinute == frame.selectedMinute4) {
                    theLink = FourthLink;
                    openURL();
                    sleep(60000);
                    continue;
                } else if (currentHour == frame.selectedHour5 && currentMinute == frame.selectedMinute5) {
                    theLink = FifthLink;
                    openURL();
                    sleep(60000);
                    continue;
                } else if (currentHour == frame.selectedHour6 && currentMinute == frame.selectedMinute6) {
                    theLink = SixthLink;
                    openURL();
                    sleep(60000);
                    continue;
                }
            }
        }
    }



