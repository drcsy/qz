/**
 * 
 */

function aaaa() {
	var abc = "${records}?js_string";
	console.log('js引入成功了');
	console.log(abc);
	<#if records??>
		<#list records as rd>
			console.log("${rd.patient_name}");
			alert("${rd.patient_name}");
		</#list>
	</#if>
};
aaaa();
