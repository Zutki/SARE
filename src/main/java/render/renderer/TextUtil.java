/**
 * The TextUtil class provides tools to help with text
 */

package render.renderer;

import java.awt.*;

public class TextUtil {
    public static final int LEFT = 0;
    public static final int CENTERED = 1;
    public static final int RIGHT = 2;


    /**
     * Draws text in a given position, with specified color and font
     * @param text the text to draw
     * @param color the color to draw the text as
     * @param font the font to use for drawing the text
     * @param position the position to draw the text at
     * @param graphics the graphics object provided by paintComponent
     */
    public static void drawText(String text, int alignment, Color color, Font font, Point position, Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        graphics2D.setColor(color);
        graphics2D.setFont(font);
        FontMetrics metrics = graphics2D.getFontMetrics(graphics2D.getFont());

        switch (alignment) {
            case 2:
                graphics2D.drawString(text, position.x, position.y);
                return;
            case 1:
                graphics2D.drawString(text, position.x - metrics.stringWidth(text) / 2, position.y);
                return;
            case 0:
                graphics2D.drawString(text, position.x - metrics.stringWidth(text), position.y);
        }
    }
}
