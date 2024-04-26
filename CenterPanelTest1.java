import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//202295035 홍요한
class NorthPanel extends JPanel {
    public NorthPanel(CenterPanel cnt) {
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER, 10, 15);
        setLayout(f1);

        JButton jb1 = new JButton("Open");
        JButton jb2 = new JButton("Read");
        JButton jb3 = new JButton("Close");

        jb1.addActionListener(new EventClass(cnt, "Open"));
        jb2.addActionListener(new EventClass(cnt, "Read"));
        jb3.addActionListener(new EventClass(cnt, "Close"));

        add(jb1);
        add(jb2);
        add(jb3);
        setBackground(Color.orange);
    }
}

class CenterPanel extends JPanel {
    JLabel a;

    public CenterPanel() {
        setLayout(null);
        a = new JLabel("Hello");
        a.setSize(50, 10);
        a.setLocation(170, 10);

        JLabel b = new JLabel("Love");
        b.setSize(50, 10);
        b.setLocation(280, 100);

        JLabel c = new JLabel("Java");
        c.setSize(50, 10);
        c.setLocation(10, 180);

        add(a);
        add(b);
        add(c);
    }

    public void changeLabelText(String newText) {
        a.setText(newText);
    }
}

class EventClass implements ActionListener {
    CenterPanel cnt;
    String newText;

    public EventClass(CenterPanel cnt, String newText) {
        this.cnt = cnt;
        this.newText = newText;
    }

    public void actionPerformed(ActionEvent e) {
        cnt.changeLabelText(newText);
    }
}

class JPanel3 extends JFrame {
    public JPanel3() {
        Container ct = getContentPane();
        ct.setLayout(new BorderLayout());
        CenterPanel cnt = new CenterPanel();
        ct.add(new NorthPanel(cnt), BorderLayout.NORTH);
        ct.add(cnt, BorderLayout.CENTER);
        setTitle("여러 패널을 이용한 예제");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class CenterPanelTest1 {
    public static void main(String[] args) {
        new JPanel3();
    }
}
