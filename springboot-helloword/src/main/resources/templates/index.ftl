Hello Word <br>
${name} LOVE ${value}
<br>
<#if sex==1>
	男
	<#elseif sex==2>
	女
	<#else>
	其他
</#if>
<br>
<#list userList as user>
${user}<br>
</#list>