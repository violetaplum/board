package sangdam.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value="/login.do",method= RequestMethod.GET)
    public String response(Model model, HttpServletRequest req)
    {
        String id = req.getParameter("name");
        String pw = req.getParameter("pw");
        model.addAttribute("mid",id);
        model.addAttribute("mpw",pw);
        return "loginResult";
    }
}
