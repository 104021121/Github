import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame2 extends JFrame {
    private JButton jbtnAdd = new JButton("<--");
    private JButton jbtn = new JButton("-->");
    private JButton jbt =new JButton("Exit");
    private JButton jba =new JButton("Back");
    private JLabel jlb = new JLabel(">_<");

    private int x =50;
    public MainFrame2 (){
        inti();
    }
    private void inti(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(500,50);
        this.setSize(800,600);

        jlb.setBounds( x ,100,120,30);
        this.add(jlb);

        jbtnAdd.setLocation(100,300);
        jbtnAdd.setSize(120,30);
        this.add(jbtnAdd);

        jbtn.setLocation(250,300);
        jbtn.setSize(120,30);
        this.add(jbtn);

        jba.setLocation(400,300);
        jba.setSize(120,30);
        this.add(jba);

        jbt.setLocation(550,300);
        jbt.setSize(120,30);
        this.add(jbt);

        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=10;
                jlb.setLocation(x,100);
                jlb.setText("^_^");
                MainFrame2.this.setTitle(Integer.toString(x));
            }
        });
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=10;
                jlb.setLocation(x,100);
                jlb.setText("?_?");
                MainFrame2.this.setTitle(Integer.toString(x));
            }
        });
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(">_<");
            }
        });





    }
}

