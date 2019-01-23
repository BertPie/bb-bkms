package pie.bert.bbbkms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pie.bert.bbbkms.service.DemoService;

@Slf4j
@Controller
public class DemoController {
    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("demo")
    public String demo(Model model) {
        log.info("Entered demo method");
        model.addAttribute("message", demoService.getMessage());
        return "demo/demo";
    }
}