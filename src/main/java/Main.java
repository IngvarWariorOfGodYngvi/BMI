import picocli.CommandLine;

public class Main {
    public static void main(String[] args) {
        CommandLineApp picocli = new CommandLineApp();
        new CommandLine(picocli).parse(args);
        picocli.run();    }
}
