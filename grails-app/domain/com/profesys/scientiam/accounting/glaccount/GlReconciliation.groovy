package com.profesys.scientiam.accounting.glaccount

import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User
class GlReconciliation {

	String id
	String glReconciliationName
	String description
	 
	BigDecimal reconciledBalance
	BigDecimal openingBalance
	Date reconciledDate
 
	Party party
	GlAccount glAccount
	StatusItem statusItem

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id column: "gl_reconciliation_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		glReconciliationName nullable: true, maxSize: 100
		description nullable: true
		 
		reconciledBalance nullable: true
		openingBalance nullable: true
		reconciledDate nullable: true
		description   nullable: true
		description   nullable: true
		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true
	}
}
