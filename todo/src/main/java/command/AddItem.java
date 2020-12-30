package command;

public class AddItem extends CommandBase {

    private String itemText;

    public AddItem(String text) {
        super("add");
        this.itemText = text;
    }

    @Override
    public void doAction() {

    }

    public String getItemText(){
        return this.itemText;
    }
}
