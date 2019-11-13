package com.profesys.scientiam.accounting.tax

import java.util.Date;
 

import com.profesys.scientiam.accounting.glaccount.GlAccount
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User;

class TaxAuthorityGlAccount   {
 
	 
	TaxAuthority taxAuthority
	Party organizationParty
	GlAccount glAccount
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 
	 
	 

	static constraints = {
		taxAuthority  maxSize: 36
		glAccount nullable: false , display:false
		organizationParty nullable: false , display:false,  maxSize: 36
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
