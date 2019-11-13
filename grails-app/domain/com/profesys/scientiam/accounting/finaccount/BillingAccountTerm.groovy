package com.profesys.scientiam.accounting.finaccount

import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.security.User

class BillingAccountTerm {

	String id
	BigDecimal termValue
	BigDecimal termDays
 //Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 	TermType termType
	BillingAccount billingAccount
	Uom uom
 
	static mapping = {
		id column: "billing_account_term_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		termValue nullable: true
		termDays nullable: true
 state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
