package sample;


import java.io.File;
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
        System.out.println("Viser " + fotos);

        if (!fotos.isEmpty() || !fotos.isBlank()) {
            String filnavn = fotos + ".jpg";
            nameOfPhoto.setText(filnavn);
            Image image = new Image("fotos/" + filnavn);
            photoSelected.setImage(image);
        }
    }


    @FXML
    void chooseSound(ActionEvent event) {
/*
        String lyde = (String) dropDownMenuSounds.getValue();

        if (!lyde.isEmpty() || !lyde.isBlank()) {
            String filnavn = lyde + ".mp3";
            nameOfSound.setText(filnavn);
            Media mediaPlayer = new Media("lyde/" + filnavn);
            mediaPlayer.play();
        }
*/


        String source = new File("src/lyde/hest.mp3").toURI().toString();
        Media media = null;
        media = new Media(source);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();


//           URL path;

/*
        switch (lyde) {
            case "bird":
                getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Cat":
                getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Dog":
                getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Elephant":
                getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "hest":
                getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Monkey":
                getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Pig":
                getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;

            default:
                System.out.println("Vælg en dyrelyd");

        }*/
    }
}

