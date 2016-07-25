import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestDays {
    DeviceScheduleFormat tmpJson;
@Test
    public void TestDays() {
        tmpJson = DeviceScheduleFormat.Weekday;
        ObjectMapper mapper = new ObjectMapper();

        try {
            String tmpStr = mapper.writeValueAsString(tmpJson);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
