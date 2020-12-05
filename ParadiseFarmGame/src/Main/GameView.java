package Main;

import Page.*;
import Page.Page;
import java.awt.*;
import javax.swing.*;

public class GameView extends JPanel {
    
    private Player player;
    
    private JFrame frame;
    private Graphics2D g2d;
    private String pageNow = "MenuView";
    private Page page;
    
    public final static int WIDTH = 800;
    public final static int HEIGHT = 800;

    public GameView(Player player) {
        frame = new JFrame();
        
        frame.add(this);
        page = new MenuView(player, this);
        
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2d = (Graphics2D) g;
        page.paint(g2d);
    }

    public Graphics2D getG2d() {
        return g2d;
    }

    public void setG2d(Graphics2D g2d) {
        this.g2d = g2d;
    }

    public String getPageNow() {
        return pageNow;
    }

    public void setPageNow(String pageNow) {
        this.pageNow = pageNow;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
    
    
    

    

}
