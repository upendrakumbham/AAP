package uk.ac.ebi.tsi.rest.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ukumbham on 25/05/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UserRestControllerTest {
    @Test
    public void getUser() throws Exception {
        Assert.assertEquals("Upendra","");
    }

}