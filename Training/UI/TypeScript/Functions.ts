// //Named Function
// //Without Return value and without parameters
// function display()
// {
//     console.log("Display Function called")
// }
// display()

// //Without Return value and with parameters
// function sum(x:number,y:number)
// {
//     console.log("Sum of x and y is: "+(x+y))
// }
// sum(10,20)

// //Optinal Parameters
// function optional(msg1:string, msg2?: string):string{
//     return msg1+" "+msg2;
// }
// console.log(optional('Hello','John'));
// console.log(optional('Hello'));

// //Default Parameters
// function defaultfun(msg1:string, msg2: string="John"):string{
//     return msg1+" "+msg2;
// }
// console.log(defaultfun('Hello','Robert'));
// console.log(defaultfun('Hello'));

// //Anonymous Function
// let welcome=function(greet: string)
// {
//     console.log("Anonymous Function called "+greet)
// };
// welcome("Good Morning")

//Arrow Function/Lambda Functions =>

let arrow=(msg:string): string=>{
    return msg;
};
console.log(arrow("Arrow function called"))


