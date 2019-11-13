package com.profesys.scientiam.accounting.finaccount

import com.profesys.scientiam.security.User

class FinAccountAuth {

	String id
	BigDecimal amount
	String currencyUomId
	Date authorizationDate
	Date fromDate
	Date thruDate
 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	FinAccount finAccount

	static belongsTo = [FinAccount]

	static mapping = {
		id column: "fin_account_auth_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		amount nullable: true
		currencyUomId nullable: true, maxSize: 36
		authorizationDate nullable: true
		fromDate nullable: true
		thruDate nullable: true
		 		     state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
