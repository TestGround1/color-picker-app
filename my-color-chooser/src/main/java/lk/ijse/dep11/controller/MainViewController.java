package lk.ijse.dep11.controller;

import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

public class MainViewController {
    public AnchorPane root;
    public Slider slrRed;
    public TextField txtRed;
    public Slider slrGreen;
    public TextField txtGreen;
    public Slider slrBlue;
    public TextField txtBlue;
    public Slider slrAlpha;
    public TextField txtAlpha;
    public TextField txtRgb;
    public Circle shpCircle;

    public void initialize() {
        slrRed.valueProperty().addListener(e -> {
            txtRed.setText(String.format("%.0f", slrRed.getValue()));
            updateColor();
        });
        slrGreen.valueProperty().addListener(e -> {
            txtGreen.setText(String.format("%.0f", slrGreen.getValue()));
            updateColor();
        });
        slrBlue.valueProperty().addListener(e -> {
            txtBlue.setText(String.format("%.0f", slrBlue.getValue()));
            updateColor();
        });
        slrAlpha.valueProperty().addListener(e -> {
            txtAlpha.setText(String.format("%.1f", slrAlpha.getValue()));
            updateColor();
        });
    }
    public void updateColor(){
        int red = Integer.parseInt(txtRed.getText());
        int green = Integer.parseInt(txtGreen.getText());
        int blue = Integer.parseInt(txtBlue.getText());
        double alpha = Double.parseDouble(txtAlpha.getText());
        Color color = Color.rgb(red, green, blue, alpha);
        shpCircle.setFill(color);
        txtRgb.setText("#" + color.toString().substring(2).toUpperCase());
    }
}
