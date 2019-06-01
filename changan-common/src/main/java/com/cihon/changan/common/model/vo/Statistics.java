package com.cihon.changan.common.model.vo;

public class Statistics {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.TABLE_CATALOG
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String tableCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.TABLE_SCHEMA
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.TABLE_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.NON_UNIQUE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private Integer nonUnique;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.INDEX_SCHEMA
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String indexSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.INDEX_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String indexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.SEQ_IN_INDEX
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private Integer seqInIndex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.COLUMN_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String columnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.COLLATION
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String collation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.CARDINALITY
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private Long cardinality;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.SUB_PART
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private Long subPart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.NULLABLE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String nullable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.INDEX_TYPE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String indexType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.COMMENT
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.INDEX_COMMENT
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String indexComment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.IS_VISIBLE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private String isVisible;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATISTICS.PACKED
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    private byte[] packed;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.TABLE_CATALOG
     *
     * @return the value of STATISTICS.TABLE_CATALOG
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.TABLE_CATALOG
     *
     * @param tableCatalog the value for STATISTICS.TABLE_CATALOG
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog == null ? null : tableCatalog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.TABLE_SCHEMA
     *
     * @return the value of STATISTICS.TABLE_SCHEMA
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.TABLE_SCHEMA
     *
     * @param tableSchema the value for STATISTICS.TABLE_SCHEMA
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.TABLE_NAME
     *
     * @return the value of STATISTICS.TABLE_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.TABLE_NAME
     *
     * @param tableName the value for STATISTICS.TABLE_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.NON_UNIQUE
     *
     * @return the value of STATISTICS.NON_UNIQUE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public Integer getNonUnique() {
        return nonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.NON_UNIQUE
     *
     * @param nonUnique the value for STATISTICS.NON_UNIQUE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.INDEX_SCHEMA
     *
     * @return the value of STATISTICS.INDEX_SCHEMA
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getIndexSchema() {
        return indexSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.INDEX_SCHEMA
     *
     * @param indexSchema the value for STATISTICS.INDEX_SCHEMA
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setIndexSchema(String indexSchema) {
        this.indexSchema = indexSchema == null ? null : indexSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.INDEX_NAME
     *
     * @return the value of STATISTICS.INDEX_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.INDEX_NAME
     *
     * @param indexName the value for STATISTICS.INDEX_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.SEQ_IN_INDEX
     *
     * @return the value of STATISTICS.SEQ_IN_INDEX
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public Integer getSeqInIndex() {
        return seqInIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.SEQ_IN_INDEX
     *
     * @param seqInIndex the value for STATISTICS.SEQ_IN_INDEX
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setSeqInIndex(Integer seqInIndex) {
        this.seqInIndex = seqInIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.COLUMN_NAME
     *
     * @return the value of STATISTICS.COLUMN_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.COLUMN_NAME
     *
     * @param columnName the value for STATISTICS.COLUMN_NAME
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.COLLATION
     *
     * @return the value of STATISTICS.COLLATION
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getCollation() {
        return collation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.COLLATION
     *
     * @param collation the value for STATISTICS.COLLATION
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setCollation(String collation) {
        this.collation = collation == null ? null : collation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.CARDINALITY
     *
     * @return the value of STATISTICS.CARDINALITY
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public Long getCardinality() {
        return cardinality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.CARDINALITY
     *
     * @param cardinality the value for STATISTICS.CARDINALITY
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setCardinality(Long cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.SUB_PART
     *
     * @return the value of STATISTICS.SUB_PART
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public Long getSubPart() {
        return subPart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.SUB_PART
     *
     * @param subPart the value for STATISTICS.SUB_PART
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setSubPart(Long subPart) {
        this.subPart = subPart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.NULLABLE
     *
     * @return the value of STATISTICS.NULLABLE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getNullable() {
        return nullable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.NULLABLE
     *
     * @param nullable the value for STATISTICS.NULLABLE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setNullable(String nullable) {
        this.nullable = nullable == null ? null : nullable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.INDEX_TYPE
     *
     * @return the value of STATISTICS.INDEX_TYPE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getIndexType() {
        return indexType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.INDEX_TYPE
     *
     * @param indexType the value for STATISTICS.INDEX_TYPE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setIndexType(String indexType) {
        this.indexType = indexType == null ? null : indexType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.COMMENT
     *
     * @return the value of STATISTICS.COMMENT
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.COMMENT
     *
     * @param comment the value for STATISTICS.COMMENT
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.INDEX_COMMENT
     *
     * @return the value of STATISTICS.INDEX_COMMENT
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getIndexComment() {
        return indexComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.INDEX_COMMENT
     *
     * @param indexComment the value for STATISTICS.INDEX_COMMENT
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setIndexComment(String indexComment) {
        this.indexComment = indexComment == null ? null : indexComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.IS_VISIBLE
     *
     * @return the value of STATISTICS.IS_VISIBLE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public String getIsVisible() {
        return isVisible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.IS_VISIBLE
     *
     * @param isVisible the value for STATISTICS.IS_VISIBLE
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible == null ? null : isVisible.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATISTICS.PACKED
     *
     * @return the value of STATISTICS.PACKED
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public byte[] getPacked() {
        return packed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATISTICS.PACKED
     *
     * @param packed the value for STATISTICS.PACKED
     *
     * @mbg.generated Sat Jun 01 14:15:45 CST 2019
     */
    public void setPacked(byte[] packed) {
        this.packed = packed;
    }
}