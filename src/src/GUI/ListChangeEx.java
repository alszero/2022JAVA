package src.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ListChangeEx extends JFrame {
    private JTextField tf = new JTextField(10);
    // 사용자로부터 텍스트를 입력받는 컴포넌트
    private Vector<String> v = new Vector<String>();
    // 컬렉션 벡터를 이용하여 리스트 관리
    private JList<String> nameList = new JList<String>(v);
    // 백터에 들어있는 데이터를 JList가 화면에 표시해준다

    public ListChangeEx() {
        setTitle("리스트 변경 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름 입력 후 <Enter> 키"));
        c.add(tf); // 이벤트 추가

        v.add("황기태");
        v.add("이재문");
        //JList 설정 메서드
        nameList.setVisibleRowCount(5);//세로
        nameList.setFixedCellWidth(100);//폭
        c.add(new JScrollPane(nameList));

        setSize(300,300);
        setVisible(true);

        // JTextField에 ActionLister 등록. <Enter> 키 처리
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                v.add(t.getText());
                t.setText("");
                nameList.setListData(v);
            }
        });
    }
    public static void main(String [] args) {
        new ListChangeEx();
    }
}

