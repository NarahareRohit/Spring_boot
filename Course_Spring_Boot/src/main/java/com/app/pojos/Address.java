package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="address111")
@JsonIgnoreType
public class Address extends BaseEntity{
	private String city;
	private String state;
	private int pincode;
	@OneToOne
	@MapsId
	private Student std;
	
}
