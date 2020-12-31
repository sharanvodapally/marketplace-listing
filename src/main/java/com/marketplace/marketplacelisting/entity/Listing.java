package com.marketplace.marketplacelisting.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Listing {

	private Integer userId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long listingId;

	private String name;

	private String description;

	@Enumerated(EnumType.STRING)
	private ListingStatus listingStatus;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdDate;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastUpdatedDate;

	private String createdBy;

	private String lastUpdatedBy;

}
