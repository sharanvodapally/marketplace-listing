package com.marketplace.marketplacelisting.entity;

import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5337783468236492296L;

	private Integer id;

	private String name;

	private String city;

    @JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;
	
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createdDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date lastUpdatedDate;

	private String createdBy;

	private String lastUpdatedBy;

}

