package dev.badiale.dynamiclinkserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "link")
public class DynamicLinkController {
    @Autowired
    private DynamicLinkService dynamicLinkService;

    @GetMapping
    public String getLink(
            @RequestParam(name = "parameter1") String parameter1,
            @RequestParam(name = "parameter2") String parameter2) {
        return dynamicLinkService.createLink(parameter1, parameter2);
    }
}
