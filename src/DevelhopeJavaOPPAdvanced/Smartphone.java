package DevelhopeJavaOPPAdvanced;

public class Smartphone implements Cloneable {
    String brandName;
    String modelName;
    int batterymAh;
    SmartphonePrice producerPrice;
    SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batterymAh,
                      SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh = batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }
    @Override
    public String toString(){
        return "Smartphone [brand name: "+ brandName +", model: "+ modelName + ", battery: "+batterymAh+", Producer Price: "+ producerPrice +", Retailer price "+ retailPrice +"]";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = (SmartphonePrice) producerPrice.clone();
        clonedSmartphone.retailPrice = (SmartphonePrice) retailPrice.clone();
        return clonedSmartphone;
    }
    @Override
    public int hashCode() {
        int result = brandName.hashCode();
        result = 31 * result + modelName.hashCode();
        result = 31 * result + batterymAh;
        result = 31 * result + producerPrice.hashCode();
        result = 31 * result + retailPrice.hashCode();
        return result;
    }
}
