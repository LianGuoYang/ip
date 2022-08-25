package duke.command;

import duke.TaskList;
import duke.Ui;
import duke.task.Task;

/**
 * Command to unmark task as done.
 */
public class UnmarkCommand extends Command {

    private int num;

    /**
     * Constructor for UnmarkCommand
     *
     * @param info Type of command
     * @param num Index of task
     */
    public UnmarkCommand(String info, int num) {
        super(info);
        this.num = num;
    }

    /**
     * @return Index of task
     */
    public int getNum() {
        return num;
    }

    /**
     * Execute the unmark operation by changing
     * boolean isMarked of task at index num to false.
     *
     * @param ui Ui to show unmark operation messages
     * @param taskList TaskList to execute unmark command
     */
    @Override
    public void execute(Ui ui, TaskList taskList) {
        Task task = taskList.getTask(num);
        task.setUnmarked();
        ui.showUnmarkMessage(task);
    }
}
