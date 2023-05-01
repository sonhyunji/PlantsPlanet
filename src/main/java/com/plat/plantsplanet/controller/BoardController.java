package com.plat.plantsplanet.controller;

import com.plat.plantsplanet.entity.Board;
import com.plat.plantsplanet.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm() {
        return "boardwrite";
    }

    @PostMapping("/board/writedo")
    public String boardWritePro(Board board) {
        boardService.write(board);
        return "boardwritedo";
    }
}
