import com.console.MockInput;
import com.console.MockOutput;
import com.repository.MockRepository;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainThreadTest {

    private MockInput input;
    private MockOutput output;
    private MockRepository mockRepository;

    @Before
    public void prepare() {
        input = new MockInput();
        output = new MockOutput();
        mockRepository = new MockRepository();
    }

    @Test
    public void test_exit() {
        //given
        input.appendInput("exit");
        //when
        MainThread.run(mockRepository, input, output);
        //then
        assertEquals("\r\n", output.getResult());
    }

    @Test
    public void test_multi_input() {
        //given
        input.appendInput("todo add <item>");
        input.appendInput("exit");
        MainThread.run(mockRepository, input, output);
        assertEquals("1. <item>\r\n" +
                        "\r\n" +
                        "Item <1> added\r\n\r\n",
                output.getResult());
    }

    @Test
    public void test_done_item() {
        input.appendInput("todo add <item>");
        input.appendInput("todo done <1>");
        input.appendInput("exit");
        MainThread.run(mockRepository, input, output);
        assertEquals("1. <item>\r\n" +
                        "\r\n" +
                        "Item <1> added\r\n" +
                        "Item <1> done.\r\n\r\n",
                output.getResult());
    }

    @Test
    public void test_listing_item_show_ongoing_item_default() {
        input.appendInput("todo add <item1>");
        input.appendInput("todo add <item2>");
        input.appendInput("todo add <item3>");
        input.appendInput("todo done <3>");
        input.appendInput("todo list");
        input.appendInput("exit");
        MainThread.run(mockRepository, input, output);
        assertEquals("1. <item1>\r\n" +
                        "\r\n" +
                        "Item <1> added\r\n" +
                        "2. <item2>\r\n" +
                        "\r\n" +
                        "Item <2> added\r\n" +
                        "3. <item3>\r\n" +
                        "\r\n" +
                        "Item <3> added\r\n" +
                        "Item <3> done.\r\n" +
                        "1. <item1>\r\n" +
                        "2. <item2>\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "Total: 2 items\r\n\r\n",
                output.getResult());
    }

    @Test
    public void test_listing_item_show_all() {
        input.appendInput("todo add <item1>");
        input.appendInput("todo add <item2>");
        input.appendInput("todo add <item3>");
        input.appendInput("todo done <3>");
        input.appendInput("todo list --all");
        input.appendInput("exit");
        MainThread.run(mockRepository, input, output);
        assertEquals("1. <item1>\r\n" +
                        "\r\n" +
                        "Item <1> added\r\n" +
                        "2. <item2>\r\n" +
                        "\r\n" +
                        "Item <2> added\r\n" +
                        "3. <item3>\r\n" +
                        "\r\n" +
                        "Item <3> added\r\n" +
                        "Item <3> done.\r\n" +
                        "1. <item1>\r\n" +
                        "2. <item2>\r\n" +
                        "3. [Done] <item3>\r\n" +
                        "\r\n" +
                        "\r\n" +
                        "Total: 3 items, 1 item done\r\n\r\n",
                output.getResult());
    }


    @Test
    public void test_unknow_item() {
        input.appendInput("1");
        input.appendInput("exit");
        MainThread.run(mockRepository, input, output);
        assertEquals("Unknown command\r\n\r\n",
                output.getResult());
    }
}