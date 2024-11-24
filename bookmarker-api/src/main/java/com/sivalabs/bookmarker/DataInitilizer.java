package com.sivalabs.bookmarker;

import com.sivalabs.bookmarker.model.Bookmark;
import com.sivalabs.bookmarker.repo.BookmarkRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitilizer implements CommandLineRunner {
    @Autowired
    private BookmarkRepo bookmarkRepo ;

    @Override
    public  void run (String... args) throws Exception{
        bookmarkRepo.save(new Bookmark(null ,"sagar" ,"https://sagar.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"lila" ,"https://lila.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"yunisha" ,"https://sandesh.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"abishak" ,"https://lama.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"ayush" ,"https://lamahotel.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"sagar" ,"https://sagar.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"lila" ,"https://lila.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"yunisha" ,"https://sandesh.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"abishak" ,"https://lama.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"ayush" ,"https://lamahotel.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"sagar" ,"https://sagar.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"lila" ,"https://lila.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"yunisha" ,"https://sandesh.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"abishak" ,"https://lama.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"ayush" ,"https://lamahotel.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"sagar" ,"https://sagar.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"lila" ,"https://lila.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"yunisha" ,"https://sandesh.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"abishak" ,"https://lama.in", Instant.now()));
        bookmarkRepo.save(new Bookmark(null ,"ayush" ,"https://lamahotel.in", Instant.now()));


    }
}
