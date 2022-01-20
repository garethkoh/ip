public class Deadline extends Task
{
    private String dueDate;

    public Deadline(String name, String dueDate)
    {
        super(name);
        this.dueDate = dueDate;
    }

    @Override
    public String toString()
    {
        if (super.getStatus() == 1) {
            return "[D][X] " + super.getName() + " (by: " + dueDate + ")\n";
        } else {
            return "[D][ ] " + super.getName() + " (by: " + dueDate + ")\n";
        }
    }
}
