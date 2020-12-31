package com.marketplace.marketplacelisting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketplace.marketplacelisting.entity.Listing;

public interface ListingRepository extends JpaRepository<Listing, Long> {

}
