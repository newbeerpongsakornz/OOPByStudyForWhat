package Page;

import Main.MyImage;
import Main.*;
import java.awt.*;

public class MenuView extends Page implements Runnable {
    
    
    private MyImage imgBackground;
    private MyImage imgNew;
    private MyImage imgLogo;
    private Thread t;

    public MenuView() {
        
        imgBackground = new MyImage("/background/menu.png");
        imgBackground.setSize(800, 800);
        imgNew = new MyImage("newgame2.png", 200, 525);
        imgNew.setSize(imgNew.getWidth(), imgNew.getHeight());
        imgLogo = new MyImage("ParadiseFarmLogo.png", 130, 100);
        
        t = new Thread(this);
        t.start();
    }

    public void paint(Graphics2D g2d) {
        g2d.drawImage(imgBackground.loadImage(), imgBackground.getX(), imgBackground.getY(), imgBackground.getWidth(), imgBackground.getHeight(), null);
        g2d.drawImage(imgNew.loadImage(), imgNew.getX(), imgNew.getY(), imgNew.getWidth(), imgNew.getHeight(), null);
        g2d.drawImage(imgLogo.loadImage(), imgLogo.getX(), imgLogo.getY(), imgLogo.getWidth(), imgLogo.getHeight(), null);
        g2d.setFont(new Font("Ayutaya", Font.BOLD, 20));
        g2d.drawString("Last history: ", 0, 25);
        g2d.drawString("Day: "+GameController.model.getHistory()[0], 0, 50);
        g2d.drawString("Money: "+GameController.model.getHistory()[1], 0, 75);
        GameController.view.repaint();
    }

    @Override
    public void run() {
        while (true) {
            try {
                for (int i = 0; i < 50; i += 5) {
                    imgLogo.setY(imgLogo.getY() + 1);
                    Thread.sleep(50);
                }
                for (int i = 50; i > 0; i -= 5) {
                    imgLogo.setY(imgLogo.getY() - 1);
                    Thread.sleep(50);
                }
            } catch (Exception ex) {

            }
        }
    }

    public MyImage getImgNew() {
        return imgNew;
    }

    public void setImgNew(MyImage imgNew) {
        this.imgNew = imgNew;
    }

}
