package com.mimo.indiemoa.classes.utils.factory;

import com.google.gson.Gson;
import com.mimo.indiemoa.model.component.DibsMembersModel;
import com.mimo.indiemoa.model.product.PostScriptModel;
import com.mimo.indiemoa.model.product.PostScriptsModel;

import java.util.ArrayList;

/**
 * Created by mimoPC on 2016-12-22.
 */

public class DummyModelFactory {

    private static class SingleTon {
        private static final DummyModelFactory INSTANCE = new DummyModelFactory();
    }

    private DummyModelFactory() {

    }

    public static DummyModelFactory getInstance() {
        return SingleTon.INSTANCE;
    }

    public String dummyConnect(String url)
    {
        Gson gson = new Gson();

        String[] tokenizer = url.split("/");

        if(tokenizer[0].equals("Product")) {
            if(tokenizer[1].equals("2"))
                return gson.toJson(DummyDataFactory.getInstance().getProductPreOrderDummyData());
            else
                return gson.toJson(DummyDataFactory.getInstance().getProductDummyData());
        }

        switch (tokenizer[0]) {
            case "Recommend": return gson.toJson(DummyDataFactory.getInstance().getRecommendDummyData());
            case "PreOrder": return gson.toJson(DummyDataFactory.getInstance().getPreOrderDummyData());

            case "Popular":
            case "RecentlyView":
            case "Recently":
            case "Search":
            case "AuthorProduct":
            case "AuthorPreOrder":
            case "DibsProduct":
                return gson.toJson(DummyDataFactory.getInstance().getPopularDummyData());

            case "Notification":
            case "Event":
            case "FAQ":
                return gson.toJson(DummyDataFactory.getInstance().getNotificationDummyData());

            case "Notice":
                return gson.toJson(DummyDataFactory.getInstance().getNoticeListModelDummyData());

            case "Member": return gson.toJson(DummyDataFactory.getInstance().getMemberDummyData());

            case "PostScriptsModel": {
                if(url.contains("MemberId")) {
                    return gson.toJson(new PostScriptsModel(1, 1, 1, new ArrayList<PostScriptModel>()));
                }else {
                    return gson.toJson(DummyDataFactory.getInstance().getPostScriptsDummyData());
                }
            }

            case "DibsAuthor": return gson.toJson(DummyDataFactory.getInstance().getDibsAuthorDummyData());
            case "Keyword": return gson.toJson(DummyDataFactory.getInstance().getPopularKeywordDummyData());

            case "Category": return gson.toJson(DummyDataFactory.getInstance().getCategoryDummyData());

            case "OrderDelivery": return gson.toJson(DummyDataFactory.getInstance().getOrderDeliveryDummyDate());
        }
        // else case
        if (tokenizer[0].equals("DibsMembersModel") || tokenizer[0].equals("Sponsor")) {
            String[] tokenize = url.split("/");
            int count = Integer.parseInt(tokenize[1]);
            int nowPage = Integer.parseInt(tokenize[2]);
            int countPerPage = Integer.parseInt(tokenize[3]);
            int makeItemCount;

            if(count <= (nowPage-1)*countPerPage) {
                makeItemCount = 0;
            }else {
                makeItemCount = (count - (nowPage-1)*countPerPage >= countPerPage)? countPerPage : (count % countPerPage);
            }

            return gson.toJson(new DibsMembersModel(count, countPerPage, nowPage, DummyDataFactory.getInstance().getDibsMembersDummyData("http://cfile25.uf.tistory.com/image/1449C34C507376F43173A4", "이유정", makeItemCount)));
        }

        return null;
    }

}
