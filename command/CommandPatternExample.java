/**
   Author: Turkdogan Tasdelen
   Email: ttasdelen@gmail.com
*/
public class CommandPatternExample {

    public static void main(String []args) {
        MyFile file = new MyFile();
        Command openCommand = new OpenCommand(file);
        openCommand.execute();
        Command writeCommand = new WriteCommand(file);
        writeCommand.execute();
        Command printCommand = new PrintCommand(file);
        printCommand.execute();
        Command closeCommand = new CloseCommand(file);
        closeCommand.execute();
    }
}

class MyFile {

    public void open() {
        System.out.println("Open...");
    }

    public void write() {
        System.out.println("Write...");
    }

    public void close() {
        System.out.println("Close...");
    }

    public void print() {
        System.out.println("Print...");
    }
}

interface Command {
    void execute();
}

class OpenCommand implements Command {

    private MyFile file;

    public OpenCommand(MyFile file) {
        this.file = file;
    }

    public void execute() {
        file.open();
    }
}

class WriteCommand implements Command {

    private MyFile file;

    public WriteCommand(MyFile file) {
        this.file = file;
    }

    public void execute() {
        file.write();
    }
}

class PrintCommand implements Command {

    private MyFile file;

    public PrintCommand(MyFile file) {
        this.file = file;
    }

    public void execute() {
        file.print();
    }
}

class CloseCommand implements Command {

    private MyFile file;

    public CloseCommand(MyFile file) {
        this.file = file;
    }

    public void execute() {
        file.close();
    }
}
