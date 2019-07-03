package cashregister;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CashRegisterTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
        Item item = new Item("Cola", 1.0);
        Purchase purchase = new Purchase(new Item[]{item});
        CashRegister register = new CashRegister(new MockPrinter());
        //when
        register.process(purchase);
        //then
        Assertions.assertEquals("Cola\t1.0\n\n", outContent.toString());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
        //when
        //then
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        //when
        //then
    }

}
