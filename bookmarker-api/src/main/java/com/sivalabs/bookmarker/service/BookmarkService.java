package com.sivalabs.bookmarker.service;



import com.sivalabs.bookmarker.model.BookmarkDTO;
import com.sivalabs.bookmarker.model.BookmarkMapper;
import com.sivalabs.bookmarker.model.BookmarkssDTO;
import com.sivalabs.bookmarker.repo.BookmarkRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BookmarkService {

@Autowired
    private BookmarkRepo bookmarkRepo ;


@Transactional(readOnly = true)
     public BookmarkDTO getBookmarks(Integer page){
    int pageNo= page < 1 ? 0 :page -1 ;
    Pageable pageable = PageRequest.of(pageNo , 10 , Sort.Direction.DESC , "createAt") ;
    Page<BookmarkssDTO> bookmarkPage = bookmarkRepo.findBookmarks(pageable);
    return  new BookmarkDTO(bookmarkPage);
     }

//    public ResponseEntity<Bookmark> getBookmarkById(int id) {
//        try {
//            // Attempt to retrieve the bookmark by ID
//            Optional<Bookmark> optionalBookmark = bookmarkRepo.findById(id);
//
//            // Check if the bookmark is present
//            if (optionalBookmark.isPresent()) {
//                Bookmark bookmark = optionalBookmark.get();  // Get the bookmark from Optional
//                return new ResponseEntity<>(bookmark, HttpStatus.OK);  // Return the bookmark with a 200 OK response
//            } else {
//                // If bookmark not found, return 404 Not Found
//                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//            }
//
//        } catch (Exception e) {
//            // Log and rethrow or handle the exception
//            e.printStackTrace();
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Return 500 for internal server errors
//        }
//    }

}
