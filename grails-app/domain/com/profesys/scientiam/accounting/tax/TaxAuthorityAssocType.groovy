package com.profesys.scientiam.accounting.tax

import java.util.Date;

import com.profesys.scientiam.security.User;

class TaxAuthorityAssocType {

	String id
	String description
	
	
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

	 

	static mapping = {
		id column: "tax_authority_assoc_type_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
		
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		 
		dateDeleted nullable: true , display:false
	}
}
