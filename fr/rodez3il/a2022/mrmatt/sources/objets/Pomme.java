public class Pomme extends ObjetPlateau {
    
    @Override
    public abstract char afficher(){
        return "+";
    }


	// qui   renvoie   si   l’objet   est   marchable (c’est  à  dire  que  le  joueur  peut  s’y  déplacer)
    @Override
	public boolean estMarchable(){
		return true;
	}

}
