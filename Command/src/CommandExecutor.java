import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {

    private final Map<String, Command> commands;

    public CommandExecutor() {
        commands = new HashMap<>();

    }

    public void executeCommand(String role, String commandName) throws Exception {
        Command command = commands.get(commandName);
        if (command != null) {
            if (command.isAllowedForUser(role)) {
                command.execute();
            } else {
                throw new UnauthorizedOperationException("Unauthorized access to command: " + commandName);
            }
        } else {
            System.out.println("Invalid command!");
        }
    }
}
