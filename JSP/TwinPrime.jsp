<%! 
boolean isPrime(int n)
{
    int count=0;
    for(int i=1; i<=n; i++)
        {
            if(n%i == 0)
                count++;
        }
    if(count == 2)
        return true;
     else
        return false;
}
%>

<%
    int n1=Integer.parseInt(request.getParameter("FirstNum"));
    int n2=Integer.parseInt(request.getParameter("SecNum"));

    if(n1>n2)
        out.println("<b>The Range is Invalid.</b>");
    else
    {
        out.println("<b>The Twin Prime Numbers within the given range are : <b>");
                for(int i=n1; i<=(n2-2); i++)
                {
                    if(isPrime(i) == true && isPrime(i+2) == true)
                    {
                        out.print("("+i+","+(i+2)+") ");
                    }
                }
    }
%>