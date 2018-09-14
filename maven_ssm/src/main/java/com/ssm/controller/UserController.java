package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.domain.User;
import com.ssm.service.IUserService;

@Controller
@RequestMapping("/UserCRUD")
public class UserController {

    @Resource
    private IUserService userService;

    /**
        * 查询所有User
     * 
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/showUser", method = RequestMethod.GET)
    @ResponseBody
    public List<User> showUsers(Model model) {
        System.out.println("**********showUsers********");
        List<User> userList = new ArrayList<User>();
        userList = userService.getAllUser();
      /*  model.addAttribute("userList", userList); // 填充数据到model
        return "showUser";*/
        return userList;
    }

    /**
     * 增加一个用户
     * 
     * @param userName
     * @param sex
     * @param age
     * @return
     */
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    @ResponseBody
    public ModelMap addUser(String userName, String sex, int age) {
        System.out.println("******addUser********");
        System.out.println(userName + sex + age);
        User user = new User();
        user.setsex(sex);
        user.setUserName(userName);
        user.setAge(age);
        userService.insertUser(user);
        ModelMap model = new ModelMap();
        model.addAttribute("result", "添加成功");
        return model;
    }

    /**
     * 通过userID删除用户
     * 
     * @param userID
     */
    @RequestMapping(value = "/delUser/{userID}", method = RequestMethod.GET)
    @ResponseBody
    public List<User> delUser(@PathVariable int userID) {
        System.out.println(userID);
        userService.deleteUser(userID);
        ModelAndView mv = new ModelAndView();
        List<User> userList = new ArrayList<User>();
        userList = userService.getAllUser();
       /* mv.addObject("userList", userList); // 填充数据到model
        mv.setViewName("showUser");*/
        return userList;
    }

    /**
     * 查询用户
     * 
     * @param model
     * @param keyWords
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public List<User> findUsers(Model model, String keyWords) {
        System.out.println(keyWords);
        List<User> userList = new ArrayList<User>();
        userList = userService.findUsers(keyWords);
        //model.addAttribute("userList", userList); // 填充数据到model
        return userList;
    }
    
    /**
     * 更新用户信息
     * @param userName
     * @param sex
     * @param age
     * @param id
     * @return
     */
    @RequestMapping(value="/editUser",method=RequestMethod.POST)
    public ModelAndView editUser(String userName, String sex, int age, int id) {
        System.out.println(userName + sex + age);
        User user = new User();
        user.setsex(sex);
        user.setUserName(userName);
        user.setAge(age);
        user.setId(id);
        userService.editUser(user);
        ModelAndView mv = new ModelAndView();
        List<User> userList = new ArrayList<User>();
        userList = userService.getAllUser();
        mv.addObject("userList", userList); // 填充数据到model
        mv.setViewName("redirect:/UserCRUD/showUser");
        return mv;
    }
}