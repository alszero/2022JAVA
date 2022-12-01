//package src.GUI;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class LayoutEx extends JFrame {
//    LayoutEx() {
//        setTitle("Layout sample");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Container contentPane = getContentPane();
//
////        //FlowLayout 설정
////        contentPane.setLayout(
////                new FlowLayout(FlowLayout.LEFT, 30, 40));
////        //hGap
////        //vGap
////        contentPane.add(new JButton("add"));
////        contentPane.add(new JButton("sub"));
////        contentPane.add(new JButton("mul"));
////        contentPane.add(new JButton("div"));
////        contentPane.add(new JButton("calculate"));
////
////        setSize(300, 200);
////        setVisible(true);
////    }//프레임설정
//
//    //borderLayout 설정
//        contentPane.setLayout(
//                new BorderLayout(30, 40));
//    //hGap
//    //vGap
//        contentPane.add(new JButton("add"), BorderLayout.NORTH);
//        contentPane.add(new JButton("sub", BorderLayout.SOUTH));
//        contentPane.add(new JButton("mul"));
//        contentPane.add(new JButton("div"));
//        contentPane.add(new JButton("calculate"));
//
//    setSize(300, 200);
//    setVisible(true);
//}//프레임설정
//
//    public static void main(String[] args) {
//        new LayoutEx(); //객체생성
//    }
//}
