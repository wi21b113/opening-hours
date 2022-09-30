package at.technikum.openinghours;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.LinkedHashMap;

@RestController

public class OpeningHoursController {

    LinkedHashMap<String, String> currentHours = new LinkedHashMap();


    @RequestMapping("/hours")
    public LinkedHashMap<String, String> getCurrentHours(){
        return currentHours;
    }
}
