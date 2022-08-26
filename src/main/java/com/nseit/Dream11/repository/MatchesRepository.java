package com.nseit.Dream11.repository;

import com.nseit.Dream11.model.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchesRepository extends JpaRepository<Matches,Integer> {
}
