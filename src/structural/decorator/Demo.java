package structural.decorator;

public class Demo {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        FileDataSource fileDataSource = new FileDataSource("out/OutputDemo.txt");
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        DataSourceDecorator encoded = new CompressionDecorator(encryptionDecorator);
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
