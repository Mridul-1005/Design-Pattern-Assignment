public class RmCommand extends AbstractCommand {

    private final String filename;

    public RmCommand(String filename) {
        super("rm");
        this.filename = filename;
    }

    @Override
    public void execute() throws Exception {

        if (filename.endsWith("-rf")) {
            throw new UnauthorizedOperationException("rm -rf is not allowed!");
        }

    }

    @Override
    public boolean isAllowedForUser(String role) {
        return role.equals("admin");
    }
}