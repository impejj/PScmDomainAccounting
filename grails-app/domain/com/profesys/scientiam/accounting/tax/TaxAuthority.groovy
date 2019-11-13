package com.profesys.scientiam.accounting.tax

import java.util.Date;

import com.profesys.scientiam.configuration.geo.Geo
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;
 

class TaxAuthority   {

	Geo   taxAuthGeo 
	Party taxAuthParty 
	Character requireTaxIdForExemption
	String taxIdFormatPattern
	Character includeTaxInPrice
 
	  
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
   

	static constraints = {
		taxAuthGeo  maxSize: 36
		taxAuthParty  nullable: true,maxSize: 36
		requireTaxIdForExemption nullable: true, maxSize: 1
		taxIdFormatPattern nullable: true
		includeTaxInPrice nullable: true, maxSize: 1
		  
		 
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
