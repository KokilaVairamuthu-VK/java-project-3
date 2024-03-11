package ss;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class QandA extends JFrame implements ActionListener {
JButton que;
        JButton dl;
        JButton submit;
        JButton cancel;
        JTextField tf_que;
        JLabel l_que;
        JTextField ans;
        JLabel sno1;
        JLabel sno2;
        JLabel sno3;
        JLabel sno4;
        JLabel an;
        JTextField option1;
        JTextField option2;
        JTextField option3;
        JTextField option4;
        public QandA() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Admin - Questions adding page");
            ans = new JTextField();
            an = new JLabel("Answer -->");
            dl = new JButton("Refresh DB");
            que = new JButton("Add Question");
            submit = new JButton("Submit");
            cancel = new JButton("Cancel");
            tf_que = new JTextField();
            l_que = new JLabel("Post Question");
            option1 = new JTextField();
            option2 = new JTextField();
            option3 = new JTextField();
            option4 = new JTextField();
            sno1 = new JLabel("1.");
            sno2 = new JLabel("2.");
            sno3 = new JLabel("3.");
            sno4 = new JLabel("4.");
            an.setBounds(110,150,80,30);
            dl.setBounds(400,250,150,30);
            dl.setBackground(Color.black);
            dl.setForeground(Color.white);
            l_que.setForeground(Color.red);
            l_que.setBounds(100, 20, 150, 30);
            tf_que.setBounds(100, 50, 300, 80);
            que.setBounds(400,200,150,30);
            option1.setBounds(130,150,80,30);
            option2.setBounds(130,200,80,30);
            option3.setBounds(130,250,80,30);
            option4.setBounds(130,300,80,30);
            ans.setBounds(200,150,80,30);
            sno1.setBounds(100,150,80,30);
            sno2.setBounds(100,200,80,30);
            sno3.setBounds(100,250,80,30);
            sno4.setBounds(100,300,80,30);
            que.setBackground(Color.black);
            que.setForeground(Color.white);
            que.addActionListener(this);
            submit.setBounds(420, 350, 100, 30);
            submit.setBackground(Color.black);
            submit.setForeground(Color.white);
            submit.addActionListener(this);
            cancel.setBounds(420,300,100,30);
            cancel.setBackground(Color.black);
            cancel.setForeground(Color.white);
            l_que.setFont(new Font("Courier",Font.BOLD,15));
            cancel.addActionListener(this);
            dl.addActionListener(this);
            add(tf_que);
            add(l_que);
            add(que);
            add(submit);
            add(cancel);
            //add(option1);
            //add(option2);
            //add(option3);
            //add(option4);
            //add(sno1);
            //add(sno2);
            //add(an);
            add(dl);
            //add(ans);
            //add(sno3);
            //add(sno4);
            setLayout(null);
            setSize(600,500);
            setLocationRelativeTo(null);
            setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == que) {
            System.out.println("question added successfully");
        }
    }
}
