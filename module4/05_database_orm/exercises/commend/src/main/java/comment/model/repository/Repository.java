package comment.model.repository;

import comment.model.entity.Comment;

import javax.persistence.EntityTransaction;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
 public List<Comment> findAll(){
     return BaseRepository.entityManager.createQuery("select c from Comment c", Comment.class).getResultList();
 }
 public void save(Comment comment){
     EntityTransaction entityTransaction= BaseRepository.entityManager.getTransaction();
     entityTransaction.begin();
     BaseRepository.entityManager.persist(comment);
     entityTransaction.commit();
 }
 public void update(Comment comment){
     EntityTransaction entityTransaction= BaseRepository.entityManager.getTransaction();
     entityTransaction.begin();
     BaseRepository.entityManager.merge(comment);
     entityTransaction.commit();

 }

}
