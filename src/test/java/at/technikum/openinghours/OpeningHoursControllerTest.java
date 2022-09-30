package at.technikum.openinghours;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class OpeningHoursControllerTest {

    @Test
    public void currentHoursNotNull() {
        LinkedHashMap<String, String> currentHours = new LinkedHashMap();
        currentHours.put("Mo", "09:00 - 17:00");
        Assert.assertNotNull(currentHours);
    }

    @Test
    public void defaultHoursCorrect(){
        LinkedHashMap<String, String> defaultHours = new LinkedHashMap();
        defaultHours.put("Mo", "09:00 - 17:00");
        defaultHours.put("Tu", "closed");
        defaultHours.put("We", "09:00 - 17:00");
        defaultHours.put("Th", "09:00 - 17:00");
        defaultHours.put("Fr", "08:00 - 19:00");
        defaultHours.put("Sa", "08:00 - 19:00");
        defaultHours.put("So", "08:00 - 19:00");

        OpeningHoursController os = new OpeningHoursController();
        os.setDefaultHours();
        Assert.assertEquals(os.currentHours,defaultHours);
    }



}