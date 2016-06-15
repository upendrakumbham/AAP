package uk.ac.ebi.tsi.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.ebi.tsi.aap.authorisation.service.UserService;
import uk.ac.ebi.tsi.aap.authorisation.service.UserServiceImpl;

/**
 * Created by ukumbham on 25/05/2016.
 */
@RestController

public class UserRestController {


     UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/user")
    public String getUser(){
        return userService.getUser();
    }
}
