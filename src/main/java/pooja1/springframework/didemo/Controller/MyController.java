package pooja1.springframework.didemo.Controller;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String  hello() {
        System.out.println("Hello!");
        return "foo";
    }



}
