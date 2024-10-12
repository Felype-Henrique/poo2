
//Proxy para controlar o acesso de funções premium em um Software
public class Main {
    public static void main(String[] args) {
        // Usuário com acesso básico
        System.out.println("Usuário com acesso básico:");
        Software usuarioBasico = new ProxySoftware(false);
        usuarioBasico.usarFuncaoBasica();
        usuarioBasico.usarFuncaoPremium(); // Tentando usar função do Premium

        // Usuário com assinatura premium
        System.out.println("\nUsuário com assinatura premium:");
        Software usuarioPremium = new ProxySoftware(true);
        usuarioPremium.usarFuncaoBasica();
        usuarioPremium.usarFuncaoPremium();
    }
}
