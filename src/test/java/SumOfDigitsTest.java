import org.example.SumOfDigits;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void Test1() {
        assertEquals( "Nope!" , 7, SumOfDigits.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 6, SumOfDigits.digital_root(456));
    }

    // these test failed on the website
    @Test
    public void Test3() {
        assertEquals( "Nope!" , 1, SumOfDigits.digital_root(6967));
    }

    @Test
    public void Test4() {
        assertEquals( "Nope!" , 3, SumOfDigits.digital_root(985098));
    }

}
