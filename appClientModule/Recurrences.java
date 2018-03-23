import java.io.*;

/**
 * en una misma clase se encuentran varias funciones de recursividad
 * @author Jhon Herrera
 */
public class Recurrences {

    /**
     *se obtiene el maximo comun divisor de tres numeros
     * 
     * @param a
     * @param b
     * @return describir que se retorna
     */
    public int mcd_euclides(int a, int b)
    {
    	if (b==0)
			return a;
		else
			return mcd_euclides (b, a%b);
    }
    
    
    /**
     * la funcion multiplica los numeros del 1 hasta el valor de "x"
     * @ muestra el valor de "x" al cual se le sacara el factorial.
     * @return: si el valor de "x" es 0 o 1 muestra su factorial que es 1, sino retorna la multiplicacion del valor de "x" por el valor de "x"-1 recursivamente hasta que el valor de "x" sea 1
     */
    public int factorial(int x)
    {
    	if(x==0|| x==1)
    		return 1;
    	else
    		return x*factorial(x-1);
    }
    
    
    /**
     * la funcion devueleve la el numero de la serie de fibonacci en la posicion "x".
     * @ "x" es el numero de la posicion de la serie de fibonacci 
     * @return, si x= 1 retorna posicion 0 y si x= 2 retorna posicion 1 y si ninguna  de las dos retorna la posicion "x" -1 mas la posicion de "x" -2.
     */
    public int fibonacci(int x)
    {
    	if (x==1)
    		return 0;
    	else 
    		if(x==2)
    			return 1;
    		else 
    			return fibonacci (x-1) + fibonacci (x-2);
    }
    
    

    /**
     * Describir en que consiste la funcion 
     * @param n
     * @param k
     * @return describir que se retorna
     */
    public int pascal(int n, int k)
    {
    	if (k==0||k==n)
    		return 1;
    		else
    			return pascal(n-1, k-1 )+ pascal(n-1,k);
    }
    
    
    /**
     * Describir en que consiste la funcion 
     * @return describir que se retorna
     */
    public String print_pascal()
    {
        String pascal_matrix = "";
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j <= i; j++)
                pascal_matrix += pascal(i, j) + "\t";
            
            pascal_matrix += "\n";
        }
        
        return pascal_matrix;
    }
    
    
    /**
     * multiplica dos numeros enteros
     * @param n
     * @param x
     * @return muestra el producto de n por x;
     */
    public int multiplicacion(int n, int x)
    {
    	if(x==1)
    		return n;
    	else 
    		return n + multiplicacion (n, x -1);
    }
    
    
    /**
     * Describir en que consiste la funcion
     * @param cadena
     * @return describir que se retorna
     */
    public String inversa_cadena(String cadena)
    {
        return "";
    }
        
    
    /**
     * Describir en que consiste la funcion
     * @param args
     */
    public static void main(String[] args)
    {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
        Recurrences recurrencias = new Recurrences();
    
        try
        {
            //Aca puede probar los resultados de sus recurrencias
            bw.write(recurrencias.factorial(15) + "\n"); // respuesta: 2004310016
            
            bw.write(recurrencias.fibonacci(25) + "\n"); // respuesta: 75025
            
            bw.write(recurrencias.multiplicacion(654, 97) + "\n"); // respuesta: 63438
            
            bw.write(recurrencias.mcd_euclides(369, 1218) + "\n"); // respuesta: 3
            
            bw.write(recurrencias.inversa_cadena("asdfghjkl") + "\n"); // respuesta: lkjhgfdsa
            
            bw.write(recurrencias.print_pascal() + "\n");
            /*
             * 1    
             * 1    1    
             * 1    2    1    
             * 1    3    3    1    
             * 1    4    6    4    1    
             * 1    5    10    10    5    1    
             * 1    6    15    20    15    6    1    
             * 1    7    21    35    35    21    7    1    
             * 1    8    28    56    70    56    28    8    1    
             * 1    9    36    84    126    126    84    36    9    1
             */
            
            bw.flush();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}