package OO.Desafios.GPT;

public class Personagens {

    private String nome;
    private int posX;
    private int posY;
    private int vida;
    private boolean vivo;

    Personagens(String nome, int posX, int posY, int vida, boolean vivo){
        setNome(nome);
        setPosX(posX);
        setPosY(posY);
        setVida(vida);
        setVivo(vivo);
    }

    public String getNome() {
        return nome;
    }
    public int getPosX() {
        return posX;
    }
    public int getPosY() {
        return posY;
    }
    public int getVida() {
        return vida;
    }
    public boolean isVivo() {
        return vivo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
