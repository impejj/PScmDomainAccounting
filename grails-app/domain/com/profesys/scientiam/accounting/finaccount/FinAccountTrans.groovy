package com.profesys.scientiam.accounting.finaccount

import java.util.Date;

import com.profesys.scientiam.accounting.glaccount.GlReconciliation
import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.configuration.Enumeration
//import com.profesys.scientiam.crm.order.OrderItem
import com.profesys.scientiam.erp.party.Party
//import com.profesys.scientiam.erp.payment.Payment
import com.profesys.scientiam.security.User;

class FinAccountTrans {

	String id
	Date transactionDate
	Date entryDate
	BigDecimal amount
	String comments
 
	Party performedBy
	GlReconciliation glReconciliation
	Enumeration enumeration
//	Payment payment
	StatusItem statusItem
//	OrderItem orderItem
	FinAccountTransType finAccountTransType
	FinAccount finAccount
	Party party
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 
	static mapping = {
		id column: "fin_account_trans_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		transactionDate nullable: true
		entryDate nullable: true
		amount nullable: true
		comments nullable: true
		state nullable: false , display:false
		userCreated nullable: false , display:false
		userUpdated nullable: true , display:false
		dateCreated nullable: true , display:false
		lastUpdated nullable: true , display:false
		dateDeleted nullable: true , display:false
	}
}
