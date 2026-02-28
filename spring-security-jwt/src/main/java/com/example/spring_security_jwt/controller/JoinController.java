package com.example.spring_security_jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring_security_jwt.dto.JoinDTO;
import com.example.spring_security_jwt.service.JoinService;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }
    
    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {

        joinService.joinProcess(joinDTO);
        
        return "ok";
    }
    
}
