package comment.controller;

import comment.model.entity.Comment;
import comment.model.repository.BaseRepository;
import comment.model.service.iServiceComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityTransaction;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private iServiceComment iServiceComment;

    @RequestMapping("/")
    public String display(Model model) {
        List<Comment> list=iServiceComment.findAll();
        model.addAttribute("comment", new Comment());
        model.addAttribute("list",list);
        return "index";
    }

    @PostMapping("/create")
    public String insert(Comment commend) {
        iServiceComment.save(commend);
        return "redirect:/";
    }
    @PostMapping("/update")
    public String update(Comment comment){
        iServiceComment.update(comment);
        return "redirect:/";
    }

}
