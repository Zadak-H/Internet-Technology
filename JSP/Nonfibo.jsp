
<%! 
void fib(int n1, int n2)
{
    int first = 0,second = 1 , next = 0;
    while(next<= n2)
    {
        if( !(next >= n1) )
            out.println(next + ", ");
        first = second;
        second = next;
        next = first + second;
    }
}
%>

<%
    int n1=Integer.parseInt(request.getParameter("FirstNum"));
    int n2=Integer.parseInt(request.getParameter("SecNum"));

    if(n1>n2)
        out.println("<b>The Range is Invalid.</b>");
    else
    {
        out.println("<b>The Non Fibonacchi Numbers within the given range are : <b>");
            fib(n1,n2);
    }
%>