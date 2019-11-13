package com.profesys.scientiam.accounting.glaccount
import com.profesys.scientiam.erp.party.Party
import com.profesys.scientiam.security.User
class GlJournal {

	String id
	String glJournalName
	Character isPosted
	Date postedDate
 
	Party party
//Seguridad & Auditoria
	Integer        state   // 0-Borrado 1-ok  2-modificado
	User  	 userCreated
	User  	 userUpdated
	Date     dateCreated  //Date  fechaalta
	Date     lastUpdated  //Date  fechaactualizacion
	Date     dateDeleted
	 

	static mapping = {
		id column: "gl_journal_id", generator: "assigned"
		version true
	}

	static constraints = {
		id maxSize: 36
		glJournalName nullable: true, maxSize: 100
		isPosted nullable: true, maxSize: 1
		postedDate nullable: true
		state         nullable: false
		userCreated   nullable: false
		userUpdated   nullable: false
		dateCreated   nullable: false
		lastUpdated   nullable: false
		dateDeleted   nullable: true
	}
}
