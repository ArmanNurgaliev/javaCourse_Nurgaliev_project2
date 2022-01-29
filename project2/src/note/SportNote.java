package note;

import user.User;

public class SportNote extends Note implements Mutable{

    public SportNote(String name, String body, User author) {
        super(name, body, author);
    }


}
