package com.profesys.scientiam.accounting.tax

import java.util.Date;

import com.profesys.scientiam.security.User;

 

class TaxAuthorityAssoc   {

	String taxAuthGeoId
	String taxAuthPartyId
	String toTaxAuthGeoId
	String toTaxAuthPartyId
	Date fromDate
	Date thruDate
 
	TaxAuthorityAssocType taxAuthorityAssocType
	TaxAuthority taxauthascTxa
	TaxAuthority taxauthascTotxa

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	  

	static constraints = {
		taxAuthGeoId maxSize: 36
		taxAuthPartyId maxSize: 36
		toTaxAuthGeoId maxSize: 36
		toTaxAuthPartyId maxSize: 36
		thruDate nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
