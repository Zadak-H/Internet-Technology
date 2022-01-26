
	<%
				int num1=Integer.parseInt(request.getParameter("n1"));
				int num2=Integer.parseInt(request.getParameter("n2"));
				int x;
	%>
	<%
		if(num1<num2)
		{
			x=num2;
			num2=num1;
			num1=x;	
		}
	
		
		while(true)
		{
			int r;
			r=num1%num2;
			if(r==0)
				break;
			num1=num2;
			num2=r;
		}
	
		
		if(num2==1)

		{
	%>
			out.println("<br><b> The two numbers are mutually prime. </b>  ");
	<%
		}
		
 		else

		{
	%>
			out.println("<br><b> The two numbers are not mutually prime. </b> ");

	<%
		}

	%>



<%
	/*
		INPUT:-
		4
		3
		
		OUTPUT:-
		The two numbers are mutually prime.
	*/
%>