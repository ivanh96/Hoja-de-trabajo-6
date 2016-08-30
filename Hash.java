import java.util.Set;

public class Hash<E> 
{
	Factory factory = new Factory();

	private Set<E> principal;
	private Set<E> temporal;
	
	public Hash(int value)
	{
		principal = factory.setTable(value);
		temporal = factory.setTable(value);
	}
	
	//Agregar elemento a cualquier conjunto
	public void addElement (E value)
	{
		principal.add(value);
	}
	
	//Regresa el conjunto que se desea
    public Set<E> getConjunto()
    {
        return principal;
    }
    
    //Desarrolladores con todos lo ambitos 
	public Set<E> getIntersec(Set<E> Conjunto1, Set<E> Conjunto2, Set<E> Conjunto3)
	{
		temporal.clear();
		temporal.addAll(Conjunto1);
		temporal.retainAll(Conjunto2);
		temporal.retainAll(Conjunto3);
		return temporal;
	}
	
	//Desarrolladores con un ambito si otro no 
	public Set<E> getIntersec(Set<E> Conjunto1, Set<E> Conjunto2)
	{
		temporal.clear();
        temporal.addAll(Conjunto1);
        temporal.retainAll(Conjunto2);
        return temporal;
	}
	
	//Desarrolladores con dos ambitos pero no un tercero 
	public Set<E> getJuntos(Set<E> Conjunto1, Set<E> Conjunto2)
	{
		temporal.clear();
		temporal.addAll(Conjunto1);
		return temporal;
	}
	//Se resta el tercero del conjunto generado para saber quienes quedan fuera
	public Set<E> getResta(Set<E> Conjunto1, Set<E> Conjunto2)
	{
		temporal.clear();
		temporal.addAll(Conjunto2);
		temporal.removeAll(Conjunto1);
		return temporal;
	}
	
	//Calculo de Subconjunto
	public boolean subconjunto(Set<E> Conjunto1, Set<E> Conjunto2)
	{
		temporal.clear();
		temporal.addAll(Conjunto1);
		temporal.retainAll(Conjunto2);
		if (temporal.size() == Conjunto1.size())
		{
			return true;
		}
		else
		{
			return false;
		}
    }
}