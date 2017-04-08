package cym.ssm.util;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenyuming on 2017/4/2.
 */
public class Pager<T> implements Serializable {
    private int pageSize;//每页显示多少条记录
    private int currentPage;//当前第几条数据
    private int totalRecord;//一共多少条记录
    private int totalPage;//一共多少页记录
    private List<T> dataList;//要显示的数据

    public Pager() {
        super();
    }

    public Pager(int pageSize, int currentPage, int totalRecord, int totalPage, List<T> dataList) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.dataList = dataList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
