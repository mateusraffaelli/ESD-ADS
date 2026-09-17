package ads.esd;

public class MainEditor {
    static void main() {
        EditorTexto editor = new EditorTexto();

        editor.escrever("Olá ");
        editor.escrever("Mundo!");

        System.out.println("Conteúdo atual: " + editor.getConteudo());

        editor.desfazer();
        System.out.println("Conteúdo após DESFAZER: " + editor.getConteudo());

        editor.refazer();
        System.out.println("Conteúdo após REFAZER: " + editor.getConteudo());

    }
}
