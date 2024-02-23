package uwunzhe.commands;

import uwunzhe.util.TaskList;
import uwunzhe.handler.Storage;
import uwunzhe.exceptions.UwunzheException;

public class DeleteCommand extends Command {
    /**
     * Constructor for DeleteCommand.
     * 
     * @param commandString The command from the user.
     * @param taskString The string appended to the command to be executed.
     */
    public DeleteCommand(String commandString, String taskString) {
        super(commandString, taskString);
    }

    /**
     * Deletes a task from the list.
     * 
     * @param taskList The list of tasks.
     * @param storage The storage handler.
     * @throws UwunzheException If the task does not exist.
     */
    public void execute(TaskList taskList, Storage storage)
            throws UwunzheException {
        taskList.deleteItem(this.taskString);
        storage.saveData(taskList);
    }
}
