package sw.andrusca;

import javax.swing.*;
import java.awt.*;

public class MyJPannel extends JPanel {

    public MyJPannel(String name, int width, int height) {
        super.setSize(width, height);
        super.setName(name);
        super.setBorder(BorderFactory.createEtchedBorder(88,Color.BLUE,Color.DARK_GRAY));
    }

    public MyJPannel(String name, int width, int height, Component component) {
        this(name, width, height);
        super.add(component);

    }



    public MyJPannel(String name, int width, int height, LayoutManager manager) {
        this(name, width, height);
        super.setLayout(manager);

    }

    public MyJPannel(String name, int width, int height, Component component, LayoutManager manager) {
        this(name, width, height);
        super.add(component);
        super.setLayout(manager);

    }

}
