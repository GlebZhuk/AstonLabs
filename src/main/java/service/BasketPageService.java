package service;

import driver.DriverSingleton;
import page.BasketPage;

import java.util.LinkedHashMap;
import java.util.Map;

import static utils.Constants.COUNT_GOODS;

public class BasketPageService {
    private final BasketPage basketPage = new BasketPage();

    public Map<String, Integer> verifyGoods() {
        DriverSingleton.getInstance().getDriver().navigate().refresh();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = COUNT_GOODS-1; i >= 0; i--) {
            map.put(basketPage.getName(i), basketPage.getPrice(i));
        }
        return map;
    }

    public Integer getTotalPrice() {
        return basketPage.getTotalPrice();
    }
}
