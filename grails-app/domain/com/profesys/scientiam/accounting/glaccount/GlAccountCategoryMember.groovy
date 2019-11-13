package com.profesys.scientiam.accounting.glaccount

 
import com.profesys.scientiam.security.User
class GlAccountCategoryMember  {

	 
	 
	Date fromDate
	Date thruDate
	BigDecimal amountPercentage
	 
	GlAccountCategory glAccountCategory
	GlAccount glAccount
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static belongsTo = [GlAccount, GlAccountCategory]
 

	static constraints = {
		glAccount maxSize: 36
		glAccountCategory maxSize: 36
		thruDate nullable: true
		amountPercentage nullable: true, scale: 6
		 	  state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
