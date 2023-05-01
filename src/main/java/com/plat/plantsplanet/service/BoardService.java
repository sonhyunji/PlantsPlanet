package com.plat.plantsplanet.service;

import com.plat.plantsplanet.entity.Board;
import com.plat.plantsplanet.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public void write(Board board){
        boardRepository.save(board);
    }
}
