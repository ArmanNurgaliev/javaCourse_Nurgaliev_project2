import note.EconomicsNote;
import note.EmptyNameException;
import note.Note;
import note.SportNote;
import user.Role;
import user.User;

import java.util.*;

public class Main {
    public static Map<String, User> users = new HashMap<>();
    public static Map<String, Note> notes = new HashMap<>();

    public static void main(String[] args) throws EmptyNameException {
        // Initializing of users
        User admin = new User("admin", "adminpass", Role.ADMIN);
        User moderator = new User("moderator", "moderatorpass", Role.MODERATOR);
        User user = new User("user", "userpass", Role.USER);
        users.put("admin", admin);
        users.put("moderator", moderator);
        users.put("user", user);

        Scanner sc = new Scanner(System.in);
        User currentUser = null;
        while (true) {
            System.out.println("Select an action:");
            System.out.println("1. Log in");
            System.out.println("0. Exit");
            int action = sc.nextInt();
            if (action == 1) {
                currentUser = authorization(sc, false);
                System.out.println("Welcome " + currentUser.getLogin());
            }
            if (action == 0) break;

            while (currentUser != null) {
                System.out.println("Select an action:");
                System.out.println("1. Log out");
                System.out.println("2. Show notes");
                System.out.println("3. Create new note");
                System.out.println("4. Search note by name");
                System.out.println("0. Exit");
                action = sc.nextInt();

                if (action == 1)
                    break;
                if (action == 2) {
                    for (String note : notes.keySet())
                        System.out.println(notes.get(note).getName());
                }
                if (action == 3) {
                    boolean change = createNewNote(sc, currentUser);
                    if (!change) {
                        System.out.println("You do not have permission to create note");
                    }
                    for (String note : notes.keySet())
                        System.out.println(note);
                }
                if (action == 4) {
                    searchNoteByName(sc, currentUser);
                }
                if (action == 0) break;
            }
        }
    }

    private static void searchNoteByName(Scanner sc, User currentUser) {
        System.out.println("Write a name of the note");
        String name = sc.nextLine();
        sc.nextLine();
        Note note = null;
        if (notes.containsKey(name)) {
            note = notes.get(name);
            note.show();
        } else {
            System.out.println("No note with name " + name);
            return;
        }
        System.out.println("Select an action with note");
        System.out.println("1. Change a name");
        System.out.println("2. Change a word");
        System.out.println("3. Change a content of note");
        System.out.println("4. See author");
        System.out.println("4. Delete note");
        int todo = sc.nextInt();
        if (todo == 1) {
            String newName = sc.nextLine();
            sc.nextLine();
            boolean permission = note.changeName(currentUser.getRole(), note, newName);
            if (!permission) System.out.println("You do not have permission");
        }
        if (todo == 2) {
            System.out.println("Write a word to change");
            String oldWord = sc.next();
            System.out.println("Write new word");
            String newWord = sc.next();
            boolean permission = note.changeWord(currentUser.getRole(), note, oldWord, newWord);
            if (!permission) System.out.println("You do not have permission");
        }
        if (todo == 3) {
            String content = sc.nextLine();
            sc.nextLine();
            boolean permission = note.changeBody(currentUser.getRole(), note, content);
            if (!permission) System.out.println("You do not have permission");
        }
        if (todo == 4)
            System.out.println(note.getAuthor());
        if (todo == 5) {
            if (currentUser.getRole().equalsRole("admin") || currentUser.getRole().equalsRole("moderator")) {
                notes.remove(note);
            }
            else
                System.out.println("You do not have permission");
        }
    }

    private static boolean createNewNote(Scanner sc, User currentUser) throws EmptyNameException {
        if (currentUser.getRole().equalsRole("admin") || currentUser.getRole().equalsRole("moderator")) {
            System.out.println("Write name of note");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Write text of note");
            String body = sc.nextLine();
            if (name == null || name.length() == 0)
                throw new EmptyNameException("Name of note can not be empty");
      //      sc.nextLine();
            Note note = null;
            System.out.printf("Select note type:\n%d. Sport note\n%d. Economic note\n", 1, 2);
            int type = sc.nextInt();
            if (type == 1) {
                System.out.println("Write score (ex. 2:1)");
                String score = sc.next();
                note = new SportNote(name, body, currentUser, score);
            }
            if (type == 2) {
                System.out.println("Write exchange rate (ex. 72)");
                String exchangeRate = sc.next();
                note = new EconomicsNote(name, body, currentUser, Double.parseDouble(exchangeRate));
            }
            notes.put(name, note);
            return true;
        }
        return false;
    }


    private static User authorization(Scanner sc, boolean authorized) {
        while (!authorized) {
            System.out.println("Please enter your login:");
            String login = sc.next();
            while (!users.containsKey(login)) {
                System.out.println("No user with this login, lease enter your login again:");
                login = sc.next();
            }

            System.out.println("Please enter password:");
            String password = sc.next();

            if (!users.get(login).getPassword().equals(password)) {
                System.out.println("Wrong password");
                continue;
            }
            authorized = true;
            return users.get(login);
        }
        return null;
    }
}

