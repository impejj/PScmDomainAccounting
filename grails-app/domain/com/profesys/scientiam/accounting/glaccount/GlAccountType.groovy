package com.profesys.scientiam.accounting.glaccount

import com.profesys.scientiam.security.User
class GlAccountType {

	String id
	Character hasTable
	String description
	 
 	GlAccountType parentType
	
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 
	

	static mapping = {
		id column: "gl_account_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		parentType  nullable: true
		 state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
