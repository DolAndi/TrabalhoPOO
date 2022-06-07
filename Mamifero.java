package mamifero;

public abstract class Mamifero {
    public String raça;
    public void setRaça(String novaRaça){
        raça = novaRaça;
    }
    public String getRaça(){
        return raça;
    }
    public int tamanho;
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public int getTamanho(){
        return tamanho;
    }
    public boolean feroz;
    public void setFerocidade(boolean feroz){
        this.feroz = feroz;
    }
    public boolean getFerocidade(){
        return feroz;
    }
    
    public static void main(String[] args) {
        
        Cachorro zeus = new Cachorro();
        zeus.setRaça("Pitbull");
        zeus.setTamanho(45);
        zeus.setFerocidade(true);
        zeus.setLatido("AU AU");
        System.out.println(zeus.getRaça());
        System.out.println(zeus.getTamanho());
        System.out.println(zeus.getFerocidade());
        System.out.println(zeus.getLatido());
        System.out.println(zeus.alimentar());
        System.out.println(zeus.brincar());
        System.out.println(zeus.passear());
        
        Cavalo Cavalo1 = new Cavalo();
        Cavalo1.setRaça("Clydesdale");
        Cavalo1.setTamanho(170);
        Cavalo1.setFerocidade(true);
        Cavalo1.setCrina("Preto");
        System.out.println(Cavalo1.getRaça());
        System.out.println(Cavalo1.getTamanho());
        System.out.println(Cavalo1.getFerocidade());
        System.out.println(Cavalo1.getCrina());
        System.out.println(Cavalo1.alimentar());
    }
}
interface MamiferoDomesticado {
    String alimentar();
    
}
interface MamiferoEstimacao {
    String brincar();
    String passear();
}

class Cachorro extends Mamifero implements MamiferoDomesticado, MamiferoEstimacao{
    public String latido;
    public void setLatido(String somLatido){
        latido = somLatido;
    }
    public String getLatido(){
        return latido;
    }
    @Override
    public String getRaça(){
        String s = "A raça do cachorro é: ";
        return s+= super.raça;
    }
    @Override
    public String alimentar() {
        String s = "Cachorro alimentado";
        return s;
    }
    @Override
    public String brincar() {
        String s = "Você brincou com o cachorro!";
        return s;
    }
    @Override
    public String passear() {
        String s = "Você levou o cachorro passear";
        return s;
    }
}

class Cavalo extends Mamifero implements MamiferoDomesticado{
    public String corCrina;
    public void setCrina(String novaCrina){
        corCrina = novaCrina;
    }
    public String getCrina(){
        String s = "A cor da crina é: ";
        return s+= corCrina;
    }
    @Override
    public String getRaça(){
        String s = "A raça do cavalo é: ";
        return s+= super.raça;
    }
    @Override
    public String alimentar() {
        String s = "Você alimentou o cavalo";
        return s;
    }
}