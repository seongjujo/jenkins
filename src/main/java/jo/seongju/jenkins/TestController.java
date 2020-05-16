package jo.seongju.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Seongju Jo. On 2020-05-16 21:28:11
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test() {

        return "hello world";
    }
}
