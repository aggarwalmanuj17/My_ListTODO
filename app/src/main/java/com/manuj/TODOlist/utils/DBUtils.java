package com.manuj.TODOlist.utils;

import com.activeandroid.query.Select;
import com.manuj.TODOlist.models.Item;

import java.util.List;

public class DBUtils {

    public static void writeOne(Item item) {
        item.save();
    }

    public static List<Item> readAll() {
        return new Select()
                .from(Item.class)
                .execute();
    }

}
