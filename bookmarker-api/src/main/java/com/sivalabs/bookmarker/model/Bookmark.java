package com.sivalabs.bookmarker.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.util.Optional;

@Entity
@Data
@Table(name = "bookmark")
@NoArgsConstructor
@AllArgsConstructor
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private  String titel  ;
    @Column(nullable = false)
    private String  url ;

    private Instant createAt ;
}
