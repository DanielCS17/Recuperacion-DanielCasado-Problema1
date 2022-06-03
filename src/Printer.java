import javax.print.Doc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Printer {

    private boolean state;

    public Printer(boolean state) {
        this.state = state;
    }

    private Stack<Printer> printerList = new Stack<>();
    ArrayList<Document> documents = new ArrayList<Document>();

    public void turnOnPrinter(){
        if (state == true){
            System.out.println("La impresora ya está encendida.");
        }else {
            System.out.println("Encendiendo la impresora...");
            state = true;
            System.out.println("¡Impresora encendida!");
        }
    }

    public void turnOffPrinter(){
        if (state == false){
            System.out.println("La impresora ya está apagada.");
        }else {
            System.out.println("Apagando la impresora...");
            state = false;
            System.out.println("¡Impresora Apagada!");
        }
    }

    public void addDocument(String name, String size){
        if (state == true){
            Document myDoc = new Document(name, size);
            documents.add(myDoc);
        }else {
            System.out.println("ERROR! La impresora está apagada");
        }
    }

    public void showDocs(){
        if (state == true){
            int contador = 1;
            Iterator<Document> it = documents.iterator();

            System.out.println("\nLista de documentos:");

            while (it.hasNext()){
                System.out.println("Documento Nº" + contador + ": " + it.next());
                contador ++;
            }
            System.out.println("");
        }else{
            System.out.println("ERROR! La impresora está apagada");
        }
    }

    public void print(){
        if (state = true){
            for (int i = 0; i < documents.size(); i++) {
                System.out.println("Eliminando documentos...");
                System.out.println("Documento: " + documents.get(i) + ", eliminado");
                documents.remove(i);
            }
        }else{
            System.out.println("ERROR! La impresora está apagada");
        }
    }
}
