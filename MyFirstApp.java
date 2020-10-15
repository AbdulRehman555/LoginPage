import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFirstApp implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String args[]){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        Color navyBlue = new Color(10,30,50);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);
        panel.setBackground(Color.darkGray);

        userLabel =  new JLabel("Username");
        userLabel.setBounds(20,20,80,25);
        userLabel.setForeground(Color.white);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20,70,80,25);
        passwordLabel.setForeground(Color.white);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,70,165,25);
        panel.add(passwordText);

        button  = new JButton("Login");
        button.setBounds(185,150,80,25);
        button.setBackground(navyBlue);
        button.setForeground(Color.white);
        button.addActionListener(new MyFirstApp());
        panel.add(button);

        success = new JLabel();
        success.setBounds(100,200,1000,25);
        success.setForeground(Color.yellow);
        panel.add(success);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password  = passwordText.getText();

        if(user.equals("Ali") && password.equals("12345"))
            success.setText("Welcome!  "+user);
        else
            success.setText("Login Failed!");
    }
}
