package person;

import java.awt.*;

public enum Season {
    WINTER(Color.WHITE, "White"),
    SPRING(Color.YELLOW, "Yellow"),
    SUMMER(Color.GREEN, "Green"),
    AUTUMN(Color.ORANGE, "Orange");

    private Color color;
    private String colorName;

    Season(Color color, String colorName) {
        this.color = color;
        this.colorName = colorName;
    }

    public Color getColor() {
        return color;
    }

    public String getColorName() { return colorName; }
}
