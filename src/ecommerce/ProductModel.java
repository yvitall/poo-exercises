package ecommerce;

public class ProductModel {
    private String nameProduct;
    private double price;
    private int qtStock;

    private double discount;

    public ProductModel() {
    }

    public ProductModel(String nameProduct, double price, int qtStock) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.qtStock = qtStock;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public int getQtStock() {
        return qtStock;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtStock(int quantity) {
        this.qtStock = quantity;
    }

    public void addStock(int addStock) {
        this.qtStock += addStock;
        System.out.printf("Foram adicionados %d no Estoque.", addStock);
    }

    public void removeStock(int quantity) {
        if (quantity == 1) {
            this.qtStock -= quantity;
            System.out.printf("Foi vendido %d %s", quantity, nameProduct);
        } else if (quantity > 1) {
            this.qtStock -= quantity;
            System.out.printf("Foram vendidos %d %ss", quantity, nameProduct);
        } else if (this.qtStock < quantity) {
            System.out.println("Quantidade de produto inválida.");
        }
    }

    public double discount(double percentual) {
        this.discount = percentual;
        return this.price - (this.price * (percentual / 100));
    }

    public void fecharCompra(double newPrice) {
        qtStock -= 1;
        System.out.println("====== INFORMAÇÕES PRODUTO ======" + '\n' +
                "Produto: " + nameProduct + '\n' +
                "Preço: R$" + price + '\n' +
                "Quantidade em Estoque: " + qtStock + '\n' +
                "Desconto: %" + discount + '\n' +
                "Valor Total: R$" + newPrice
        );
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", qtStock=" + qtStock +
                ", discount=" + discount +
                '}';
    }
}
