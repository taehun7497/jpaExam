package com.example.jpaExam.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArticleController {

    @Autowired
    MyDB memoryDB;

    public void test() {
        memoryDB.run();
    }
}