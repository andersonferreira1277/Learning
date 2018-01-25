package classeBasica;

public class Operacao {
    //atributos
    private Float numero1, numero2;

    //métodos

    public Float somar(){
        return this.numero1+this.numero2;
    }

    public Float subtrair(Float numero1, Float numero2) {
        return numero1-numero2;
    }

    public Float dividir(Float numero1, Float numero2) throws Exception {
        if (numero2==0 || numero2<numero1){
           throw new Exception("Divisor inválido");
        }
        return numero1/numero2;
    }

    public Float multiplicar(){
        return this.numero1*this.numero2;
    }

    public Double elevar(){
        return Math.pow(this.numero1, this.numero2);
    }

    public void setNumero1(Float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(Float numero2) {
        this.numero2 = numero2;
    }
}
