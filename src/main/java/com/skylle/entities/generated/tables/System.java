/**
 * This class is generated by jOOQ
 */
package com.skylle.entities.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class System extends org.jooq.impl.TableImpl<com.skylle.entities.generated.tables.records.SystemRecord> {

	private static final long serialVersionUID = -849512206;

	/**
	 * The singleton instance of <code>public.system</code>
	 */
	public static final com.skylle.entities.generated.tables.System SYSTEM = new com.skylle.entities.generated.tables.System();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.skylle.entities.generated.tables.records.SystemRecord> getRecordType() {
		return com.skylle.entities.generated.tables.records.SystemRecord.class;
	}

	/**
	 * The column <code>public.system.id</code>. 
	 */
	public final org.jooq.TableField<com.skylle.entities.generated.tables.records.SystemRecord, java.lang.String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this);

	/**
	 * The column <code>public.system.value</code>. 
	 */
	public final org.jooq.TableField<com.skylle.entities.generated.tables.records.SystemRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this);

	/**
	 * Create a <code>public.system</code> table reference
	 */
	public System() {
		super("system", com.skylle.entities.generated.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.system</code> table reference
	 */
	public System(java.lang.String alias) {
		super(alias, com.skylle.entities.generated.Public.PUBLIC, com.skylle.entities.generated.tables.System.SYSTEM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.skylle.entities.generated.tables.System as(java.lang.String alias) {
		return new com.skylle.entities.generated.tables.System(alias);
	}
}
