
import java.awt.*;
import javax.swing.*;

public class ControlPanel extends JPanel
{

    RightPanel right;
    LeftPanel left;

    public ControlPanel()
    {
        super();
        //needs a layout
        setBackground(Color.DARK_GRAY);
        right = new RightPanel();
        left = new LeftPanel();
        add(left, "North");
        add(right, "Center");
    }

    @Override
    public void paintComponent(Graphics g)  //just an example of how to use paintComponent
    {                                       
        super.paintComponent(g); 
        Font f1 = new Font("Lucinda", Font.BOLD, 30);
        g.setFont(f1);
        g.setColor(Color.white);
        g.drawString("This panel will need a Layout", 100, 200);
    }

}
