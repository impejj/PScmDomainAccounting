package com.profesys.scientiam.accounting.acctgtrans


import com.profesys.scientiam.accounting.finaccount.FinAccountTrans
import com.profesys.scientiam.accounting.glaccount.GlFiscalType
import com.profesys.scientiam.accounting.glaccount.GlJournal
import com.profesys.scientiam.configuration.StatusItem
//import com.profesys.scientiam.crm.invoicing.Invoice
//import com.profesys.scientiam.erp.fixedasset.FixedAsset
//import com.profesys.scientiam.erp.inventory.InventoryItem
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.RoleType
//import com.profesys.scientiam.erp.payment.Payment
//import com.profesys.scientiam.logistic.Shipment
//import com.profesys.scientiam.logistic.ShipmentReceipt
import com.profesys.scientiam.security.User
class AcctgTrans {


	String id
	String description
	Date transactionDate

	String isPosted       //Y C-Contabilizado  ;  Asiento no modificable hacer contraasiento)
	Date postedDate

	BigDecimal totalCredit
	BigDecimal totalDebit

	String isBalanced    //si no esta balanceado no puede postearse
	String isManual      // Para los asientos que no surgen de operaciones en los diferentes modulos
	String closeJournal      // Para identificar los asientos de cierre de cada periodo


	Date scheduledPostingDate  //Para asientos con fecha futura
	Party party
	RoleType roleType

	String ticket

	String    reverseOriginal    //Número de asiento al que reversa

	String  internalNumber
	Integer  journalNumber
//	InventoryItemVariance inventoryItemVariance
	StatusItem statusItem   /*  ACCTG_ENREC_STATUS
 									Estado de Reconciliación
		                         */

//	Shipment shipment
	GlJournal glJournal
//	Invoice invoice
//	Payment payment
	GlFiscalType glFiscalType
	AcctgTransType acctgTransType
//	FixedAsset fixedAsset
	String voucherRef
	Date voucherDate
	String theirAcctgTransId
//	ShipmentReceipt shipmentReceipt
//	InventoryItem inventoryItem
	FinAccountTrans finAccountTrans



//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted

//	static belongsTo = [AcctgTransType, FinAccountTrans, FixedAsset, GlFiscalType, GlJournal, InventoryItem, InventoryItemVariance, Invoice, Party, Payment, PhysicalInventory, RoleType, Shipment, ShipmentReceipt, StatusItem, WorkEffort]

	static mapping = {
		id column: "acctg_trans_id", generator: "assigned"
		// ,type: UUIDUserType, sqlType: 'varbinary(16)'
		version true
	}

	static constraints = {
		id maxSize: 36
		description nullable: true
		transactionDate nullable: true
		isPosted nullable: true, maxSize: 1

		isBalanced nullable: true, maxSize: 1
		isManual nullable: true, maxSize: 1

		closeJournal nullable: true, maxSize: 1

		reverseOriginal     nullable: true
		totalDebit     nullable: true
		totalCredit     nullable: true
//		shipmentReceipt nullable: true
//		inventoryItem nullable: true
		finAccountTrans nullable: true
		glFiscalType nullable: true
		acctgTransType nullable: true
//		shipment nullable: true
//		fixedAsset nullable: true
		glJournal nullable: true
//		invoice nullable: true
//		payment nullable: true
		postedDate nullable: true
		scheduledPostingDate nullable: true
		voucherRef nullable: true, maxSize: 60
		voucherDate nullable: true
		theirAcctgTransId nullable: true, maxSize: 60
		ticket   nullable: false
		journalNumber nullable: true
		internalNumber nullable: true
		party nullable: true
		roleType nullable: true



		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true
	}
}
