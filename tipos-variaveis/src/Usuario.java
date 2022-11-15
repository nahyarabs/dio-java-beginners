public class Usuario {
    public static void main(String[] args) throws Exception {

    SmartTv umaSmartTv = new SmartTv(); {

            System.out.println("Tv ligada ? " + umaSmartTv.ligada);
            System.out.println("Canal atual : " + umaSmartTv.canal);
            System.out.println("Volume atual : " + umaSmartTv.volume);

            umaSmartTv.ligar();
            System.out.println("Novo status -> Tv ligada? " + umaSmartTv.ligada);

            umaSmartTv.desligar();
            System.out.println("Novo status -> Tv ligada ? " + umaSmartTv.ligada);

            umaSmartTv.aumentarVolume();
            umaSmartTv.aumentarVolume();
            
            System.out.println("Volume atual : " + umaSmartTv.volume);



        }
    }
    
}
