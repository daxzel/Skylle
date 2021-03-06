/**
 * This class is generated by jOOQ
 */
package com.instalogger.entities.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RepeatedMessageRecord extends org.jooq.impl.UpdatableRecordImpl<com.instalogger.entities.generated.tables.records.RepeatedMessageRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 788924384;

	/**
	 * Setter for <code>public.repeated_message.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.repeated_message.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.repeated_message.server_id</code>. 
	 */
	public void setServerId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.repeated_message.server_id</code>. 
	 */
	public java.lang.Integer getServerId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.repeated_message.hash</code>. 
	 */
	public void setHash(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.repeated_message.hash</code>. 
	 */
	public java.lang.Integer getHash() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.repeated_message.text</code>. 
	 */
	public void setText(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.repeated_message.text</code>. 
	 */
	public java.lang.String getText() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.repeated_message.log_level</code>. 
	 */
	public void setLogLevel(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.repeated_message.log_level</code>. 
	 */
	public java.lang.Integer getLogLevel() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.repeated_message.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.repeated_message.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.repeated_message.count</code>. 
	 */
	public void setCount(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.repeated_message.count</code>. 
	 */
	public java.lang.Integer getCount() {
		return (java.lang.Integer) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE.SERVER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE.HASH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE.TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE.LOG_LEVEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE.COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getServerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getHash();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getLogLevel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getCount();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RepeatedMessageRecord
	 */
	public RepeatedMessageRecord() {
		super(com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE);
	}

	/**
	 * Create a detached, initialised RepeatedMessageRecord
	 */
	public RepeatedMessageRecord(java.lang.Integer id, java.lang.Integer serverId, java.lang.Integer hash, java.lang.String text, java.lang.Integer logLevel, java.lang.String name, java.lang.Integer count) {
		super(com.instalogger.entities.generated.tables.RepeatedMessage.REPEATED_MESSAGE);

		setValue(0, id);
		setValue(1, serverId);
		setValue(2, hash);
		setValue(3, text);
		setValue(4, logLevel);
		setValue(5, name);
		setValue(6, count);
	}
}
