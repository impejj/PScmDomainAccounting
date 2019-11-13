package com.profesys.scientiam.accounting.glaccount

 import com.profesys.scientiam.accounting.acctgtrans.AcctgTrans
import com.profesys.scientiam.security.User

class GlReconciliationEntry  {

	GlReconciliation glReconciliation
	 
	 AcctgTrans acctgTrans
	 
	BigDecimal reconciledAmount
 
//	AcctgTransEntry acctgTransEntry

	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
 
 

	static constraints = {
//		acctgTransEntrySeqId maxSize: 36
		reconciledAmount nullable: true
	 state         nullable: false
	  userCreated   nullable: false
	  userUpdated   nullable: false
	  dateCreated   nullable: false
	  lastUpdated   nullable: false
	  dateDeleted   nullable: true
	}
}
