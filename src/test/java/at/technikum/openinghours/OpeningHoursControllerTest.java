package at.technikum.openinghours;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class OpeningHoursControllerTest {

    @Test
    public void currentHoursNotNull() {
        LinkedHashMap<String, String> currentHours = new LinkedHashMap();
        currentHours.put("Mo", "09:00 - 17:00");
        Assert.assertNotNull(currentHours);
    }

}