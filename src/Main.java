import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;

public class Main {
    public static void main(String[] args) {
        new JFXPanel();
        Platform.runLater(Main::launch);
    }

    private static void launch() {

    }
}
