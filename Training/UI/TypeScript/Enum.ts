enum days{
    Monday=1,
    Tuesday,
    Weekend=0
}
console.log(days.Tuesday)

function weekend(day:string):days{
    if(day === 'Saturday' || day==='Sunday')
    {
        return days.Weekend;
    }
}

let day:days= weekend('Saturday');
console.log(day)