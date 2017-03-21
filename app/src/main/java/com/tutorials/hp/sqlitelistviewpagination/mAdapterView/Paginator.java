package com.tutorials.hp.sqlitelistviewpagination.mAdapterView;


import com.tutorials.hp.sqlitelistviewpagination.mDB.Spacecraft;

import java.util.ArrayList;
import java.util.List;

import co.uk.rushorm.core.RushSearch;

/**
 * Created by Oclemy on 3/14/2017 for ProgrammingWizards Channel and http://www.camposha.info.
 */

public class Paginator {


    private int TOTAL_NUM_ITEMS=0;
    private int ITEMS_PER_PAGE=0;

    public Paginator() {
        try
        {
            TOTAL_NUM_ITEMS= (int) new RushSearch().count(Spacecraft.class);
            ITEMS_PER_PAGE=5;
        }catch (Exception e)
        {

        }

    }

    /*
    TOTAL NUMBER OF PAGES
     */
    public int getTotalPages()
    {
        return TOTAL_NUM_ITEMS/ITEMS_PER_PAGE;
    }

    /*
    CURRENT PAGE SPACECRAFTS LIST
     */
    public List<Spacecraft> getCurrentSpacecrafts(int currentPage)
    {
        int startItem=currentPage*ITEMS_PER_PAGE;

        List<Spacecraft> currentSpacecrafts=new ArrayList<>();
        try
        {
            currentSpacecrafts=new RushSearch().limit(ITEMS_PER_PAGE).offset(startItem).find(Spacecraft.class);

        }catch (Exception e)
        {
            e.printStackTrace();
        }


        return currentSpacecrafts;
    }

}
