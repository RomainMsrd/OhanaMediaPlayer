package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class CFilmCreationView {
    @FXML
    public Button choiceButton;
    public TextField pathText;
    public TextField nameText;
    public HBox categoryList;
    public ScrollPane notAllowedUsers;




    public void choiceAction(ActionEvent e){
        Stage stage = new Stage();
        FileChooser myFileChooser = new FileChooser();
        myFileChooser.setTitle("Sauvegarder un fichier png");
        myFileChooser.setInitialFileName("Untitled.png");
        File file = myFileChooser.showOpenDialog(stage);
        String myPath = file.getPath();
        this.pathText.setText(myPath);
    }

    public void addCategory(ActionEvent e) {
        Button testButton = new Button("test");
        this.categoryList.getChildren().add(testButton);
    }

}
