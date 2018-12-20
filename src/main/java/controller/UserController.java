package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class UserController extends BaseController {
    @Resource
    UserService userService;

    @RequestMapping("/user/toLogin.action")
    public String toLogin() {
        return "/login.jsp";
    }

    @RequestMapping("/user/login.action")
    public String login(User user, Model model, HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", user.getUserName());
        map.put("password", user.getPassword());
        List<User> userList = userService.find(map);
        if (userList != null && userList.size() > 0) {
            request.getSession().setAttribute("user", userList.get(0));
            return "/home.jsp";
        }
        model.addAttribute("errorMsg", "登录失败。账号或密码错误");
        return "/login.jsp";
    }


    @RequestMapping("/user/registerPage.action")
    public String toRegister() {
        return "/register.jsp";
    }

    @RequestMapping("/user/register.action")
    public String register(User user, Model model, HttpServletRequest request, HttpServletResponse
            response) throws Exception
    {
        Map<String,String> map = new HashMap<String, String>();
        map.put("username",user.getUserName());
        List<User> userList = userService.find(map);
        if(userList!=null && userList.size()>0)
        {
            model.addAttribute("errorMsg","注册失败，用户名已使用");
            return "/register.jsp";
        }
        user.setUserId(UUID.randomUUID().toString());
        userService.insert(user);
        model.addAttribute("noticeMsg","注册成功,输入账号密码登陆");
        return "/login.jsp";


    }
}

















