import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {
    private final int SCREENSIZE = 800;
    private final int UNITSIZE = 40;

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREENSIZE, SCREENSIZE));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {
        g.setColor(Color.white);
        for(int i = 0; i< SCREENSIZE; i++) {
            g.drawLine(i*UNITSIZE, 0, i*UNITSIZE, SCREENSIZE);
            g.drawLine(0, i*UNITSIZE, SCREENSIZE, i*UNITSIZE);
        }
    }
    public void check() {

    }
    public void actionPerformed(ActionEvent e) {
        check();
        repaint();
    }
}
