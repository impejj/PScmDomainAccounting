package com.profesys.scientiam.accounting.finaccount

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

import com.profesys.scientiam.security.User;

class FinAccountTypeAttr implements Serializable {

 
	String attrName
	String attrValue
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	FinAccountType finAccountType

	 

	static belongsTo = [FinAccountType]
 

	static constraints = {
		finAccountType maxSize: 36
		attrName maxSize: 60
		attrValue nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
