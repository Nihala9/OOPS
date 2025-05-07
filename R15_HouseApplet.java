import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HouseApplet extends JPanel {
    private Color doorColor = Color.BLUE;

    public HouseApplet() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                doorColor = (doorColor == Color.BLUE) ? Color.RED : Color.BLUE;
                repaint(); 
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 150);

        g.setColor(Color.RED);
        int[] xPoints = {80, 200, 320};
        int[] yPoints = {200, 100, 200};
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(doorColor);
        g.fillRect(170, 270, 60, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House App");
        HouseApplet applet = new HouseApplet();
        frame.add(applet);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
