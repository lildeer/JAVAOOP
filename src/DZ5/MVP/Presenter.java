package DZ5.MVP;

public class Presenter {
    protected Model model;
    private UserView view;

    public Presenter(Model model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        boolean keep = true;
        String temp;
        while (keep) {
            temp = view.askNewAcc();
            if (temp.equals("stop")) {
                break;
            } else if (temp.equals("y")) {
                model.add(view.register());
            } else if (model.load(view.enter())) {
                view.successfulEnter();
            } else {
                view.failedEnter();
            }
        }
    }
}
