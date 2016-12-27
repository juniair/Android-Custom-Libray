package com.mimo.indiemoa.classes.utils.controll;

import com.mimo.indiemoa.model.order.BasketModel;
import com.mimo.indiemoa.model.order.OrderItemModel;
import com.mimo.indiemoa.model.order.OrderModel;
import com.mimo.indiemoa.model.product.ProductModel;

import java.util.ArrayList;

/**
 * Created by Cro on 2016-11-10.
 */

public class BasketController extends ArrayList<BasketModel> {

    private BasketController() {

    }

    private static class SingleTon {
        private static final BasketController _instance = new BasketController();
    }

    public static BasketController getInstance() {
        return SingleTon._instance;
    }

    public void addOrderListItem(ProductModel productModel, OrderItemModel item) {
        BasketModel basketModel;
        int index = findAuthor(productModel.AuthorModel.Id);

        if(index==-1)
        {
            basketModel = new BasketModel(productModel.AuthorModel.Id, productModel.AuthorModel.Name, productModel.DeliveryChargeModel);
            this.add(basketModel);
        }else
        {
            basketModel = get(index);
        }

        OrderModel orderModel;
        index = findProduct(basketModel.orderListModel, productModel.Id);
        if(index==-1)
        {
            orderModel = new OrderModel(productModel.Id, productModel.ImageUrl.get(0), productModel.Name, new ArrayList<OrderItemModel>());
            basketModel.orderListModel.add(orderModel);
        }else
        {
            orderModel = basketModel.orderListModel.get(index);
        }

        index = orderModel.OrderList.indexOf(item);
        if(index==-1)
        {
            orderModel.OrderList.add(item);
        }else
        {
            orderModel.OrderList.get(index).Count += item.Count;
        }
    }

    public int findAuthor(int AuthorID) {
        for(int i=0;i<size();i++)
        {
            if(get(i).AuthorId == AuthorID)
            {
                return i;
            }
        }
        return -1;
    }

    public int findProduct(ArrayList<OrderModel> list, int ProductId) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).ProductId==ProductId)
            {
                return i;
            }
        }
        return -1;
    }
}
