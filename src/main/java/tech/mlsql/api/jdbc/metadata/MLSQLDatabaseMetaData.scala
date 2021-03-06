package tech.mlsql.api.jdbc.metadata

import java.sql.{Connection, DatabaseMetaData, ResultSet, RowIdLifetime}

import tech.mlsql.api.jdbc.MLSQLConst

/**
 * 12/6/2020 WilliamZhu(allwefantasy@gmail.com)
 */
class MLSQLDatabaseMetaData(userName: String, url: String) extends DatabaseMetaData {


  override def getDriverName: String = MLSQLConst.DRIVER_NAME

  override def getDriverVersion: String = s"${getDriverMajorVersion}.${getDriverMinorVersion}"

  override def getDriverMajorVersion: Int = MLSQLConst.MAJOR_VERSION

  override def getDriverMinorVersion: Int = MLSQLConst.MINOR_VERSION

  override def getURL: String = url

  override def getUserName: String = userName

  override def isReadOnly: Boolean = true


  override def allProceduresAreCallable(): Boolean = ???

  override def allTablesAreSelectable(): Boolean = ???

  override def nullsAreSortedHigh(): Boolean = ???

  override def nullsAreSortedLow(): Boolean = ???

  override def nullsAreSortedAtStart(): Boolean = ???

  override def nullsAreSortedAtEnd(): Boolean = ???

  override def getDatabaseProductName: String = ???

  override def getDatabaseProductVersion: String = ???


  override def usesLocalFiles(): Boolean = ???

  override def usesLocalFilePerTable(): Boolean = ???

  override def supportsMixedCaseIdentifiers(): Boolean = ???

  override def storesUpperCaseIdentifiers(): Boolean = ???

  override def storesLowerCaseIdentifiers(): Boolean = ???

  override def storesMixedCaseIdentifiers(): Boolean = ???

  override def supportsMixedCaseQuotedIdentifiers(): Boolean = ???

  override def storesUpperCaseQuotedIdentifiers(): Boolean = ???

  override def storesLowerCaseQuotedIdentifiers(): Boolean = ???

  override def storesMixedCaseQuotedIdentifiers(): Boolean = ???

  override def getIdentifierQuoteString: String = ???

  override def getSQLKeywords: String = ???

  override def getNumericFunctions: String = ???

  override def getStringFunctions: String = ???

  override def getSystemFunctions: String = ???

  override def getTimeDateFunctions: String = ???

  override def getSearchStringEscape: String = ???

  override def getExtraNameCharacters: String = ???

  override def supportsAlterTableWithAddColumn(): Boolean = ???

  override def supportsAlterTableWithDropColumn(): Boolean = ???

  override def supportsColumnAliasing(): Boolean = ???

  override def nullPlusNonNullIsNull(): Boolean = ???

  override def supportsConvert(): Boolean = ???

  override def supportsConvert(fromType: Int, toType: Int): Boolean = ???

  override def supportsTableCorrelationNames(): Boolean = ???

  override def supportsDifferentTableCorrelationNames(): Boolean = ???

  override def supportsExpressionsInOrderBy(): Boolean = ???

  override def supportsOrderByUnrelated(): Boolean = ???

  override def supportsGroupBy(): Boolean = ???

  override def supportsGroupByUnrelated(): Boolean = ???

  override def supportsGroupByBeyondSelect(): Boolean = ???

  override def supportsLikeEscapeClause(): Boolean = ???

  override def supportsMultipleResultSets(): Boolean = ???

  override def supportsMultipleTransactions(): Boolean = ???

  override def supportsNonNullableColumns(): Boolean = ???

  override def supportsMinimumSQLGrammar(): Boolean = ???

  override def supportsCoreSQLGrammar(): Boolean = ???

  override def supportsExtendedSQLGrammar(): Boolean = ???

  override def supportsANSI92EntryLevelSQL(): Boolean = ???

  override def supportsANSI92IntermediateSQL(): Boolean = ???

  override def supportsANSI92FullSQL(): Boolean = ???

  override def supportsIntegrityEnhancementFacility(): Boolean = ???

  override def supportsOuterJoins(): Boolean = ???

  override def supportsFullOuterJoins(): Boolean = ???

