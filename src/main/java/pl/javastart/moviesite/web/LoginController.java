package pl.javastart.moviesite.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getFormLogin() {
        return "login-form";
    }

}
