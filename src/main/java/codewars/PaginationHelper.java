package codewars;

import java.util.Arrays;
import java.util.List;

/**
 * Created by InvincibleDudu on 2020-09-17 at 10:48:07
 * <p>
 * finished at 09-17 13:44:18
 */

public class PaginationHelper<I> {

    List<I> list;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        list = collection;
        this.itemsPerPage = itemsPerPage;
    }

    public static void main(String[] args) {
        var helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
//        var helper = new PaginationHelper<>(Collections.emptyList(), 4);
        System.out.println(helper.pageCount()); //should == 2
        System.out.println(helper.itemCount());//should == 6
        System.out.println(helper.pageItemCount(0)); //should == 4
        System.out.println(helper.pageItemCount(1)); // last page - should == 2
        System.out.println(helper.pageItemCount(2)); // should == -1 since the page is invalid
        // pageIndex takes an item index) and returns the page that it belongs on
        System.out.println(helper.pageIndex(6)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(5)); //should == 1 (zero based index)
        System.out.println(helper.pageIndex(2)); //should == 0
        System.out.println(helper.pageIndex(1)); //should == 0
        System.out.println(helper.pageIndex(0)); //should == 0
        System.out.println(helper.pageIndex(20)); //should == -1
        System.out.println(helper.pageIndex(-10)); //should == -1
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return list.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (list.size() == 0)
            return 0;
        return list.size() / itemsPerPage + 1;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex + 1 == pageCount())
            return list.size() % itemsPerPage;
        else if (pageIndex + 1 < pageCount())
            return itemsPerPage;
        return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        itemIndex++;
        if (itemIndex <= list.size() && itemIndex > 0)
            return itemIndex / itemsPerPage;
        else
            return -1;
    }
}
