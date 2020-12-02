package sample;

import javafx.event.ActionEvent;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Datafil {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Log over brug af dyreapp");
        System.out.println("Indlæser data...");

        Datafil datafil = new Datafil();
        datafil.save();
        datafil.load();
    }

    public void save() throws FileNotFoundException {

        java.io.File file = new java.io.File("data/Controller.txt");
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        //      output.print("Apple ");

        // Close the file
        output.close();
    }

    public void load() throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("sample/Controller.txt");
/*
        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String choosephoto = input.next();
            String chooseSound = input.next();
            System.out.println(new Controller().getChoosePhoto());
            System.out.println(new Controller().getChooseSound());

        }

        //Close the file
        input.close();
  */
    }
}