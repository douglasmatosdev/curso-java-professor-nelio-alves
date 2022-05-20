package secao_14.exe2.entities;

import java.text.SimpleDateFormat;

public class ImportedProduct extends Product{
    private Double customFree;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customFree) {
        super(name, price);
        this.customFree = customFree;
    }

    public Double getCustomFree() {
        return customFree;
    }

    public void setCustomFree(Double customFree) {
        this.customFree = customFree;
    }

    public Double totalPrice() {
        return super.getPrice() + customFree;
    }

    @Override
    public String priceTag() {
        return super.getName() + " $ " + totalPrice() + " (Custom free: $ " + customFree + ")";
    }
}
