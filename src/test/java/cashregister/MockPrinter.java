package cashregister;

public class MockPrinter extends Printer {

    @Override
    public void print(String printThis) {
        System.out.println(printThis);
        ;
    }
}
