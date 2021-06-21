package comment.model.service;

import comment.model.entity.Comment;
import comment.model.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceComment implements iServiceComment {
    Repository repository=new Repository();
    @Override
    public List<Comment> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Comment comment) {
        repository.save(comment);
    }

    @Override
    public void update(Comment comment) {
        repository.update(comment);

    }
}
