package com.zipcodewilmington.froilansfarm.farm.days;

public class MarketDay extends Day{
    private int cashForMarket;
    @Override
    public void run() {
        haveBreakfast();
        sellingCrops();
        buyingCrops();
        farm.profit(cashForMarket);
        System.out.println(farm.getFridge().toString() + "Savings: " + farm.getSavings());
    }

    private void buyingCrops() {
        int totalCornNeeded = fridge.totalCornToBePurchased();
        System.out.println(String.format(
                "We sold %d surplus food and need to buy %d bushels of corn.",
                cashForMarket, totalCornNeeded
        ));
        cashForMarket -= totalCornNeeded;
    }

    private void sellingCrops() {
        cashForMarket = fridge.totalSellableEdibles();
    }
}
