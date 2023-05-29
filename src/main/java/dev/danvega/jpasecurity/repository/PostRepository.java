package dev.danvega.jpasecurity.repository;

import dev.danvega.jpasecurity.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
