package note;

import user.Role;

public interface Mutable {
    public default void changeName(Role userRole, Note note, String newName) {
        if (userRole.equalsRole("admin") || userRole.equalsRole("moderator")) {
            note.setName(newName);
        }
    }

    public default void changeWord(Role userRole, Note note, String oldWord, String newWord) {
        if (userRole.equalsRole("admin") || userRole.equalsRole("moderator")) {
            String body = note.getBody();
            String[] s = body.split("\\s+");
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals(oldWord)) {
                    s[i] = newWord;
                    break;
                }
            }
            note.setBody(String.join(" ", s));
        }
    }

    public default void changeBody(Role userRole, Note note, String newBody) {
        if (userRole.equalsRole("admin") || userRole.equalsRole("moderator")) {
            note.setBody(newBody);
        }
    }


}
