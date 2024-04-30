package com.example.board.service;

import com.example.board.dto.BoardDTO;
import com.example.board.mapper.BoardMapper;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    public List<BoardDTO> read(){
        List<BoardDTO> list = boardMapper.read();

        return list;
    }
}
