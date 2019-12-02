package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by Сергей on 01.12.2019.
 */
public class PlayGameWindowTwo {

    public void display(Stage primaryStage, Scene scenePGW, Player playerPlay, List<Hero> heroes, int n) {

        primaryStage.setTitle("Game"); //fff
        primaryStage.setResizable(true);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setScene(scene);

        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10));
        gridpane.setHgap(44);
        gridpane.setVgap(5);

        for (int i = 0; i < 3; i++) {
            ColumnConstraints column = new ColumnConstraints();
            column.setPercentWidth(300);
            gridpane.getColumnConstraints().add(column);
        }

        for (int i = 0; i < 9; i++) {
            RowConstraints row = new RowConstraints();
            row.setPercentHeight(25);
            gridpane.getRowConstraints().add(row);
        }

        Label textLabel = new Label("                       Игра загадала персонажа!");
        gridpane.add(textLabel, 1, 0);
        textLabel.setPrefSize(300, 25);

        Label userNameLabel = new Label("Игрок: " + playerPlay.getName());
        gridpane.add(userNameLabel, 0, 8);
        userNameLabel.setPrefSize(300, 25);

        Label totalLabel = new Label("Кол-во очков: " + Double.toString(playerPlay.getTotal()));
        gridpane.add(totalLabel, 2, 8);
        totalLabel.setPrefSize(300, 25);

        Button heroButton = new Button("Меню");
        heroButton.setPrefSize(400, 50);
        gridpane.add(heroButton, 1, 4);

        Button getHelpButton = new Button("Получить подсказку");
        getHelpButton.setPrefSize(400, 50);
        gridpane.add(getHelpButton, 1, 5);

        Button setAnswer = new Button("Дать ответ");
        setAnswer.setPrefSize(400, 50);
        gridpane.add(setAnswer, 1, 6);

        Button backButton = new Button("Назад");
        backButton.setPrefSize(400, 50);
        gridpane.add(backButton, 1, 7);

        getHelpButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                ListIterator<Hero> heroListIterator = heroes.listIterator();
                Hero hero = new Hero();
                Random random = new Random();
                int m = random.nextInt(10);
                int j = n * 10;
                int k = 0;
                while (k < j + m + 1) {
                    hero = heroListIterator.next();
                    k++;
                }

                TextField password2Field = new TextField(hero.getSetting());
                gridpane.add(password2Field, 1, 2);

               /* Label helpLabel = new Label();
                gridpane.add(helpLabel, 1, 2);
                helpLabel.setPrefSize(300, 25);*/

            }
        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.setScene(scenePGW);
            }
        });

        root.setCenter(gridpane);
    }
}
