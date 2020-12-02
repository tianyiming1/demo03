package AnnoExa_Two;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Hello {
    
    @RequestMapping(value = "hello")
    public User hello(@Valid User user){
        return user;
    }
}