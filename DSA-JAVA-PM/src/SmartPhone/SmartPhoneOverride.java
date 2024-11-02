package SmartPhone;

import java.util.Objects;

public class SmartPhoneOverride {




}



class SmartPhone implements Cloneable {
    private String brandName;
    private String modelName;
    private int batterymAh;
    private SmartPhone producerPrice;
    private SmartPhone retailPrice;
    public SmartPhone(String brandName, String modelName, int batterymAh, SmartPhone producerPrice, SmartPhone retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", batterymAh=" + batterymAh +
                ", producerPrice=" + producerPrice +
                ", retailPrice=" + retailPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

   @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
   }
}

class SmartphonePrice{

}


