let num1:number=123456;
let binary:number=0b111001;
let octal:0o377;
let hexa:0x37CF;

console.log(num1)
console.log(num1.toExponential(1))

let num2=10667.2345
console.log(num2.toFixed(1))
console.log(num2.toLocaleString('de-DE'))
console.log(num2.toPrecision(1))
console.log(num1.toString(2))

let num3=new Number(123);
console.log(num3);
console.log(num3.valueOf())
console.log(typeof num3)

