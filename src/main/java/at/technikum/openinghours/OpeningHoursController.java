package at.technikum.openinghours;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.util.LinkedHashMap;

@RestController

public class OpeningHoursController {

    LinkedHashMap<String, String> currentHours = new LinkedHashMap();


    @RequestMapping("/hours")
    public LinkedHashMap<String, String> getCurrentHours(){
        if (currentHours.isEmpty())
        {
            setDefaultHours();
        }
        return currentHours;
    }

    @RequestMapping("/hours/reset")
    public RedirectView setDefaultHours(){
        currentHours.put("Mo", "09:00 - 17:00");
        currentHours.put("Tu", "closed");
        currentHours.put("We", "09:00 - 17:00");
        currentHours.put("Th", "09:00 - 17:00");
        currentHours.put("Fr", "08:00 - 19:00");
        currentHours.put("Sa", "08:00 - 19:00");
        currentHours.put("So", "08:00 - 19:00");

        return new RedirectView("/hours");
    }

}
