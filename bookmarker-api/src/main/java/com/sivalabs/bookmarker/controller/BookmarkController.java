package com.sivalabs.bookmarker.controller;


import com.sivalabs.bookmarker.model.BookmarkDTO;
import com.sivalabs.bookmarker.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookmark")
@RequiredArgsConstructor
public class BookmarkController {

    @Autowired
  private   BookmarkService bookmarkService ;

    @GetMapping
    public BookmarkDTO getBookmarks(@RequestParam (name = "page" ,defaultValue = "1") Integer page){
        return  bookmarkService.getBookmarks(page);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Bookmark> getBookmarkById(@PathVariable int id) {
//        return bookmarkService.getBookmarkById(id);
//    }
}
