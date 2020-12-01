package sample;

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



 //   @FXML
//    private Button soundPortal;

  //  @FXML
    //private ChoiceBox dropDownMenuSounds;

//    @FXML
  //  private TextField nameOfSound;

    //@FXML
    //private ImageView soundSelected;



    @FXML
    void choosePhoto(ActionEvent event) {

        String fotos = (String) dropDownMenuPhotos.getValue();
        System.out.println("Viser " + fotos);

        if (!fotos.isEmpty() || !fotos.isBlank()) {
            String filnavn = fotos + ".jpg";
            nameOfPhoto.setText(filnavn);
            Image image = new Image("fotos/" + filnavn);
            photoSelected.setImage(image);
        }}


//    @FXML
 /*   void ChooseSound(ActionEvent event) {
        String billede = (String) dropDownMenuSounds.getValue();

        if (!billede.isEmpty() || !billede.isBlank()) {
            String filnavn = billede + ".jpg";
            nameOfSound.setText(filnavn);
            Image image = new Image("sample/sounds/" + filnavn);
            photoSelected.setImage(image);
        }
           URL path;

        switch (billede) {
            case "Bird":
                path = getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Cat":
                path = getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Dog":
                path = getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Elephant":
                path = getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Horse":
                path = getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Monkey":
                path = getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;
            case "Pig":
                path = getClass().getResource("https://www.youtube.com/watch?v=aReRSVpg298");
                break;

            default:
                System.out.println("Vælg en dyrelyd");

        }
        }
  */      }

