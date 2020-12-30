package command;

public abstract class CommandBase {
    String action;

    public CommandBase(String action) {
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }

    public abstract void doAction();
}
