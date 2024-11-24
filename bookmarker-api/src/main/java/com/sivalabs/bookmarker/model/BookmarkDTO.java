package com.sivalabs.bookmarker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;


@Getter
@Setter
public class BookmarkDTO {
    private List<BookmarkssDTO>  data ;
    private long totalElements;
    private int totalPage ;
    private int currentPage ;
    @JsonProperty("isFirst")
    private  boolean isFirst ;
    @JsonProperty("isLast")
    private  boolean isLast ;
    private  boolean hasNext ;
    private  boolean hasPrevious ;

    public BookmarkDTO(Page<BookmarkssDTO> bookmarkpage){
        this.setData(bookmarkpage.getContent());
        this.setTotalElements(bookmarkpage.getTotalElements());
        this.setTotalPage(bookmarkpage.getTotalPages());
        this.setCurrentPage(bookmarkpage.getNumber()+1);
        this.setFirst(bookmarkpage.isFirst());
        this.setLast(bookmarkpage.isLast());
        this.setHasNext(bookmarkpage.hasNext());
        this.setHasPrevious(bookmarkpage.hasPrevious());
    }

}
