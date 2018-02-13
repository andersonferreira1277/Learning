package classeBasica;

public class Operacao {
    //atributos
    private Float numero1, numero2;

    //métodos

    public Float somar(){
        return this.numero1+this.numero2;
    }

    public Float subtrair() {
        return this.numero1-this.numero2;
    }

    public Float dividir() throws Exception {
        if (this.numero2==0 || this.numero2>numero1){
           throw new Exception("Divisor inválido");
        }
        return this.numero1/this.numero2;
    }

    public Float multiplicar(){
        return this.numero1*this.numero2;
    }

    public Float elevar(){
        Float resultado = this.numero1;
        for (int i = 1; i<this.numero2; i++){
            resultado *= this.numero1;
        }
        return resultado;
        //return Math.pow(this.numero1, this.numero2);
    }

    public void setNumero1(Float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(Float numero2) {
        this.numero2 = numero2;
    }

}
