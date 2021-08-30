package com.codegym.model.repository.model.repository;

import com.codegym.model.repository.model.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
