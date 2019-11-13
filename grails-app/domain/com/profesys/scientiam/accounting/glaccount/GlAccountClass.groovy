package com.profesys.scientiam.accounting.glaccount

import com.profesys.scientiam.security.User

class GlAccountClass {

	String id
	String description
	Character isAssetClass
    String         orderTag
	GlAccountClass parentClass
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted


	static mapping = {
		id column: "gl_account_class_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
		isAssetClass nullable: true, maxSize: 1
		parentClass  nullable: true


	 	  state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
