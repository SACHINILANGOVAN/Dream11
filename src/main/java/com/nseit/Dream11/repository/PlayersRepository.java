package com.nseit.Dream11.repository;

import com.nseit.Dream11.model.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<Players,Integer> {
}
