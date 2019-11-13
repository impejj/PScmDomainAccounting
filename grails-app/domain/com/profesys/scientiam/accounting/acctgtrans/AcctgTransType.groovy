package com.profesys.scientiam.accounting.acctgtrans
import com.profesys.scientiam.security.User
class AcctgTransType {

	String 	id
	Character hasTable
	String description
 
//	AcctgTransType parentType
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static mapping = {
		id column: "acctg_trans_type_id", generator: "assigned"
		version true
	}
	
	static constraints = {
		id maxSize: 36
//		parentType maxSize: 36
		hasTable nullable: true, maxSize: 1
		description nullable: true
		 state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
	String toString(){
		return "${description}"
	}
}
