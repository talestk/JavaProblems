package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    private HashMap<Integer,List<I>> page;
    // declare variables
    private List<I> collection;
    private int pages;
    private int itemsPerPage = 0;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
        this.pages = (int) Math.ceil((double) collection.size() / itemsPerPage);
        this.page = new HashMap();
        for (int i = 0; i < this.pages; i++)
            this.page.put( i, collection.subList( i * this.itemsPerPage, Math.min(( i + 1 ) * this.itemsPerPage, collection.size())));
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return pages;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        List<I> currentPage = this.page.get(pageIndex);
        if (currentPage == null)
            return -1;
        return currentPage.size();
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex < 0 || itemIndex >= this.collection.size())
            return -1;
        return itemIndex/this.itemsPerPage;
    }
}