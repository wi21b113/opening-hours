package at.technikum.openinghours;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpeningHoursController {


    @RequestMapping("/hours")
    public String getCurrentHours(){
        return "";
    }
}
