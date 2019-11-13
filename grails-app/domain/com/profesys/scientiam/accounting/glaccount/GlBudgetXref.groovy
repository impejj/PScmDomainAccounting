package com.profesys.scientiam.accounting.glaccount

import com.profesys.scientiam.security.User
import com.profesys.scientiam.services.budget.BudgetItemType
class GlBudgetXref  {

 
	Date fromDate
	Date thruDate
	BigDecimal allocationPercentage
 
	GlAccount glAccount
	BudgetItemType budgetItemType
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static belongsTo = [BudgetItemType, GlAccount]

	 

	static constraints = {
		glAccount maxSize: 36
		budgetItemType maxSize: 36
		thruDate nullable: true
		allocationPercentage nullable: true, scale: 6
		 state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
