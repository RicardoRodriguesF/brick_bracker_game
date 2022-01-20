import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        GamePlay gamePlay = new GamePlay();
        JFrame obj = new JFrame();
        obj.add(gamePlay);
        obj.setBounds(20, 20,700,600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
