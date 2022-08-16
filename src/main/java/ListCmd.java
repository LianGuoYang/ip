public class ListCmd extends Command {

    public ListCmd (String cmd) {
        super(cmd);
    }

    @Override
    public void execute (String str, Task[] tasks) throws DukeException {
        System.out.println("Your List:");
        for (int i = 0; i < tasks.length; i ++) {
            if (tasks[i] == null) {
                break;
            }
            int index = i + 1;
            System.out.println(index + "." + tasks[i].toString());
        }
    }
}
