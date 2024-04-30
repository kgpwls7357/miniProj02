package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public int save(BoardDTO boardDTO){
        return boardMapper.save(boardDTO);
    }

}
