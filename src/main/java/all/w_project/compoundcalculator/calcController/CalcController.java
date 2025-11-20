package all.w_project.compoundcalculator.calcController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping()
    public String Home(){
        return "Test";
    }
}
