//package com.sivalabs.bookmarker;
//
//import com.sivalabs.bookmarker.model.Bookmark;
//import com.sivalabs.bookmarker.repo.BookmarkRepo;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.hamcrest.CoreMatchers;
//
//import java.time.Instant;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//public class BookmarkControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//    private BookmarkRepo bookmarkRepo ;
//private List<Bookmark> bookmarks;
//
//
//    @BeforeEach
//    void setUp(){
//        bookmarkRepo.deleteAllInBatch();
//        bookmarks = new ArrayList<>() ;
//        bookmarks.add(new Bookmark(null ,"sagar" ,"https://sagar.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"lila" ,"https://lila.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"yunisha" ,"https://sandesh.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"abishak" ,"https://lama.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"ayush" ,"https://lamahotel.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"sagar" ,"https://sagar.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"lila" ,"https://lila.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"yunisha" ,"https://sandesh.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"abishak" ,"https://lama.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"ayush" ,"https://lamahotel.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"sagar" ,"https://sagar.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"saurav" ,"https://saurav.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"lila" ,"https://lila.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"yunisha" ,"https://sandesh.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"abishak" ,"https://lama.in", Instant.now()));
//        bookmarks.add(new Bookmark(null ,"ayush" ,"https://lamahotel.in", Instant.now()));
//
//        bookmarkRepo.saveAll(bookmarks);
//
//    }
//
//    @Test
//    void shouldGetBookmarks() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/api/bookmark"))
//                .andExpect(status().isOk()) // Assert that the status is OK
//                .andExpect(jsonPath("$.totalElements", CoreMatchers.equalTo(21)))
//                .andExpect(jsonPath("$.totalPage", CoreMatchers.equalTo(3)))
//                .andExpect(jsonPath("$.currentPage", CoreMatchers.equalTo(1)))
//                .andExpect(jsonPath("$.isFirst", CoreMatchers.equalTo(true)))
//                .andExpect(jsonPath("$.isLast", CoreMatchers.equalTo(false)))
//                .andExpect(jsonPath("$.hasNext", CoreMatchers.equalTo(true)))
//                .andExpect(jsonPath("$.hasPrevious", CoreMatchers.equalTo(false))); // Assert the value of "totalElements" is 0
//    }
//}