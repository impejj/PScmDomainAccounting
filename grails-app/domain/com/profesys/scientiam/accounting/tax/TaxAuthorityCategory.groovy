package com.profesys.scientiam.accounting.tax

import java.util.Date;

import com.profesys.scientiam.crm.product.ProductCategory
import com.profesys.scientiam.security.User;

 

class TaxAuthorityCategory   {

	ProductCategory productCategory
	TaxAuthority taxAuthority
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated = new Date() //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

 
 

	static constraints = { 
		taxAuthority maxSize: 36
		productCategory maxSize: 36
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: false , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
