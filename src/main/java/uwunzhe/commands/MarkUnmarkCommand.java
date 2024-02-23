package uwunzhe.commands;

import uwunzhe.util.TaskList;
import uwunzhe.handler.Storage;
import uwunzhe.exceptions.UwunzheException;

public class MarkUnmarkCommand extends Command {
    /**
     * Constructor for MarkCommand.
     * 
     * @param commandString The command from the user.
     * @param taskString The string appended to the command to be executed.
     */
    public MarkUnmarkCommand(String commandString, String taskString) {
        super(commandString, taskString);
    }

    /**
     * Marks the task as done.
     * 
     * @param taskList The list of tasks.
     * @param storage The storage handler.
     * @throws UwunzheException If the task does not exist or input is invalid.
     */
    public void execute(TaskList taskList, Storage storage)
            throws UwunzheException {
        taskList.setItemStatus(this.commandString, this.taskString);
        storage.saveData(taskList);
    }
}
