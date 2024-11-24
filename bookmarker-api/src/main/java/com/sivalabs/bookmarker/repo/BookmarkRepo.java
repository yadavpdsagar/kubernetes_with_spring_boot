package com.sivalabs.bookmarker.repo;


import com.sivalabs.bookmarker.model.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BookmarkRepo extends JpaRepository<Bookmark , Integer> {
}
