package com.profesys.scientiam.accounting.finaccount

import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.crm.contact.ContactMech
import com.profesys.scientiam.crm.contact.PostalAddress
import com.profesys.scientiam.security.User

class BillingAccount {

	String id
	BigDecimal accountLimit
	Date fromDate
	Date thruDate
	String description
	String externalAccountId
 
	Uom uom
	PostalAddress postalAddress
	ContactMech contactMech
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 


	static mapping = {
		id column: "billing_account_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		accountLimit nullable: true
		fromDate nullable: true
		thruDate nullable: true
		description nullable: true
		externalAccountId nullable: true, maxSize: 36
 		 		     state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
