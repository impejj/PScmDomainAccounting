package com.profesys.scientiam.accounting.acctgtrans

 
//import com.profesys.scientiam.accounting.SettlementTerm
import com.profesys.scientiam.accounting.glaccount.GlAccount
import com.profesys.scientiam.accounting.glaccount.GlAccountOrganization
import com.profesys.scientiam.accounting.glaccount.GlAccountType
import com.profesys.scientiam.configuration.StatusItem
import com.profesys.scientiam.configuration.uom.Uom
import com.profesys.scientiam.crm.product.Product
//import com.profesys.scientiam.erp.inventory.InventoryItem
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.erp.party.RoleType
import com.profesys.scientiam.security.User
class AcctgTransEntry  {



	String id

	String description
	String voucherRef
	Party theirParty    //Contraparte de la parte contable (  cliente, proveedores , etc.. )

	Product product       // Producto de la  qtransaccion
	Product theirProduct  //

	BigDecimal amount
	BigDecimal originAmount   //para poder poner los valores en moneda extranjera
	Character debitCreditFlag

	Date dueDate
	String groupId
	String taxId
	Character isSummary

	Uom currency
	AcctgTransEntryType acctgTransEntryType
	Uom originCurrency    //Moneda De Origen
	StatusItem reconcileStatus //ACCTG_ENREC_STATUS
	GlAccount glAccount
	AcctgTrans acctgTrans
	RoleType roleType
	GlAccountType glAccountType

	GlAccountOrganization glAccountOrganization
	Party organizationParty

	String ticket
	//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted


	static mapping = {
		id column: "acctg_trans_entry_id", generator: "assigned"
		version true
	}

	static constraints = {
		id nullable: false, maxSize: 36
		description nullable: true
		voucherRef nullable: true, maxSize: 60
		theirParty nullable: true, maxSize: 36
		product nullable: true, maxSize: 36
		theirProduct nullable: true, maxSize: 36
		amount nullable: true
		originAmount nullable: true
		debitCreditFlag nullable: true, maxSize: 1
		dueDate nullable: true
		groupId nullable: true, maxSize: 36
		taxId nullable: true, maxSize: 36
		isSummary nullable: true , maxSize: 1
	 	originCurrency       nullable: true
		acctgTransEntryType     nullable: true
		originCurrency           nullable: false
		reconcileStatus    		nullable: true
		glAccount    nullable: true
		acctgTrans       nullable: true
		roleType             nullable: true
		glAccountType        nullable: true

		glAccountOrganization       nullable: true
		organizationParty          nullable: true

		ticket                  nullable: false




		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true
	}
}
