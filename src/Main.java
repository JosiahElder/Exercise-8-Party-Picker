import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main extends JFrame
{
    private JLabel nameL;
    private JLabel foodL;
    private JLabel invitedL;

    private JTextField nameF;
    private JTextField foodF;

    private JCheckBox invitedChk;

    private JButton addBtn;
    private JButton displayBtn;

    private ArrayList<Friend> friendList;

    public Main()
    {
        super("Party Picker");
        friendList = new ArrayList<Friend>();

        nameL = new JLabel("Full Name:");
        foodL = new JLabel("Food:");
        invitedL = new JLabel("Invited:");

        nameF = new JTextField(30);
        foodF = new JTextField(30);

        invitedChk = new JCheckBox();
        addBtn = new JButton("Add Friend");
        displayBtn = new JButton("Display Report");

        setLayout(new GridLayout(4, 2));
        add(nameL);
        add(nameF);

        add(foodL);
        add(foodF);

        add(invitedL);
        add(invitedChk);

        add(addBtn);
        add(displayBtn);

        addBtn.addActionListener(new AddButtonListener());
        displayBtn.addActionListener(new ReportButtonListener());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\n\n" +
                "Enter person's name and the type of food they're likely to bring, \n" +
                "then indicate whether they are actually invited to the party or not.");

        new Main();
    }
}