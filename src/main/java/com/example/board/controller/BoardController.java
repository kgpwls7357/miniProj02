package com.example.board.controller;

import com.example.board.dto.BoardDTO;
import com.example.board.mapper.BoardMapper;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @PostMapping("/save")
    public void save(BoardDTO boardDTO){
        Map<String, Integer> map = new HashMap<>();

        int result = boardService.save(boardDTO);

        if(result == 1){
            map.put("SUCCESS", result);
        } else {
            map.put("FAIL", result);
        }


        System.out.println("save result : " + result);
    }
}
