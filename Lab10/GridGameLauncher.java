import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridGameLauncher extends JFrame implements ActionListener {
  private JFrame gamePlayer;
  private JPanel buttonPanel;
  private JButton tictactoeButton;
  private JButton minesweeperButton;
  private JButton connectFourButton;

  public GridGameLauncher() {
    this.gamePlayer = new JFrame("Game Launcher");
    this.buttonPanel = new JPanel();
    this.tictactoeButton = new JButton("Tic Tac Toe");
    //tictactoeButton.addActionListener(actionPerformed);
    this.minesweeperButton = new JButton("Minesweeper");
    this.connectFourButton = new JButton("Connect Four");
  }

  private void prepareGUI() {
    // Create window for game launcher
    gamePlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gamePlayer.setLayout(new FlowLayout());
    gamePlayer.setSize(400,100);

    // Create panel to hold buttons for games
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.setBackground(Color.white);

    // Add panel to window
    gamePlayer.add(buttonPanel);
    gamePlayer.setVisible(true);

    addButtons();
  }

  private void addButtons() {
    // Add buttons to panel
    buttonPanel.add(tictactoeButton);
    buttonPanel.add(minesweeperButton);
    buttonPanel.add(connectFourButton);
  }

  public void actionPerformed(ActionEvent e) {
    if (tictactoeButton.isSelected()) {

    }
  }

  public static void main(String[] args) {
    GridGameLauncher launcher = new GridGameLauncher();
    launcher.prepareGUI();

  }

}
