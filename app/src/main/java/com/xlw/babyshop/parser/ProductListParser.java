package com.xlw.babyshop.parser;

import com.alibaba.fastjson.JSON;
import com.xlw.babyshop.model.ProductListModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by xinliwei on 2015/7/20.
 */
public class ProductListParser extends BaseJSONParser<List<ProductListModel>> {

    @Override
    public List<ProductListModel> parseJSON(String paramString) throws JSONException {
        if(super.checkResponse(paramString)!=null){
            JSONObject jsonObject = new JSONObject(paramString);
            String productlist = jsonObject.getString("productlist");
            return JSON.parseArray(productlist, ProductListModel.class);
        }else{
            return null;
        }
    }

}
