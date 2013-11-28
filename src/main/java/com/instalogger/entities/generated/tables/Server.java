/**
 * This class is generated by jOOQ
 */
package com.instalogger.entities.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Server extends org.jooq.impl.TableImpl<com.instalogger.entities.generated.tables.records.ServerRecord> {

	private static final long serialVersionUID = 719294597;

	/**
	 * The singleton instance of <code>public.server</code>
	 */
	public static final com.instalogger.entities.generated.tables.Server SERVER = new com.instalogger.entities.generated.tables.Server();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.instalogger.entities.generated.tables.records.ServerRecord> getRecordType() {
		return com.instalogger.entities.generated.tables.records.ServerRecord.class;
	}

	/**
	 * The column <code>public.server.id</code>. 
	 */
	public final org.jooq.TableField<com.instalogger.entities.generated.tables.records.ServerRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>public.server.name</code>. 
	 */
	public final org.jooq.TableField<com.instalogger.entities.generated.tables.records.ServerRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false).defaulted(true), this);

	/**
	 * Create a <code>public.server</code> table reference
	 */
	public Server() {
		super("server", com.instalogger.entities.generated.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.server</code> table reference
	 */
	public Server(java.lang.String alias) {
		super(alias, com.instalogger.entities.generated.Public.PUBLIC, com.instalogger.entities.generated.tables.Server.SERVER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.instalogger.entities.generated.tables.records.ServerRecord, java.lang.Integer> getIdentity() {
		return com.instalogger.entities.generated.Keys.IDENTITY_SERVER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.instalogger.entities.generated.tables.records.ServerRecord> getPrimaryKey() {
		return com.instalogger.entities.generated.Keys.SERVER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.instalogger.entities.generated.tables.records.ServerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.instalogger.entities.generated.tables.records.ServerRecord>>asList(com.instalogger.entities.generated.Keys.SERVER_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.instalogger.entities.generated.tables.Server as(java.lang.String alias) {
		return new com.instalogger.entities.generated.tables.Server(alias);
	}
}
