package com.marketplace.marketplacelisting.service;

import java.util.List;

import com.marketplace.marketplacelisting.entity.Listing;

public interface ListingService {

	List<Listing> getListings();

	Listing saveListing(Listing listing);

}
