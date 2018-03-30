package com.penguinpi.liferecorderbackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mengnan Shi
 * @create 2018-03-30-01:39
 */

@Controller
public class TempController {

    @RequestMapping(value = "/temp")
    public String index() {
        return "temp";
    }
}
