package com.fly.boot.controller;

import com.fly.boot.bean.Fruit;
import com.fly.boot.bean.User;
import com.fly.boot.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: fly
 * @Date: 2023-02-08 16:13
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/test")
    public String index(@RequestParam("username") String username) {
        log.info("用户名:" + username);
        return "测试";
    }

    @RequestMapping("/user/find")
    public JsonResult<List<User>> findUser(HttpServletResponse response) {
        User user1 = new User(1,"张三",12);
        User user2 = new User(2,"李四",19);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);

        response.setHeader("Access-Control-Allow-Origin","http://localhost:3000");

        return new JsonResult<>(list,"success","200");
    }

    // 伪数据
    private final List<String> usernames = new ArrayList<>();
    public void addUsername() {
        usernames.add("张三");
        usernames.add("李四");
        usernames.add("王五");
    }
    /**
     * 通过用户名 -> 查找用户
     * @param username 用户名
     * @return 返回给 浏览器
     */
    @CrossOrigin("*")
    @RequestMapping("find/user/by/{username}")
    public JsonResult<Boolean> findUserByName(@PathVariable String username) {
        addUsername();

        JsonResult<Boolean> jsonResult = new JsonResult<>();

        jsonResult.setCode("200");
        jsonResult.setMessage("success");

        if (usernames.contains(username)) {
            // 用户名被占用
            jsonResult.setData(true);
        } else {
            jsonResult.setData(false);
        }

        return jsonResult;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public JsonResult<User> get(HttpServletResponse response,User user) {
        response.setHeader("Access-Control-Allow-Origin","http://localhost:3000");
        return new JsonResult<>(user,"get success","200");
    }

    @CrossOrigin("*")
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public JsonResult<User> post(HttpServletResponse response,@RequestBody User user) {
        response.setHeader("Access-Control-Allow-Origin","http://localhost:3000");
        return new JsonResult<>(user,"post success","200");
    }

    // 购物车
    @RequestMapping("/cart")
    public JsonResult<List<Fruit>> cart(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","http://localhost:3000");

        List<Fruit> list = new ArrayList<Fruit>();
        list.add(new Fruit(1,"苹果","https://s1.ax1x.com/2023/02/13/pSIqh2q.png",false,1,12.4));
        list.add(new Fruit(2,"香蕉","https://s1.ax1x.com/2023/02/13/pSIqorT.png",false,0,5.8));
        list.add(new Fruit(3,"西瓜","https://s1.ax1x.com/2023/02/13/pSIqIMV.png",false,0,18.4));
        list.add(new Fruit(4,"桃子","https://s1.ax1x.com/2023/02/13/pSIqfGn.png",false,0,9.5));
        list.add(new Fruit(5,"草莓","https://s1.ax1x.com/2023/02/13/pSIq25j.png",false,1,19.7));
        list.add(new Fruit(6,"葡萄","https://s1.ax1x.com/2023/02/13/pSIqWPs.png",false,0,8.97));
        list.add(new Fruit(7,"甘蔗","https://s1.ax1x.com/2023/02/13/pSIqgaQ.png",false,0,7.29));

        return new JsonResult<List<Fruit>>(list,"请求购物车数据成功过!","200");
    }
}
