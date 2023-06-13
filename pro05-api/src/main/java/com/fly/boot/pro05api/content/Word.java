package com.fly.boot.pro05api.content;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fly
 * @Date: 2023-02-10 14:20
 * @Description:
 */
@RequestMapping("/word")
@RestController
public class Word {

    String[] strings = new String[]{"我爱他，深深爱著他。原本一无所有的我，只要这样就已经非常的幸福了.",
            "在房间玩腻了，准备去客厅散散心，过几天去厨房走走。",
            "世间很多事没有道理可言，就是最大的道理。",
            "世界上本没有贫穷，富的人多了，我就变成了贫穷。",
            "如果我不会飞，那我就只是一只普通的猪。",
            "试着去了解那些你讨厌的人，你会发现，真是越看越讨厌。",
            "钱塘风雨起苍黄，贺鸡儿楠过大江",
            "我明明是个老师，病毒把我变成主播。"};

    @RequestMapping("/day")
    public String day() {
        // 取值范围: [0,strings.length)
        int num = (int)(Math.random()*strings.length);
        return strings[num];
    }
}
