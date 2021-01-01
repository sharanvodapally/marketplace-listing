package com.marketplace.marketplacelisting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketplace.marketplacelisting.entity.Listing;
import com.marketplace.marketplacelisting.repository.ListingRepository;

import feign.UserClient;

@Service
public class ListingServiceImpl implements ListingService {

	@Autowired
	ListingRepository listingRepository;

	@Autowired
	UserClient userClient;

	@Override
	public List<Listing> getListings() {
		System.out.println(userClient.getUsers());
		return listingRepository.findAll();
	}

	@Override
	public Listing saveListing(Listing listing) {

		return listingRepository.save(listing);
	}

}
