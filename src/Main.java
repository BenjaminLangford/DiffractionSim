import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main {
    public static void main(String[] args) {
        new JFXPanel();
        Platform.runLater(Main::launch);
        Platform.runLater(Main::control);
    }

    //OBJECTIVE: To calculate the diffraction of a wave between two slits. Allow for the slits to change size so that the diffraction can change
    //THIS PROJECT WILL BE PUT ON HOLD UNTIL I KNOW MORE ABOUT THE MATHS BEHIND LIGHT

    private static void control() {
        int controlWidth = 400;
        int controlHeight = 200;
        Stage stage = new Stage();
        stage.setWidth(controlWidth);
        stage.setHeight(controlHeight);
        stage.setResizable(false);
        stage.setOnCloseRequest(we -> close());
        stage.show();

        Group group = new Group();
        Scene scene = new Scene(group);
        stage.setScene(scene);

        VBox vb = new VBox();
        vb.setPrefWidth(controlWidth);
        vb.setPrefHeight(controlHeight);

    }

    private static void close() {
        System.exit(0);
    }

    private static int windowWidth = 1000;
    private static int windowHeight = 500;

    private static void launch() {
        Stage stage = new Stage();
        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);
        stage.setResizable(false);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setOnCloseRequest(we -> close());
        stage.show();

        Group group = new Group();
        Scene scene = new Scene(group);
        stage.setScene(scene);

        generateProp(group);
        generateScreen(group);
    }

    private static void generateProp(Group g) {

    }

    private static void generateScreen(Group g) {

    }
}
