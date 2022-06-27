package render.renderer;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {
    public Renderer(Dimension windowDimensions) {
        setPreferredSize(windowDimensions);
        setBackground(Color.RED);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        TextUtil.drawText("Hello World!", TextUtil.CENTERED, Color.BLACK, new Font("Noto Sans", Font.BOLD, 24), new Point(getWidth()/2, getHeight()/2), g);

        // General recommendation for smooth animations on all systems
        Toolkit.getDefaultToolkit().sync();
    }

}
