package com.profesys.scientiam.accounting.glaccount

 
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.PartyRole
import com.profesys.scientiam.security.User

class GlAccountRole   {
	String id
	GlAccount glAccount
	Party party
	PartyRole partyRole
	Date fromDate
	Date thruDate
	 
	
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id   generator: "assigned"
		version true
	}
	 

	static constraints = {
		id maxSize: 36
		glAccount maxSize: 36
		party maxSize: 36
		partyRole maxSize: 36
		thruDate nullable: true
		 state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
