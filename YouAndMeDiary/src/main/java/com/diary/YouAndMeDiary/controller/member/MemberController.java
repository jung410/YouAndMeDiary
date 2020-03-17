package com.diary.YouAndMeDiary.controller.member;

import com.diary.YouAndMeDiary.domain.Member;
import com.diary.YouAndMeDiary.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member/login")
    public String loginForm(){
        return "member/login";
    }

    @PostMapping("/member/login")
    public String loginPost(String userid, String password){
        return null;
    }

    @GetMapping("/member/logout")
    public String logoutGet(){
        return "redirect:/";
    }

    @GetMapping("/member/register")
    public String registerForm(Model model){
        model.addAttribute("member", new Member());
        return "member/register";
    }

    @PostMapping("/member/register")
    public String register(@Valid Member member) {
        log.info("========== 회원가입 post 진입 ==========");
        log.info("========== "+ member +" ==========");
        Member newMember = new Member();
        newMember.setUserId(member.getUserId());
        newMember.setUserName(member.getUserName());
        newMember.setUserEmail(member.getUserEmail());
        newMember.setUserPassword(member.getUserPassword());
        memberService.join(newMember);
        log.info("========== 회원가입 post 종료 ==========");
        return "redirect:/";
    }

    @GetMapping("/member/setting")
    public String memberSettingForm(){
        return "member/setting";
    }

    @RequestMapping("/logout")
    public ModelAndView logout(HttpSession session){
        session.invalidate();
        ModelAndView mv = new ModelAndView("redirect:/");
        return mv;
    }
}
