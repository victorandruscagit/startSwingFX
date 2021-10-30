package sw.andrusca;
import javax.swing.*;
import java.awt.*;

public class TestGUI {
    public static void main(String[] args) {

       /* JFrame jFrame = new JFrame("Test Frame");

        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        FlowLayout flowLayout = new FlowLayout();
        jFrame.setLayout(flowLayout);
        JPanel jPanel = new JPanel(flowLayout);


        JButton jButton = new JButton("BButton");
        jFrame.add(jButton);
*/
        MyJButton button1 = new MyJButton("Button");
        MyJPannel pannel = new MyJPannel("Pannel1",100, 100, button1);
        MyJFrame frame = new MyJFrame("Frame1", 200, 200, pannel);
    }

}
