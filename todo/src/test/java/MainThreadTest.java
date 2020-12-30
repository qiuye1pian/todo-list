import com.console.MockInput;
import com.console.MockOutput;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainThreadTest {

    private MockInput input;
    private MockOutput output;

    @Before
    public void prepare() {
        input = new MockInput();
        output = new MockOutput();
    }

    @Test
    public void test_exit() {
        //given
        input.appendInput("exit");
        //when
        MainThread.run(input, output);
        //then
        assertEquals("命令是exit\n", output.getResult());
    }

    @Test
    public void test_multi_input() {
        //given
        input.appendInput("1");
        input.appendInput("exit");
        MainThread.run(input, output);
        assertEquals("命令是1\n" +
                "命令是exit\n", output.getResult());
    }

}