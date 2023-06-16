package DZ5.Crew;

import DZ5.MVP.*;

public class Program {
    public static void main(String[] args) {
        Presenter pres = new Presenter(new Model(), new UserView());
        pres.start();
    }
}