  override def supportsLimitedOuterJoins(): Boolean = ???

  override def getSchemaTerm: String = ???

  override def getProcedureTerm: String = ???

  override def getCatalogTerm: String = ???

  override def isCatalogAtStart: Boolean = ???

  override def getCatalogSeparator: String = ???

  override def supportsSchemasInDataManipulation(): Boolean = ???

  override def supportsSchemasInProcedureCalls(): Boolean = ???

  override def supportsSchemasInTableDefinitions(): Boolean = ???

  override def supportsSchemasInIndexDefinitions(): Boolean = ???

  override def supportsSchemasInPrivilegeDefinitions(): Boolean = ???

  override def supportsCatalogsInDataManipulation(): Boolean = ???

  override def supportsCatalogsInProcedureCalls(): Boolean = ???

  override def supportsCatalogsInTableDefinitions(): Boolean = ???

  override def supportsCatalogsInIndexDefinitions(): Boolean = ???

  override def supportsCatalogsInPrivilegeDefinitions(): Boolean = ???

  override def supportsPositionedDelete(): Boolean = ???

  override def supportsPositionedUpdate(): Boolean = ???

  override def supportsSelectForUpdate(): Boolean = ???

  override def supportsStoredProcedures(): Boolean = ???

  override def supportsSubqueriesInComparisons(): Boolean = ???

  override def supportsSubqueriesInExists(): Boolean = ???

  override def supportsSubqueriesInIns(): Boolean = ???

  override def supportsSubqueriesInQuantifieds(): Boolean = ???

  override def supportsCorrelatedSubqueries(): Boolean = ???

  override def supportsUnion(): Boolean = ???

  override def supportsUnionAll(): Boolean = ???

  override def supportsOpenCursorsAcrossCommit(): Boolean = ???

  override def supportsOpenCursorsAcrossRollback(): Boolean = ???

  override def supportsOpenStatementsAcrossCommit(): Boolean = ???

  override def supportsOpenStatementsAcrossRollback(): Boolean = ???

  override def getMaxBinaryLiteralLength: Int = ???

  override def getMaxCharLiteralLength: Int = ???

  override def getMaxColumnNameLength: Int = ???

  override def getMaxColumnsInGroupBy: Int = ???

  override def getMaxColumnsInIndex: Int = ???

  override def getMaxColumnsInOrderBy: Int = ???

  override def getMaxColumnsInSelect: Int = ???

  override def getMaxColumnsInTable: Int = ???

  override def getMaxConnections: Int = ???

  override def getMaxCursorNameLength: Int = ???

  override def getMaxIndexLength: Int = ???

  override def getMaxSchemaNameLength: Int = ???

  override def getMaxProcedureNameLength: Int = ???

  override def getMaxCatalogNameLength: Int = ???

  override def getMaxRowSize: Int = ???

  override def doesMaxRowSizeIncludeBlobs(): Boolean = ???

  override def getMaxStatementLength: Int = ???

  override def getMaxStatements: Int = ???

  override def getMaxTableNameLength: Int = ???

  override def getMaxTablesInSelect: Int = ???

  override def getMaxUserNameLength: Int = ???

  override def getDefaultTransactionIsolation: Int = ???

  override def supportsTransactions(): Boolean = ???

  override def supportsTransactionIsolationLevel(level: Int): Boolean = ???

  override def supportsDataDefinitionAndDataManipulationTransactions(): Boolean = ???

  override def supportsDataManipulationTransactionsOnly(): Boolean = ???

  override def dataDefinitionCausesTransactionCommit(): Boolean = ???

  override def dataDefinitionIgnoredInTransactions(): Boolean = ???

  override def getProcedures(catalog: String, schemaPattern: String, procedureNamePattern: String): ResultSet = ???

  override def getProcedureColumns(catalog: String, schemaPattern: String, procedureNamePattern: String, columnNamePattern: String): ResultSet = ???

  override def getTables(catalog: String, schemaPattern: String, tableNamePattern: String, types: Array[String]): ResultSet = ???

  override def getSchemas: ResultSet = ???

  override def getCatalogs: ResultSet = ???

  override def getTableTypes: ResultSet = ???

  override def getColumns(catalog: String, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): ResultSet = ???

