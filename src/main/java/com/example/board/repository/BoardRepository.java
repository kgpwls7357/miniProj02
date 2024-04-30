package com.example.board.repository;

import com.example.board.dto.BoardDTO;
import com.example.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final BoardService boardService;

    public List<BoardDTO> read(){
        List<BoardDTO> list = boardService.read();

        return list;
    }

}
