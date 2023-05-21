package com.initSeven.best_travel.domain.repositories;

import com.initSeven.best_travel.domain.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<TicketEntity, UUID> {
}
