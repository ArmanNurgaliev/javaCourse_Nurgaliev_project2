package note;

import user.User;

public class PoliticalNote extends Note implements Mutable{

    public PoliticalNote(String name, String body, User author) {
        super(name, body, author);
    }

}
