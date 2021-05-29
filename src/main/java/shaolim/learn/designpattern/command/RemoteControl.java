package shaolim.learn.designpattern.command;

public class RemoteControl {
    static private final int slots = 8;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[slots];
        offCommands = new Command[slots];
        Command noCommand = new NoCommand();
        for (int i = 0; i < slots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        Command command = onCommands[slot];
        command.execute();
        undoCommand = command;
    }

    public void offButtonWasPressed(int slot) {
        Command command = offCommands[slot];
        command.execute();
        undoCommand = command;
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < slots; i++) {
            stringBuilder.append("[Slot " + i + "] " + onCommands[i].getClass().getSimpleName() +
                    "\t\t\t\t" + offCommands[i].getClass().getSimpleName() + "\n");
        }
        stringBuilder.append("[undo] " + undoCommand.getClass().getSimpleName());
        return stringBuilder.toString();
    }
}
