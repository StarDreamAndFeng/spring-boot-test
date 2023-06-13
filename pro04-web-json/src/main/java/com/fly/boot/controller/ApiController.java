package com.fly.boot.controller;

import com.fly.boot.bean.Good;
import com.fly.boot.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: fly
 * @Date: 2023-02-13 20:26
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class ApiController {
    @RequestMapping("/goods")
    public JsonResult<List<Good>> getGoods(HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin","http://localhost:3000");

        List<Good> goods = new ArrayList<>();

        goods.add(new Good(1,"Teeming/天美意夏季专柜同款金色布女鞋6YF18BT6",298,new ArrayList<String>(){{add("舒适");add("透气");}},false,""));
        goods.add(new Good(2,"奥休斯(all shoes) 冬季保暖女士休闲雪地靴 舒适加绒防水短靴 防滑棉鞋子",89,new ArrayList<String>(){{add("保暖");add("防滑");}},false,""));
        goods.add(new Good(3,"初语秋冬新款毛衣女 套头宽松针织衫简约插肩袖上衣",199,new ArrayList<String>(){{add("秋冬");add("毛衣");}},false,""));
        goods.add(new Good(4,"佐露絲蕾丝衫女2020春秋装新款大码女装衬衫上衣雪纺衫韩版打底衫长袖",19,new ArrayList<String>(){{add("雪纺衫");add("打底");}},false,""));
        goods.add(new Good(5,"熙世界中长款长袖圆领毛衣女2022秋装新款假两件连衣裙女107SL170",178,new ArrayList<String>(){{add("圆领");add("连衣裙");}},false,""));
        goods.add(new Good(6,"烟花烫2021秋季装新品女装简约修身显瘦七分袖欧根纱连衣裙 花央",282,new ArrayList<String>(){{add("秋季新品");add("显瘦");}},false,""));
        goods.add(new Good(7,"韩都衣舍2021韩版女装秋装新宽松显瘦纯色系带长袖衬衫NG8201",128,new ArrayList<String>(){{add("韩都衣舍");add("长袖衬衫");}},false,""));
        goods.add(new Good(8,"预售纤莉秀大码女装胖妹妹秋装2020新款圆领百搭绣花胖mm休闲套头卫衣",128,new ArrayList<String>(){{add("预售");add("卫衣");}},false,""));
        goods.add(new Good(9,"莎密2022夏改良旗袍裙连衣裙修身复古时尚日常短款礼服旗袍",128,new ArrayList<String>(){{add("莎密");add("礼服");}},false,""));
        goods.add(new Good(10,"南极人秋冬韩版七彩棉加绒加厚一体保暖打底裤p7011",128,new ArrayList<String>(){{add("南极人");add("打底裤");}},false,""));

        return new JsonResult<>(goods,"请求商品信息成功!","200");
    }
}
