package com.profesys.scientiam.accounting.glaccount

 
import com.profesys.scientiam.security.User
class GlAccountGroupMember   {

	

 
	GlAccountGroup glAccountGroup
	GlAccountGroupType glAccountGroupType
	GlAccount glAccount
 
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	static belongsTo = [GlAccount, GlAccountGroup, GlAccountGroupType]
 

	static constraints = {
		glAccount maxSize: 36
		glAccountGroupType maxSize: 36
		  state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
