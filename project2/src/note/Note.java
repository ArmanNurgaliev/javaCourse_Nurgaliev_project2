package note;

import user.User;

public abstract class Note<T> implements Showable, Mutable{
    private String name;
    private String body;
    private User author;
    private T noteInfo;

    public Note(String name, String body, User author, T noteInfo) {
        this.name = name;
        this.body = body;
        this.author = author;
        this.noteInfo = noteInfo;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public User getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
