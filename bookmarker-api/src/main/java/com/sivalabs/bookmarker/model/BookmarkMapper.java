package com.sivalabs.bookmarker.model;


import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkssDTO toDto(Bookmark bookmark){
        BookmarkssDTO dto =new BookmarkssDTO();
        dto.setId(bookmark.getId());
        dto.setTitel(bookmark.getTitel());
        dto.setUrl(bookmark.getUrl());
        dto.setCreateAt(bookmark.getCreateAt());

        return  dto ;
    }
}
