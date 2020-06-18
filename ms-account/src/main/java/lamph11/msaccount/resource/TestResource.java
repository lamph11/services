package lamph11.msaccount.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestResource {


    @PostMapping
    public ResponseEntity<String> test(){
        System.out.println("da vao day");
        return ResponseEntity.ok("Hello from account service");
    }
}
