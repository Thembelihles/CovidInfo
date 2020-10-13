package com.example.covidinfo.Model;

public class CategoryItem {

// here i am taking only image url. and this is as integer because i am using it from drawable file.

    Integer itemId;
    Integer imageUrl;
    String ItemName;





    public CategoryItem(Integer itemId, Integer imageUrl,String ItemName) {
        this.itemId = itemId;
        this.imageUrl = imageUrl;
        this.ItemName = ItemName;
    }

    public String getItemName() { return ItemName; }

    public void setItemName(String itemName) { ItemName = itemName; }

    public Integer getItemId() { return itemId; }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}