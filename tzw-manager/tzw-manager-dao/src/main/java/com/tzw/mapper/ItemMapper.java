package com.tzw.mapper;

import com.tzw.pojo.Item;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/25.
 */
public interface ItemMapper {

    List<Item> itemList();

    List<Item> selectByMap(Map<String,Object> map);

    int  peopleNum(BigInteger id);


}
