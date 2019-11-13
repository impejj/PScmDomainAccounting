package com.profesys.scientiam.accounting.acctgtrans

 
import com.profesys.scientiam.security.User
class AcctgTransAttribute   {

	
	String attrName
	String attrValue
	Date lastUpdatedStamp
	Date lastUpdatedTxStamp
	Date createdStamp
	Date createdTxStamp
	AcctgTrans acctgTrans

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	static belongsTo = [AcctgTrans]

	

	static constraints = {
		acctgTrans maxSize: 36
		attrName maxSize: 60
		attrValue nullable: true
	state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true	 
	}
}
