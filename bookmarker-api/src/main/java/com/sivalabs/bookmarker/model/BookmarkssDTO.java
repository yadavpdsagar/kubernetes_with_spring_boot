package com.sivalabs.bookmarker.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookmarkssDTO {
    private  Long id ;
    private String titel ;
    private  String url ;
    private Instant createAt ;

}
