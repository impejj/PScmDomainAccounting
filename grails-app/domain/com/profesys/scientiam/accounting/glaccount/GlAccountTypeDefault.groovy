package com.profesys.scientiam.accounting.glaccount

 
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User
 	
class GlAccountTypeDefault   {

 
	Party organizationParty
 	GlAccount glAccount
	GlAccountType glAccountType
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static constraints = {
		glAccountType maxSize: 36
		organizationParty maxSize: 36
		glAccount maxSize: 36 
		 state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
