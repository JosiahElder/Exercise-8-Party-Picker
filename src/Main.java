import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main
{
    private JLabel nameL;
    private JLabel foodL;
    private JLabel invitedL;

    private JTextField nameF;
    private JTextField foodF;

    private JCheckBox invitedBox;

    private JButton addButton;
    private JButton reportButton;

    private ArrayList<Friend> friendList;

    public Main()
    {
        super();
        friendList = new ArrayList<Friend>();

        nameL = new JLabel("Name:");
        foodL = new JLabel("Food:");
        invitedL = new JLabel("Invited:");

        nameF = new JTextField(30);
        foodF = new JTextField(30);
    }

    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Party Picker.\n\n" +
                "Enter person's name and the type of food they're likely to bring, \n" +
                "then indicate whether they are actually invited to the party or not.");

        new Main();
    }
}