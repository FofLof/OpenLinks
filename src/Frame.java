import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    JComboBox firstHour;
    JComboBox firstMinute;
    JComboBox secondHour;
    JComboBox secondMinute;
    JComboBox thirdHour;
    JComboBox thirdMinute;
    JComboBox fourthHour;
    JComboBox fourthMinute;
    JComboBox fifthHour;
    JComboBox fifthMinute;
    JComboBox sixthHour;
    JComboBox sixthMinute;

    JButton button;

    int selectedHour = 0;
    int selectedMinute = 0;

    int selectedHour2 = 0;
    int selectedMinute2 = 0;

    int selectedHour3 = 0;
    int selectedMinute3 = 0;

    int selectedHour4 = 0;
    int selectedMinute4 = 0;

    int selectedHour5 = 0;
    int selectedMinute5 = 0;

    int selectedHour6 = 0;
    int selectedMinute6 = 0;

    public JTextField createNewTextField (int sizeX, int sizeY, int posX, int posY, int limitX, int limitY) {
        JTextField nameOfField = new JTextField();
        nameOfField.setPreferredSize(new Dimension(sizeX,sizeY));
        this.add(nameOfField);
        nameOfField.setBounds(posX, posY, limitX, limitY);
        return nameOfField;
    }

    public JComboBox newComboBox(String[] array, int xPos, int yPos) {
        JComboBox comboBox = new JComboBox(array);
        comboBox.addActionListener(this);
        this.add(comboBox);
        comboBox.setBounds(xPos, yPos, 100, 40);
        return comboBox;
    }

    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 400);
        this.setTitle("Open Links");
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.BLACK);
        String[] Number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
        String[] MNumber = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
        "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"};

        firstHour = newComboBox(Number, 280, 40);
        firstMinute = newComboBox(MNumber, 385, 40);

        secondHour = newComboBox(Number, 280, 90);
        secondMinute = newComboBox(MNumber, 385, 90);

        thirdHour = newComboBox(Number, 280, 140);
        thirdMinute = newComboBox(MNumber, 385, 140);

        fourthHour = newComboBox(Number, 280, 190);
        fourthMinute = newComboBox(MNumber, 385, 190);

        fifthHour = newComboBox(Number, 280, 240);
        fifthMinute = newComboBox(MNumber, 385, 240);

        sixthHour = newComboBox(Number, 280, 290);
        sixthMinute = newComboBox(MNumber, 385, 290);

        button = new JButton();
        button.addActionListener(this);

        JLabel Link = new JLabel("Link");
        Link.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel Hour = new JLabel("Hour (Military Time)");
        Link.setFont(new Font("Arial", Font.PLAIN, 5));
        JLabel Minute = new JLabel("Minute");
        Link.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(Link);
        this.add(Hour);
        this.add(Minute);
        Link.setBounds(125, 0, 50, 50);
        Hour.setBounds(275, 0, 150, 50);
        Minute.setBounds(410, 0, 50, 50);
        Hour.setForeground(Color.WHITE);
        Minute.setForeground(Color.WHITE);
        Link.setForeground(Color.WHITE);

        /**
        checkBox = new JCheckBox();
        checkBox.setText("Turn on or off");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Arial", Font.PLAIN, 20 ));
        this.add(checkBox);
        checkBox.setBackground(Color.WHITE);
        checkBox.setBounds(500, 40, 150, 20);
        checkBox.setBorderPainted(true);
        checkBox.addActionListener(this);
        **/
        ImageIcon image = new ImageIcon("399-Bidoof (1).png");
        this.setIconImage(image.getImage());


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Tried putting this  into a switch statement but it doesn't seem to like e.getsource()
        if (e.getSource() == firstHour) {
            selectedHour = Integer.parseInt(String.valueOf(firstHour.getSelectedItem()));
        } else if (e.getSource() == firstMinute) {
            selectedMinute = Integer.parseInt(String.valueOf(firstMinute.getSelectedItem()));
        } else if (e.getSource() == secondHour) {
            selectedHour2 = Integer.parseInt(String.valueOf(secondHour.getSelectedItem()));
        } else if (e.getSource() == secondMinute) {
            selectedMinute2 = Integer.parseInt(String.valueOf(secondMinute.getSelectedItem()));
        } else if (e.getSource() == thirdHour) {
            selectedHour3 = Integer.parseInt(String.valueOf(thirdHour.getSelectedItem()));
        } else if (e.getSource() == thirdMinute) {
            selectedMinute3 = Integer.parseInt(String.valueOf(thirdMinute.getSelectedItem()));
        } else if (e.getSource() == fourthHour) {
            selectedHour4 = Integer.parseInt(String.valueOf(fourthHour.getSelectedItem()));
        } else if (e.getSource() == fourthMinute) {
            selectedMinute4 = Integer.parseInt(String.valueOf(fourthMinute.getSelectedItem()));
        } else if (e.getSource() == fifthHour) {
            selectedHour5 = Integer.parseInt(String.valueOf(fifthHour.getSelectedItem()));
        } else if (e.getSource() == fifthMinute) {
            selectedMinute5 = Integer.parseInt(String.valueOf(fifthMinute.getSelectedItem()));
        } else if (e.getSource() == sixthHour) {
            selectedHour6 = Integer.parseInt(String.valueOf(sixthHour.getSelectedItem()));
        } else if (e.getSource() == sixthMinute) {
            selectedMinute6 = Integer.parseInt(String.valueOf(sixthMinute.getSelectedItem()));
        }
    }
}
