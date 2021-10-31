package sw.andrusca;
import javax.swing.*;
import java.awt.*;

public class TestGUI {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Test Frame");

        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);



        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);

        JButton jButton = new JButton("BButton");
        jFrame.add(jButton);

        JPanel jPanel = new JPanel(flowLayout);
        jPanel.setBorder(BorderFactory.createCompoundBorder());

        jPanel.setSize(100, 100);
        jPanel.add(jButton);
        jFrame.add(jPanel);




/*
        MyJButton button1 = new MyJButton("Button");
        MyJPannel pannel = new MyJPannel("Pannel1",100, 100, button1);
        MyJFrame frame = new MyJFrame("Frame1", 200, 200, pannel);*/


    }

}
