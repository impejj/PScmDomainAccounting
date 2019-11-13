package com.profesys.scientiam.accounting.glaccount


import com.profesys.scientiam.security.User
class GlAccountCategory {

	String id
	String description
	 
	GlAccountCategoryType parentType

//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	static hasMany = [glAccountCategoryMembers: GlAccountCategoryMember]
	static belongsTo = [GlAccountCategoryType]

	static mapping = {
		id column: "gl_account_category_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
			state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
