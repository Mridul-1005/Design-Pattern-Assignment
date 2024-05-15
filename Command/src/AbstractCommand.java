public abstract class AbstractCommand implements Command {

    private final String name;

    public AbstractCommand(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract void execute() throws Exception;

    @Override
    public abstract boolean isAllowedForUser(String role);
}
