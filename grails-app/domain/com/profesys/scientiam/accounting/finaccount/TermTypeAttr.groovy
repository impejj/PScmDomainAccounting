package com.profesys.scientiam.accounting.finaccount

import java.util.Date;

import com.profesys.scientiam.security.User;
 

class TermTypeAttr implements Serializable {

 
	String attrName
 
	TermType termType
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static belongsTo = [TermType]

	 

	static constraints = {
		termType maxSize: 36
		attrName maxSize: 60
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
