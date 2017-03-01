package com.szl.decp.customer.model;

import java.io.Serializable;
import java.util.List;

/**
 * Title: QueryParam.java<br>
 * Description: 閫氱敤鐨勬煡璇㈠弬鏁板璞�<br>
 * Copyright: Copyright (c) 2015<br>
 * Company: <br>
 * 
 * @author undyliu 2015骞�11鏈�9鏃�
 */
public class QueryParam  implements Serializable {

    private static final long serialVersionUID = 2926723122405744749L;

    private String searchText;

    private int startRecord;

    private int pageSize;

    private int pageNumber;

    private String sortName;

    private String sortOrder;

    /**
     * 鏁版嵁琛ㄤ腑鐨勫垪鍚�
     */
    private String columnName;
    /**
     * 鏁版嵁琛ㄤ腑鐨勫垪瀵瑰簲鐨勬暟鎹泦
     */
    private List<?> columnValueList;

    public int getStartRecord () {
        return startRecord;
    }

    public void setStartRecord (int startRecord) {
        this.startRecord = this.pageSize * (this.pageNumber - 1);
        /*this.startRecord = startRecord;*/
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
        this.setStartRecord(0);
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        this.setStartRecord(0);
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public List<?> getColumnValueList() {
        return columnValueList;
    }

    public void setColumnValueList(List<?> columnValueList) {
        this.columnValueList = columnValueList;
    }
}
