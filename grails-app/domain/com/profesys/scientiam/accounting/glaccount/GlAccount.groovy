package com.profesys.scientiam.accounting.glaccount

import com.profesys.scientiam.crm.product.Product
import com.profesys.scientiam.security.User

class GlAccount {

	String 	id
	String accountCode
	String accountName
	String description
	Product product
	String externalId
    String         orderTag
	GlXbrlClass glXbrlClass
	GlResourceType glResourceType
	GlAccountType glAccountType
	GlAccount parentGlAccount
	GlAccountClass glAccountClass

//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
		static mapping = {
		id column: "gl_account_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		accountCode nullable: true, maxSize: 100
		accountName nullable: true, maxSize: 150
		description nullable: true
		product nullable: true, maxSize: 36
		externalId nullable: true, maxSize: 150
		glXbrlClass nullable: true
		glResourceType  nullable: true
		glAccountType  nullable: true
		parentGlAccount  nullable: true
		glAccountClass nullable: true
        orderTag nullable: true

	 	  state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
	String toString(){
		return "${accountCode}- ${accountName}"
	}
}
