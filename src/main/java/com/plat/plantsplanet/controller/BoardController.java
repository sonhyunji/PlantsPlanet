package com.plat.plantsplanet.controller;

import com.plat.plantsplanet.entity.Board;
import com.plat.plantsplanet.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @GetMapping("/board/list")
    public String boardlist(Model model){
        model.addAttribute("list", boardService.boardlist());
        //boardService에서 생성한 boardlist 메소드를 통해 list가 반환되는데 해당 list를 "list"란 이름으로 넘겨주겠다는 것(html에 나올 수 있게)
        return "boardlist";
    }

    @GetMapping("/board/view")
    public String boardview(Model model, Integer id){
        model.addAttribute("board", boardService.boardview(id));
        return "boardview";
    }
}
