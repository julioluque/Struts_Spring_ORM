<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>EMPLOYEE REGISTRATION FORM</h1>

<html:form action="reg">
<pre>
NAME:		<html:text property="name"></html:text><html:errors property="name"/>
EMAIL:		<html:text property="email"></html:text><html:errors property="email"/>
ADDRESS:	<html:text property="address"></html:text><html:errors property="address"/>
			<html:submit value="Register" />


</pre>



</html:form>