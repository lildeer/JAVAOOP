package DZ5.MVP;

import DZ5.Models.User;
import DZ5.Models.UsersList;

public class Model {

    UsersList userMod;

    public Model() {
        userMod = new UsersList();
    }

    public void add(String[] args) {
        //String[] args = line.split(" ");
        userMod.save(args);
    }


    public boolean load(String line) {
        String[] args = line.split(" ");
        return userMod.contains(new User(args[0], args[1]));
    }
}
