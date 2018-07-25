package com.gretzlegacy.repository.website;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gretzlegacy.model.website.Website;

public interface WebsiteRepository extends JpaRepository<Website, Long> {

}
