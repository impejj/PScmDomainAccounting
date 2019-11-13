package com.profesys.scientiam.accounting.glaccount

 
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.RoleType
import com.profesys.scientiam.security.User
class GlAccountOrganization   {

    String id
	RoleType roleType
	Date fromDate
	Date thruDate

	Party organizationParty 
	GlAccount glAccount

//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted


	static mapping = {
		id column: "gl_account_organization_id", generator: "assigned"
		version true
	}
 

	static constraints = {
		id maxSize: 36
		glAccount maxSize: 36
		organizationParty maxSize: 36
		roleTypeId nullable: true, maxSize: 36
		fromDate nullable: true
		thruDate nullable: true
		state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true 
	}
}
