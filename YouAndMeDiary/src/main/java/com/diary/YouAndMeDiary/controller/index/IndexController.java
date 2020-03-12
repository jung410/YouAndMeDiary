package com.diary.YouAndMeDiary.controller.index;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    /**
     * 일단 최초 접속은 login 화면으로
     */
    @RequestMapping("/")
    public String login(){
        log.info("=========== login view Run ===========");
        return "member/login";
    }

    /**
     * index는 대쉬보드로 가도록
     */
    @GetMapping("/dashboard")
    public String index(){
        log.info("=========== index controller Run ===========");
        return "index";
    }

    /**
     * 일기장 -> 월간 일기장
     */
    @RequestMapping("/diary/month")
    public String month(){
        log.info("=========== diary/month controller Run ===========");
        return "diary/month";
    }
    /**
     * 일기장 -> 일간 일기장
     */
    @RequestMapping("/diary/daily")
    public String daily(){
        log.info("=========== diary/daily controller Run ===========");
        return "diary/daily";
    }

    /**
     * 일기장 -> 갤러리
     */
    @RequestMapping("/diary/gallery")
    public String week(){
        log.info("=========== diary/week controller Run ===========");
        return "diary/gallery";
    }
}
