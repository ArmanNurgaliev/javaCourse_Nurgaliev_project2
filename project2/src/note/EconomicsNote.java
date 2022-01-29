package note;

import user.User;

public class EconomicsNote extends Note implements Mutable{
    public EconomicsNote(String name, String body, User author) {
        super(name, body, author);
    }

}
