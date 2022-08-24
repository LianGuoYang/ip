import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {

    private LocalDateTime byTime;

    public Deadline (TaskType type, String name, boolean isMarked, String timeStr) {
        super(type, name, isMarked);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm, d/MM/yyyy");
        LocalDateTime time = LocalDateTime.parse(timeStr, formatter);
        this.byTime = time;
    }

    public LocalDateTime getByTime() {
        return this.byTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, EEE, d MMM yyyy");
        return "[D]" + super.toString()
                + " (by: " + byTime.format(formatter) + ")";
    }
}

