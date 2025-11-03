package com.tech_tanQ.techTanQ.repository;

import com.tech_tanQ.techTanQ.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByTitleContaining(String title);

}
