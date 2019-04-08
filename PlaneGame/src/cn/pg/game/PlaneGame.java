package cn.pg.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlaneGame extends JFrame {

    Image plane = GameUtil.getImage("images/plane.png");
    Image bg = GameUtil.getImage("images/bg.jpg");
    int x = 250, y = 250;

    @Override
    public void paint(Graphics g) {
        g.drawImage(bg, 0, 0, null);
        g.drawImage(plane, x, y, null);
        x++;

    }

    public void launchFrame() {
        // 初始化窗口
        this.setTitle("PlaneGame");
        this.setVisible(true);
        this.setSize(650, 406);
        this.setLocation(300, 300);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        new PaintThread().start();
        addKeyListener(new KeyMonitor()); // 键盘监听
    }

    public static void main(String[] args) {
        PlaneGame planeGame = new PlaneGame();
        planeGame.launchFrame();
    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            super.run();
            while (true) {
//                System.out.println("repaint");
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            System.out.println(e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);

        }
    }

}
