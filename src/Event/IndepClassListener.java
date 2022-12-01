package Event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
    IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        c.add(btn);
        setSize(250, 120);
        setVisible(true);
    }
    public static void main(String [] args) {
        new IndepClassListener();
    }
}
// 독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener {  //ActionListner 를 구현
    public void actionPerformed(ActionEvent e) {
        // 이벤트 객체는 이벤트 정보를 담기
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action"))
            b.setText("액션");
        else
            b.setText("Action");

        // InnerClassListener나
    }
}

