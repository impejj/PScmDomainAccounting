package com.profesys.scientiam.accounting.finaccount

import java.util.Date;

import com.profesys.scientiam.security.User;
import com.profesys.scientiam.configuration.Enumeration

class FinAccountType {

	String id
	Character isRefundable
	Character hasTable
	String description
 
	FinAccountType parentType
	Enumeration enumeration
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	static mapping = {
		id column: "fin_account_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		isRefundable nullable: true, maxSize: 1
		hasTable nullable: true, maxSize: 1
		description nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
