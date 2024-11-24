package com.sivalabs.bookmarker.repo;


import com.sivalabs.bookmarker.model.Bookmark;
import com.sivalabs.bookmarker.model.BookmarkssDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  BookmarkRepo extends JpaRepository<Bookmark , Integer> {
    @Query("select b from Bookmark b where b.id = ?1")
    Optional<Bookmark> findById(int id);

    @Query("select new com.sivalabs.bookmarker.model.BookmarkssDTO(b.id, b.titel, b.url, b.createAt) from Bookmark b")
    Page<BookmarkssDTO> findBookmarks(Pageable pageable);
}


//@Query("select u from User u where u.emailAddress = ?1")