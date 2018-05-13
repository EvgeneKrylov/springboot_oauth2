package ru.evgenekrylov;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthRestController {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }

}
