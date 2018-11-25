package graphique;
import java.util.ArrayList;
public class CompositeGraphic implements IGraphic{

    //Collection de graphiques enfants.
    private ArrayList<IGraphic> mChildGraphics = new ArrayList<IGraphic>();

    //Imprime le graphique.
    public void print() {
        for (IGraphic graphic : mChildGraphics) {
            graphic.print();
        }
    }

    //Ajoute le graphique à la composition.
    public void add(IGraphic graphic) {
        mChildGraphics.add(graphic);
    }

    //Retire le graphique de la composition.
    public void remove(IGraphic graphic) {
        mChildGraphics.remove(graphic);
    }


}
