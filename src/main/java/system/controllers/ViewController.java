package system.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/")
public class ViewController {

    @RequestMapping(value = "/")
    public String index() {
        if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
            return "redirect:/userDevices";
        } else {
            return "redirect:login";
        }
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/registration")
    public String registration() {
        return "registration";
    }

    @RequestMapping(value = "/restorePassword")
    public String restorePassword() {
        return "restorePassword";
    }

    @RequestMapping(value = "/changePassword")
    public String changePassword() {
        return "changePassword";
    }

    @RequestMapping(value = "/autoActivation")
    public String autoActivation() {
        return "autoActivation";
    }

    @RequestMapping(value = "/cloudMasterAutoActivation")
    public String cloudMasterAutoActivation() {
        return "cloudMasterAutoActivation";
    }

    @RequestMapping(value = "/reActivation")
    public String reActivation() {
        return "reActivation";
    }

    @RequestMapping(value = "/userDevices")
    public String userDevices() {
        return "userDevices";
    }

    @RequestMapping(value = "/userPayments")
    public String userPayments() {
        return "userPayments";
    }

    @RequestMapping(value = "/userLogs")
    public String userLogs() {
        return "userLogs";
    }

    @RequestMapping(value = "/admin")
    public String admin() {
        return "admin";
    }

    @RequestMapping(value = "/support")
    public String support() {
        return "support";
    }

    @RequestMapping(value = "/partner")
    public String partner() {
        return "partner";
    }

    @RequestMapping(value = "/agent")
    public String agent() {
        return "agent";
    }

    @RequestMapping(value = "/chargeIn")
    public String chargeIn() {
        return "chargeIn";
    }

    @RequestMapping(value = "/owner")
    public String owner() {
        return "owner";
    }

    @RequestMapping(value = "/bookkeeper")
    public String bookkeeper() {
        return "bookkeeper";
    }

    @RequestMapping(value = "/videoTest")
    public String videoTest() {
        return "videoTest";
    }
    
    @RequestMapping(value = "/403")
    public String accessDenied() {
        if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()) {
            return "redirect:userDevices";
        }
        return "403";
    }

    @RequestMapping(value = "/404")
    public String notFound() {
            return "redirect:userDevices";
    }

}
