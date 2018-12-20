package entity;

public class PageEntity
{
    private Integer currentPage;
    private Integer startPage;
    private Integer pageSize;
    private Integer getCurrentPage;

    public Integer getCurrentPage() {
        if(currentPage == null)
            currentPage = 1;
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public int getStartPage() {
        if(startPage == null)
            startPage = 0;
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public int getPageSize() {
        if(pageSize == null)
            pageSize = 0;
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getGetCurrentPage() {
        return getCurrentPage;
    }

    public void setGetCurrentPage(Integer getCurrentPage){
        this.getCurrentPage = getCurrentPage;
    }
}
