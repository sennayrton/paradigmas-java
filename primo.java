public static Boolean esPrimo(int numero)
{
    Boolean esPrimoActual = true;
    if(numero<2)
    {
        esPrimoActual = false;
    }
    else
    {
        for(int x=2; x*x<=numero; x++)
        {
            if( numero%x==0 ){esPrimoActual = false;break;}
        }
    }
    return esPrimoActual;
}