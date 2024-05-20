public class IMC {
    public static void main(String[] args) {
        double peso = 52;
        double altura = 1.60;
        double imc = peso / (altura * altura);

        System.out.println("Seu peso é: " + peso + "Kg.");
        System.out.println("Sua altura é: " + altura + "m.");

        if (imc <= 18.4) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Sua classificação é: Abaixo do peso.");

        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Sua classificação é: Peso ideal.");

        } else if (imc >= 25 && imc < 30) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Sua classificação é: Acima do peso.");

        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Sua classificação é: Obesidade grau I.");

        } else if (imc >= 34.9 && imc <= 39.9) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Sua classificação é: Obesidade grau II.");
            
        } else if (imc >= 40) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Sua classificação é: Obesidade grau III.");
        }
    }
}