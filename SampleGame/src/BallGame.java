import java.awt.*;
import javax.swing.*;



public class BallGame extends JFrame {
    Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("image/desktop.jpg");

    double x = 100;
    double y = 100;
    double degree = 3.14 / 3;



    // draw window
    public void paint (Graphics g) {
        System.out.println("drawing");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);

        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        if (y > 500-40-30 || y < 60 ) {
            degree = -degree;
        }

        if (x < 40 || x > 856-40 -30) {
            degree = 3.14 -degree;
        }

    }

    // load frame
    void launchFrame () {
        setSize(856, 501);
        setLocation(50, 50);
        setVisible(true);

        // loop
        while (true) {
            repaint();
            try{
                Thread.sleep(30);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("sample game");
        BallGame game = new BallGame();
        game.launchFrame();

    }
}

