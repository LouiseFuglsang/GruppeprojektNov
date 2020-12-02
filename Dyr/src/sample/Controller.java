package sample;


import java.io.File;
import java.net.URI;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {

    @FXML
    private Button photoPortal;

    @FXML
    private ChoiceBox dropDownMenuPhotos;

    @FXML
    private TextField nameOfPhoto;

    @FXML
    private ImageView photoSelected;


    @FXML
    private Button soundPortal;

    @FXML
    private ChoiceBox dropDownMenuSounds;

    @FXML
    private TextField nameOfSound;

    @FXML
    private ImageView soundSelected;

    @FXML
    void choosePhoto(ActionEvent event) {

        String fotos = (String) dropDownMenuPhotos.getValue();

        if (!fotos.isEmpty() || !fotos.isBlank()) {
            String filnavn = fotos + ".jpg";
            nameOfPhoto.setText(filnavn);
            Image image = new Image("fotos/" + filnavn);
            photoSelected.setImage(image);
        }
    }

    @FXML
    void chooseSound(ActionEvent event) {


        String lyde = (String) dropDownMenuSounds.getValue();

        if (!lyde.isEmpty() || !lyde.isBlank()) {
            String filnavn = lyde + ".mp3";
            nameOfSound.setText(filnavn);

            File f = new File("src/lyde/" + filnavn);
            Media media = new Media(f.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        }

    }
}

