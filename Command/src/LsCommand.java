public class LsCommand extends AbstractCommand {

    public LsCommand() {
        super("ls");
    }

    @Override
    public void execute() throws Exception {

    }

    @Override
    public boolean isAllowedForUser(String role) {
        return true;
    }
}