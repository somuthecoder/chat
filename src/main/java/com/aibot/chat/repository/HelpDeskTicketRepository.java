package com.aibot.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aibot.chat.entity.HelpDeskTicket;

import java.util.List;

public interface HelpDeskTicketRepository extends JpaRepository<HelpDeskTicket, Long> {

    List<HelpDeskTicket> findByUsername(String username);
}
