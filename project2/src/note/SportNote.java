package note;

import user.User;

public class SportNote extends Note implements Mutable, Showable{
    private String score;
    public SportNote(String name, String body, User author, String score) {
        super(name, body, author, score);
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }


    @Override
    public void show() {
        System.out.println(this.getName());
        System.out.println(this.getBody());
        System.out.println("Exchange rate of dollar: " + this.getScore());
        System.out.println("Author: " + this.getAuthor());
    }
}
