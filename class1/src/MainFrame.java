import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtnAdd = new JButton( "add");
    private JButton jbtn = new JButton("decrease");
    private JButton jbt =new JButton("exit");
    private int count =0;
    private int decrease =50;
    public MainFrame (){
        inti();
    }
    private void inti(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jbtnAdd.setLocation(100,300);
        jbtnAdd.setSize(120,30);
        this.add(jbtnAdd);
        jbtn.setLocation(250,300);
        jbtn.setSize(120,30);
        this.add(jbtn);
        jbt.setLocation(400,300);
        jbt.setSize(120,30);
        this.add(jbt);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                MainFrame.this.setTitle(Integer.toString(count));
            }
        });
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decrease--;
                MainFrame.this.setTitle(Integer.toString(decrease));
            }
        });
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });





    }
}

