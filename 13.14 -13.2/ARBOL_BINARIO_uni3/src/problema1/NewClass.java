
package problema1;
import static.*;
public class NewClass {
    
    private Nodo raiz;
    
    public Arbol(int valor) {
        this.raiz = new Nodo(valor);
    }

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

public NewClass final class alumno
{
	private int numero;
	private String nombre[20];
	private String direccion[20];
	public alumno clone()
	{
		alumno varCopy = new alumno();
		varCopy.numero = this.numero;
		varCopy.nombre = this.nombre;
		varCopy.direccion = this.direccion;
		return varCopy;
	}
}
public NewClass final class nodo
{
	private Nodo dato;
	private Nodo nodo * der;
	private Nodo nodo * izq;
	public nodo clone()
	{
		nodo varCopy = new nodo();
		varCopy.dato = this.dato;
		varCopy.nodo = this.nodo;
		varCopy.nodo = this.nodo;
		return varCopy;
	}
}
private void cargar_alumno(ALUMNO*dato){
	JoptionPane.showInputDialog("Ingrese numero: ");
	JoptionPane.showInputDialog("%d", &dato -> numero);
	printf("\nIngrese nombre: ");
	scanf("%s", dato -> nombre);
	printf("\nIngrese direccion: ");
	scanf("%s", dato -> direccion);
}

private void insertar_nodo(NODO * &&  raiz, NODO * &&  nuevo)
{
	if (raiz == 0)
	{
		raiz = nuevo;
		printf("Nodo agregado\n");
		return;
	}
	else 
	{
		if (nuevo -> dato.numero < raiz -> dato.numero) // Si el registro del nuevo nodo es menor
		{
			insertar_nodo(raiz -> izq, nuevo);
		}
		else if (nuevo -> dato.numero > raiz -> dato.numero) // De ser mayor
		{
			insertar_nodo(raiz -> der, nuevo);
		}
		else 
		{
			printf("Numero ya existente\n");
			return;
		}
	}
}
private void agregar_nodo(Nodo nodo, Nodo raiz)
{
	 * nuevo = (NODO*)malloc(sizeof(NODO));
	if (!nuevo)
	{
		printf("No se pudo alojar memoria...");
		return;
	}
	else
	{
		cargar_nodo(nuevo -> dato);
	}
insertar_nodo(nodo, nuevo);
}
private void imprimir_registro(alumno dato)
{
	printf("Numero del alumno: \t%d\n", dato.numero);
	printf("Nombre: \t%s\n", dato.nombre);
	printf("Direccion: \t%s\n", dato.direccion);
	printf("------------------------------");
}
private void imprimir_arbol(NODO * raiz)
{
	if (raiz == NULL)
	{
		return;
	}
	else 
	{
		imprimir_arbol(raiz -> izq);
		imprimir_registro(raiz -> dato);
		imprimir_arbol(raiz -> der);
	}
}
private void imprimir_arbol(NODO * raiz,boolean guardar)

	if (raiz == NULL){
           return true;
	}
	else {
		imprimir_arbol(raiz -> izq, guardar);
		if (guardar == true)
		guardar_registro(raiz -> dato);
		}
		else
		{
			imprimir_registro(raiz -> dato);
		}
		imprimir_arbol(raiz -> der, guardar);
	}
}
private void guardar_registro(NODO * raiz)
{
	FILE * fp = fopen("registro.txt", "a"); // a De append
	fprintf(fp, "Numero del alumno: \t%d\n Nombre: \t%s\n Direccion: \t%s\n ---------------------------------\n", raiz -> dato.numero, raiz -> dato.nombre, raiz -> dato.direccion);
	fclose(fp);
}
}
