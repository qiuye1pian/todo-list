package command;

public class AddItem extends CommandBase {

    private String itemText;

    AddItem(String text) {
        super("add");
        this.itemText = text;
    }

    @Override
    public void doAction() {

    }

    String getItemText(){
        return this.itemText;
    }
}
