import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReadTextFile {
    private Scanner input;

    // permite ao usuário abrir o arquivo
    public void openFile() {
        try {
            input = new Scanner(new File("clients.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    // lê o registro no arquivo
    public void readRecords() {
        AccountRecord record = new AccountRecord();
        System.out.printf("%-10s %-12s %-12s %10s\n", "Account", "First Name", "Last Name", "Balance");
        try {
            while (input.hasNext()) {
                record.setAccount(input.nextInt());
                record.setFirstName(input.next());
                record.setLastName(input.next());
                record.setBalance(input.nextDouble());
                System.out.printf("%-10d %-12s %-12s %10.2f\n",
                        record.getAccount(), record.getFirstName(), record.getLastName(), record.getBalance());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file.");
            System.exit(1);
        }
    }

    // fecha o arquivo e termina o aplicativo
    public void closeFile() {
        if (input != null)
            input.close();
    }
}
