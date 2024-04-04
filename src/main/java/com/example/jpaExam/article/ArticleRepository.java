package com.example.jpaExam.article;

import com.example.jpaExam.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository 상속 받아 interface 생성
// <대상 엔티티, ID 타입>
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
