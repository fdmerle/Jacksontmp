import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;


public enum DeviceScheduleFormat {
    Weekday,
    EvenOdd,
    Interval;

    private static Map<String, DeviceScheduleFormat> namesMap = new HashMap<String, DeviceScheduleFormat>(3);

    static {
        namesMap.put("weekday", Weekday);
        namesMap.put("even-odd", EvenOdd);
        namesMap.put("interval", Interval);
    }

    @JsonCreator
    public static DeviceScheduleFormat forValue(String value) {
        return namesMap.get(StringUtils.lowerCase(value));
    }

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, DeviceScheduleFormat> entry : namesMap.entrySet()) {
            if (entry.getValue() == this)
                return entry.getKey();
        }

        return null;
    }
}

