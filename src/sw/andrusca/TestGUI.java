package sw.andrusca;
import javax.swing.*;
import java.awt.*;

public class TestGUI {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame jFrame = new JFrame("Test Frame");

        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);



        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);

        JButton jButton = new JButton("BButton");
        jButton.setSize(100,20);
        jFrame.add(jButton);

        JPanel jPanel = new JPanel(flowLayout);
        jPanel.setBorder(BorderFactory.createCompoundBorder());

        jPanel.setSize(100, 100);
        jPanel.add(jButton);

        jFrame.getContentPane().add(jPanel);




/*
        MyJButton button1 = new MyJButton("Button");
        MyJPannel pannel = new MyJPannel("Pannel1",100, 100, button1);
        MyJFrame frame = new MyJFrame("Frame1", 200, 200, pannel);*/


    }

}
