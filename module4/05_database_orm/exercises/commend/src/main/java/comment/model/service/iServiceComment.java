package comment.model.service;

import comment.model.entity.Comment;

import java.util.List;

public interface iServiceComment {
    List<Comment> findAll();
    void  save(Comment comment);
    void update(Comment comment);
}
