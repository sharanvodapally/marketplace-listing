package com.marketplace.marketplacelisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketplace.marketplacelisting.entity.Listing;
import com.marketplace.marketplacelisting.service.ListingService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "API's for listing")
@RestController
@RequestMapping("v1/listing")
public class ListingController {

	@Autowired
	ListingService listingService;

	@ApiOperation(value = "API to get Users", response = Listing.class, responseContainer = "List")
	@GetMapping
	public ResponseEntity<List<Listing>> getListings() {
		return new ResponseEntity<List<Listing>>(listingService.getListings(), HttpStatus.OK);
	}

//	@GetMapping("{id}")
//	public ResponseEntity<User> getUserById(@ApiParam(required = true, value = "unique user id", example = "1") @PathVariable Integer id) {
//		return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
//	}
//
	@ApiOperation(value = "API to add Listing", response = Listing.class)
	@PostMapping
	public ResponseEntity<Listing> saveListing(@RequestBody Listing listing) {
		return new ResponseEntity<Listing>(listingService.saveListing(listing), HttpStatus.CREATED);
	}
//
//	@ApiOperation(value = "API to update User", response = User.class)
//	@PutMapping("{id}")
//	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Integer id) {
//		return new ResponseEntity<User>(userService.updateUser(user, id), HttpStatus.ACCEPTED);
//	}
//
//	@ApiOperation(value = "API to delete User")
//	@DeleteMapping("{id}")
//	public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
//		return new ResponseEntity<String>(userService.deleteUser(id), HttpStatus.NO_CONTENT);
//	}

}