package com.sh.hiboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sh
 * @since 2025/06/05
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "hi-boot";
    }
}
