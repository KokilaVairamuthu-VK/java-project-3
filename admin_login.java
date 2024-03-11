package ss;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static ss.Main.admin;

public class admin_login extends JFrame implements ActionListener {
    JLabel lab;
    JLabel username;
    JLabel password;
    JButton fp;
    JButton exit;
    JButton submit;
    JTextField userfield;
    JTextField passfield;
    public admin_login(){
        setTitle("welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lab = new JLabel("Admin Log-in Page");
        fp = new JButton("Forget Password ?");
        exit = new JButton("EXIT");
        username = new JLabel("USERNAME");
        password = new JLabel("PASSWORD");
        submit = new JButton("SUBMIT");
        userfield = new JTextField();
        passfield = new JTextField();
        fp.setBounds(50,280,150,30);
        fp.setBackground(Color.white);
        fp.setForeground(Color.BLUE);
        exit.setBounds(290,200,100,40);
        exit.setBackground(Color.black);
        exit.setForeground(Color.white);
        lab.setBounds(250,0,150,50);
        lab.setForeground(Color.red);
        username.setBounds(150,100,80,30);
        password.setBounds(150,150,100,30);
        submit.setBounds(160,200,100,40);
        userfield.setBounds(300,100,80,30);
        passfield.setBounds(300,150,80,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        fp.addActionListener(this);
        exit.addActionListener(this);
        add(username);
        add(exit);
        add(password);
        add(submit);
        add(userfield);
        add(passfield);
        add(lab);
        add(fp);
        setLayout(null);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a){
        if(a.getSource() == submit) {
            if (admin.getUserName() != userfield.getText()||
                    admin.getPassword() != passfield.getText()) {
                System.out.println("Invalid Credentials");
            }else{
                System.out.println("LogIn successfully");
                new QandA();
            }

        }
        if(a.getSource() == fp){
            this.dispose();
            new forgetpassword();
        }if(a.getSource() == exit){
            this.dispose();
            new MainMenu();
        }
    }

}
