package com.oracle.coherence.model;

import com.tangosol.io.pof.annotation.Portable;
import com.tangosol.io.pof.annotation.PortableProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="country")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Portable
public class Country{
	private static final long serialVersionUID = 1L;
	
	
	public static final int COUNTRY_ID =0;
	public static final int CONTRY_NAME = 1;
	public static final int REGION_ID = 2;
	
	
@PortableProperty(COUNTRY_ID)
	private String countryId;

@PortableProperty(CONTRY_NAME)
	private String countryName;

@PortableProperty(REGION_ID)
	private Long regionId;

	public Country() {
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Long getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}

	

}