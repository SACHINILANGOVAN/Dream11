package com.nseit.Dream11.repository;

import com.nseit.Dream11.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Events,Integer> {
}
