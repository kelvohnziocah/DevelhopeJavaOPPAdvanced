package DevelhopeJavaOPPAdvanced;

public class SmartphonePrice implements Cloneable {
        private String priceType;
        private double priceInEuros;

        public SmartphonePrice(String priceType, double priceInEuros) {
            this.priceType = priceType;
            this.priceInEuros = priceInEuros;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Price Type: " + priceType + ", Price in Euros: " + priceInEuros;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            DevelhopeJavaOPPAdvanced.SmartphonePrice that = (DevelhopeJavaOPPAdvanced.SmartphonePrice) obj;
            return Double.compare(that.priceInEuros, priceInEuros) == 0 && priceType.equals(that.priceType);
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = priceType.hashCode();
            temp = Double.doubleToLongBits(priceInEuros);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }
