package ltd.newbee.mall.controller.mall;

import ltd.newbee.mall.entity.HelpMsg;
import ltd.newbee.mall.service.HelpMsgService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelpHome {

    @Resource
    private HelpMsgService helpMsgService;

    @RequestMapping("/mall/help_home")
    public String toHelpPage(HttpServletRequest httpRequest, HttpSession httpSession){
        List<HelpMsg> list = new ArrayList<HelpMsg>();
        list = helpMsgService.findList(1);
        System.out.println(list);
        httpRequest.setAttribute("list",list);
        return "/mall/help_home";
    }

    @RequestMapping("/mall/help_home/*")
    public String test(HttpServletRequest httpRequest){
        Integer id = Integer.parseInt(httpRequest.getParameter("id"));
        System.out.println(id);
        List<HelpMsg> list = new ArrayList<HelpMsg>();
        list = helpMsgService.findList(id);
        System.out.println(list);
        httpRequest.setAttribute("list",list);
        return "/mall/help_home";
    }

}
