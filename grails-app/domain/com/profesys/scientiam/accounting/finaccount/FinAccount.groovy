package com.profesys.scientiam.accounting.finaccount

import java.util.Date;

import com.profesys.scientiam.accounting.glaccount.GlAccount
import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.erp.party.Party
//import com.profesys.scientiam.erp.payment.PaymentMethod
import com.profesys.scientiam.security.User;

class FinAccount {

	String id
	String statusId
	String finAccountName
	String finAccountCode
	String finAccountPin
	Date fromDate
	Date thruDate
	Character isRefundable
	BigDecimal replenishLevel
	BigDecimal actualBalance
	BigDecimal availableBalance
 
	FinAccountType finAccountType
	Uom uom
	Party ownerParty
	Party organizationParty
//	PaymentMethod paymentMethod
	GlAccount glAccount
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 
	 
	static mapping = {
		id column: "fin_account_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		statusId nullable: true, maxSize: 36
		finAccountName nullable: true, maxSize: 100
		finAccountCode nullable: true
		finAccountPin nullable: true
		fromDate nullable: true
		thruDate nullable: true
		isRefundable nullable: true, maxSize: 1
		replenishLevel nullable: true
		actualBalance nullable: true
		availableBalance nullable: true
 		 		     state nullable: false , display:false  
		   userCreated nullable: false , display:false  
		   userUpdated nullable: true , display:false  
		   dateCreated nullable: true , display:false 
		   lastUpdated nullable: true , display:false  
		   dateDeleted nullable: true , display:false  
	}
}
