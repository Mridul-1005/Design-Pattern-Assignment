import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        CommandExecutor executor = new CommandExecutor();

        String role = getUserRole();
        String command = getCommandInput();

        executor.executeCommand(role, command);
    }

    private static String getCommandInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your command: ");
        return scanner.nextLine();
    }

    public static String getUserRole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role (admin/normal_user): ");
        return scanner.nextLine();
    }
}
