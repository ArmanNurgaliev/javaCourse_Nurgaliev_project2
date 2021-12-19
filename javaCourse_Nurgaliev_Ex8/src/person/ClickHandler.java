package person;

public interface ClickHandler {
    default void printColor(Season season) {
        System.out.println("Сейчас " + season.name() + ". " + season.getColorName());
    }
}
