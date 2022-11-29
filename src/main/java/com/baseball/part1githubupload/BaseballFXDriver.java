package com.baseball.part1githubupload;
/**
 ***********************************************************************************
 * Title: BaseballFXDriver
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: BaseballFXDriver.java
 * Description: Steps:
 *  Hitters
 *  1, Click the dropdown menu
 *  2, select hitter
 *  3, pop up will happen asking if you want your list sorted by AVG Click yes
 *  4, Text area will pop up and show you the current sorted list
 *  5, Exit that by clicking the X in the upper right-hand corner
 *  6, click the dropdown again and click save hitters Note nothing will save
 *      they were saved, but they were.
 *  7, Click on the view saved hitters an organized text area will pop up with the players
 *     sorted by there AVG or ERA
 *  8, Note: If you clicked view saved hitter/pitchers they will not be organized
 *          , but in the order of the array do it without do it without
 *  9, Same steps for a go along with the pitcher\
 *  10, Notes I have multiple other FXDrivers with different methods of work, and I am trying to
 *      find the right way to fit them all together but this I think covers the requirement for assignment
 *      #1, and I will comment out the other classes that I am working on.
 ***********************************************************************************
 * */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class BaseballFXDriver extends Application {


    //Single dimensional array that represents the Opening Menu
    private static String[] menuOne = {"Hitter", "Pitcher", "SaveHitter", "SavePitcher",
            "ViewSavedHitter", "ViewSavedPitchers", "StackPop"};

    // Single dimensional array that represents hitters for testing
    private static Player[] hittersTwo = {
            new Hitter("Adley Rutschman", 101, 398),
            new Hitter("Gunner Henderson", 30, 116),
            new Hitter("Cedric Mullins ", 157, 608),
            new Hitter("Ryan Mountcastle", 139, 555)};

    // Single dimensional array that represents pitchers for testing
    private static Player[] pitchersOne = {
            new Pitcher("Dean Kramer", 45, 125.1),
            new Pitcher("Kyle Bradish", 64, 117.2),
            new Pitcher("Felix Bautista", 16, 65.2)};

    /** Text area for displaying text */
    TextArea taNumbers = new TextArea();

    @Override
    public void start(Stage stage) throws IOException {

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.setEditable(false);
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll(menuOne);
        comboBox.setPromptText("Make a Selection");
        comboBox.setItems(list);

        Button selectButton = new Button("Select");
        HBox hbox = new HBox();
        hbox.getChildren().add(selectButton);
        hbox.setAlignment(Pos.CENTER_LEFT);

        Label resultLabel = new Label(" Current Selection: None");
        VBox vbox = new VBox(hbox, resultLabel);
        vbox.setSpacing(40);

        // Creates a Borderpane for the comboBox and V box that hold the button and lable
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(50, 40, 20, 100));
        pane.setTop(comboBox);
        pane.setBottom(vbox);

        // displays the result of the comboBox in a label at the bottom of the pane
        comboBox.setOnAction(e -> {
            resultLabel.setText(" Current Selection: " + comboBox.getSelectionModel().getSelectedItem());
        });



        // select button action
        selectButton.setOnAction(e -> {
            String value = comboBox.getSelectionModel().getSelectedItem();
            if (Objects.equals(value, "Hitter")) {
                FxUtility.getYesNo("Sorting BY: ", "Do you want your players to be " +
                        "\nsorted by there batting AVG");
                TextArea battersArea = new TextArea(value);
                List<Player> playerArrayList = new ArrayList<Player>(Arrays.stream(hittersTwo).toList());
                SortUtility.mergeSort(playerArrayList.toArray(hittersTwo), new HitterAverageComparator());
                battersArea.appendText(Arrays.toString(hittersTwo));
                Scene scene = new Scene(battersArea);
                Stage stage1 = new Stage();
                stage1.setScene(scene);
                stage1.setWidth(400);
                stage1.setHeight(200);
                stage1.show();
            }
            else if (Objects.equals(value, "Pitcher")){
                FxUtility.getYesNo("Sorting BY: ", "Do you want your players to be " +
                        "\nsorted by there batting ERA");
                TextArea pitcherArea = new TextArea(value);
                List<Player> pitcherList = new ArrayList<Player>(Arrays.stream(pitchersOne).toList());
                SortUtility.mergeSort(pitcherList.toArray(pitchersOne), new ERAComparator());
                pitcherArea.appendText(Arrays.toString(pitchersOne));
                Scene scene = new Scene(pitcherArea);
                Stage stage1 = new Stage();
                stage1.setScene(scene);
                stage1.setWidth(400);
                stage1.setHeight(200);
                stage1.show();
            }
            else if (Objects.equals(value, "SaveHitter")){
                try(ObjectOutputStream outputStream = new ObjectOutputStream(
                        new BufferedOutputStream(new FileOutputStream("o.dat", true)))){
                    outputStream.write(hittersTwo.length);
                }
                catch (FileNotFoundException x){
                    x.printStackTrace();
                }
                catch (IOException xx){
                    System.out.println(" IO Error ");
                }
            }
            else if (Objects.equals(value, "SavePitcher")){
                try(ObjectOutputStream outputStream = new ObjectOutputStream(
                        new BufferedOutputStream(new FileOutputStream("o.dat", true)))){
                    outputStream.write(pitchersOne.length);
                }
                catch (FileNotFoundException x){
                    x.printStackTrace();
                }
                catch (IOException xx){
                    System.out.println(" IO Error ");
                }
            }
            else if (Objects.equals(value, "ViewSavedHitter")){
                try(ObjectInputStream inputStream = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream("o.dat")))){
                    taNumbers= new TextArea(value);
                    display(hittersTwo);
                    Scene scene = new Scene(taNumbers);
                    Stage stage1 = new Stage();
                    stage1.setScene(scene);
                    stage1.setWidth(400);
                    stage1.setHeight(200);
                    stage1.show();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else if (Objects.equals(value, "ViewSavedPitchers")){
                try(ObjectInputStream inputStream = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream("o.dat")))){
                    taNumbers= new TextArea(value);
                    display(pitchersOne);
                    Scene scene = new Scene(taNumbers);
                    Stage stage1 = new Stage();
                    stage1.setScene(scene);
                    stage1.setWidth(400);
                    stage1.setHeight(200);
                    stage1.show();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            else if (Objects.equals(value, "StackPop")){
                Stack<Player> hitters = new Stack<>();
                hitters.push(hittersTwo[0]);
                hitters.push(hittersTwo[1]);
                hitters.push(hittersTwo[2]);
                hitters.push(hittersTwo[3]);
                while (hitters.size() > 0){
                    hitters.pop();
                    taNumbers.appendText(hitters.toString());
                }
            }

        });


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 340, 200);
        stage.setTitle("Baseball++"); // Set the stage title
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }

    // method for displaying stats on a textArea
    private <E>void display(E[] a ){
        taNumbers.setText(null);
        for (E t : a) {
            taNumbers.appendText(t.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        launch();
    }
}