  override def getColumnPrivileges(catalog: String, schema: String, table: String, columnNamePattern: String): ResultSet = ???

  override def getTablePrivileges(catalog: String, schemaPattern: String, tableNamePattern: String): ResultSet = ???

  override def getBestRowIdentifier(catalog: String, schema: String, table: String, scope: Int, nullable: Boolean): ResultSet = ???

  override def getVersionColumns(catalog: String, schema: String, table: String): ResultSet = ???

  override def getPrimaryKeys(catalog: String, schema: String, table: String): ResultSet = ???

  override def getImportedKeys(catalog: String, schema: String, table: String): ResultSet = ???

  override def getExportedKeys(catalog: String, schema: String, table: String): ResultSet = ???

  override def getCrossReference(parentCatalog: String, parentSchema: String, parentTable: String, foreignCatalog: String, foreignSchema: String, foreignTable: String): ResultSet = ???

  override def getTypeInfo: ResultSet = ???

  override def getIndexInfo(catalog: String, schema: String, table: String, unique: Boolean, approximate: Boolean): ResultSet = ???

  override def supportsResultSetType(`type`: Int): Boolean = ???

  override def supportsResultSetConcurrency(`type`: Int, concurrency: Int): Boolean = ???

  override def ownUpdatesAreVisible(`type`: Int): Boolean = ???

  override def ownDeletesAreVisible(`type`: Int): Boolean = ???

  override def ownInsertsAreVisible(`type`: Int): Boolean = ???

  override def othersUpdatesAreVisible(`type`: Int): Boolean = ???

  override def othersDeletesAreVisible(`type`: Int): Boolean = ???

  override def othersInsertsAreVisible(`type`: Int): Boolean = ???

  override def updatesAreDetected(`type`: Int): Boolean = ???

  override def deletesAreDetected(`type`: Int): Boolean = ???

  override def insertsAreDetected(`type`: Int): Boolean = ???

  override def supportsBatchUpdates(): Boolean = ???

  override def getUDTs(catalog: String, schemaPattern: String, typeNamePattern: String, types: Array[Int]): ResultSet = ???

  override def getConnection: Connection = ???

  override def supportsSavepoints(): Boolean = ???

  override def supportsNamedParameters(): Boolean = ???

  override def supportsMultipleOpenResults(): Boolean = ???

  override def supportsGetGeneratedKeys(): Boolean = ???

  override def getSuperTypes(catalog: String, schemaPattern: String, typeNamePattern: String): ResultSet = ???

  override def getSuperTables(catalog: String, schemaPattern: String, tableNamePattern: String): ResultSet = ???

  override def getAttributes(catalog: String, schemaPattern: String, typeNamePattern: String, attributeNamePattern: String): ResultSet = ???

  override def supportsResultSetHoldability(holdability: Int): Boolean = ???

  override def getResultSetHoldability: Int = ???

  override def getDatabaseMajorVersion: Int = ???

  override def getDatabaseMinorVersion: Int = ???

  override def getJDBCMajorVersion: Int = ???

  override def getJDBCMinorVersion: Int = ???

  override def getSQLStateType: Int = ???

  override def locatorsUpdateCopy(): Boolean = ???

  override def supportsStatementPooling(): Boolean = ???

  override def getRowIdLifetime: RowIdLifetime = ???

  override def getSchemas(catalog: String, schemaPattern: String): ResultSet = ???

  override def supportsStoredFunctionsUsingCallSyntax(): Boolean = ???

  override def autoCommitFailureClosesAllResultSets(): Boolean = ???

  override def getClientInfoProperties: ResultSet = ???

  override def getFunctions(catalog: String, schemaPattern: String, functionNamePattern: String): ResultSet = ???

  override def getFunctionColumns(catalog: String, schemaPattern: String, functionNamePattern: String, columnNamePattern: String): ResultSet = ???

  override def getPseudoColumns(catalog: String, schemaPattern: String, tableNamePattern: String, columnNamePattern: String): ResultSet = ???

  override def generatedKeyAlwaysReturned(): Boolean = ???

  override def unwrap[T](iface: Class[T]): T = ???

  override def isWrapperFor(iface: Class[_]): Boolean = ???
}
