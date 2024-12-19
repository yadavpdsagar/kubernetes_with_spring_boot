package com.sivalabs.bookmarker.repo;

import com.sivalabs.bookmarker.model.Forredux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ForreduxRepo extends JpaRepository<Forredux , Long>{

    Optional<Forredux> findByName(String name);

}
