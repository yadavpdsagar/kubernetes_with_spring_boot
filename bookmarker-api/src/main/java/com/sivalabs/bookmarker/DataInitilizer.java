package com.sivalabs.bookmarker;

import com.sivalabs.bookmarker.model.Bookmark;
import com.sivalabs.bookmarker.model.Forredux;
import com.sivalabs.bookmarker.repo.BookmarkRepo;
import com.sivalabs.bookmarker.repo.ForreduxRepo;
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

    @Autowired
    private ForreduxRepo forreduxRepo;

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

        forreduxRepo.save(new Forredux(111L , "test", "testfield1,testfield2,testfield21" ));
        forreduxRepo.save(new Forredux(112L , "test2", "testfield1254,testfield12545,testfield125478" ));
        forreduxRepo.save(new Forredux(113L , "test3", "testfield125498,testfield125412,testfield125436" ));
        forreduxRepo.save(new Forredux(114L , "test4", "testfield125448,testfield125452,testfield125438" ));
        forreduxRepo.save(new Forredux(115L , "test5", "testfield125486,testfield1254753,testfield1254158,testfield1254548,testfield1254sd" ));



    }
}
