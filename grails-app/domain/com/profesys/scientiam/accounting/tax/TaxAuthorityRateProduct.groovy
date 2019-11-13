package com.profesys.scientiam.accounting.tax

import java.util.Date;

import com.profesys.scientiam.crm.product.ProductCategory
//import com.profesys.scientiam.crm.product.ProductStore
import com.profesys.scientiam.security.User;

class TaxAuthorityRateProduct {

	String id
	String titleTransferEnumId
	BigDecimal minItemPrice
	BigDecimal minPurchase
	Character taxShipping
	BigDecimal taxPercentage
	Character taxPromotions
	Date fromDate
	Date thruDate
	String description
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	
	ProductCategory productCategory
	TaxAuthority taxAuthority
	TaxAuthorityRateType taxAuthorityRateType
//	ProductStore productStore

	 
	static mapping = {
		id column: "tax_authority_rate_seq_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		titleTransferEnumId nullable: true, maxSize: 36
		minItemPrice nullable: true
		minPurchase nullable: true
		taxShipping nullable: true, maxSize: 1
		taxPercentage nullable: true, scale: 6
		taxPromotions nullable: true, maxSize: 1
		fromDate nullable: true
		thruDate nullable: true
		description nullable: true
		state nullable: false , display:false  
		productCategory nullable: true
		taxAuthority nullable: true
		taxAuthorityRateType nullable: true
		productStore nullable: true
		
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
 
	}
}
