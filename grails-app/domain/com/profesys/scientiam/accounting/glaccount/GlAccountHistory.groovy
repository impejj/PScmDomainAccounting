package com.profesys.scientiam.accounting.glaccount

 
import com.profesys.scientiam.configuration.uom.CustomTimePeriod
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User

class GlAccountHistory {

 
	BigDecimal openingBalance
	BigDecimal postedDebits
	BigDecimal postedCredits
	BigDecimal endingBalance
	 
	CustomTimePeriod customTimePeriod
	Party organizationParty
	GlAccount glAccount
	
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	static belongsTo = [CustomTimePeriod, GlAccount, Party]

	 

	static constraints = {
		glAccount maxSize: 36
		organizationParty maxSize: 36
		customTimePeriod maxSize: 36
		openingBalance nullable: true
		postedDebits nullable: true
		postedCredits nullable: true
		endingBalance nullable: true
		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true
	}
}
