package com.liam.webhook;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WebhookController {

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public boolean hook(HttpServletRequest request) throws IOException {
        String str = IOUtils.toString(request.getInputStream(), "UTF-8");
        log.info("===============get-hook========{}", str);
        return true;
    }

}
