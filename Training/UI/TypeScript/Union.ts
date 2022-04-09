let code1:(string | number);
code1=12;
console.log(code1)
code1="A123";
console.log(code1)

function displayCode(code2:string | number)
{
if(typeof(code2) === "number")
console.log("Code is Numeric");
if(typeof(code2) === "string")
console.log("Code is String");
}
console.log(displayCode(12));
console.log(displayCode("A123"));


