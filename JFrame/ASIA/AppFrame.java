import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppFrame extends JFrame {
    private Container cp;
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmFile = new JMenu("File");
    private JMenu jmTool = new JMenu("Tool");
    private JMenu jmGame = new JMenu("Game");
    private JMenu jmHelp = new JMenu("Help");
    private JMenuItem jmiExit = new JMenuItem("Exit");
    private JMenuItem jmiLogout = new JMenuItem("Logout");
    private JMenuItem jmiCalculator = new JMenuItem("Calculator");
    private LoginFrame loginframe;

    public AppFrame(LoginFrame login){
        loginFrame = login;
        init();
    }
    private void init();

}

    


}