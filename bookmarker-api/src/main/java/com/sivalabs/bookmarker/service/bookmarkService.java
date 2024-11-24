package com.sivalabs.bookmarker.service;


import com.sivalabs.bookmarker.model.Bookmark;
import com.sivalabs.bookmarker.repo.BookmarkRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class bookmarkService {

@Autowired
    private BookmarkRepo bookmarkRepo ;

@Transactional(readOnly = true)
     public List<Bookmark> getBookmark(){
         return bookmarkRepo.findAll();
     }

}
