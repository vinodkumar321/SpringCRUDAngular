function restfunction(...msg: string[]): string
{
return 'Parameters are: '+" "+ msg.join(" ");
}
console.log(restfunction());
console.log(restfunction('Rest','Parameters'));
console.log(restfunction("Example",'of','Rest','parameters'));