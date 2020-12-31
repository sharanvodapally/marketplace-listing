package com.marketplace.marketplacelisting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketplace.marketplacelisting.entity.Listing;
import com.marketplace.marketplacelisting.repository.ListingRepository;

@Service
public class ListingServiceImpl implements ListingService {

	@Autowired
	ListingRepository listingRepository;

	@Override
	public List<Listing> getListings() {
		return listingRepository.findAll();
	}

	@Override
	public Listing saveListing(Listing listing) {
		
		return listingRepository.save(listing);
	}

}
