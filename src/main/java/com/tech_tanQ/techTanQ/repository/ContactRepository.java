package com.tech_tanQ.techTanQ.repository;

import com.tech_tanQ.techTanQ.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {}