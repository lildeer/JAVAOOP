package DZ5.Models;

import java.util.LinkedList;

public class UsersList {
    LinkedList<User> users = new LinkedList<>();
    int currentUser;

    public void save(String[] args){
        users.add(new User(args[0], args[1], args[2]));
    };

    public boolean contains(User user){
        return users.contains(user);
    };


}
