public interface Command {
    String getName();
    void execute() throws Exception; // Handle potential exceptions during execution
    boolean isAllowedForUser(String role); // Check if the command is allowed for a specific role
}
