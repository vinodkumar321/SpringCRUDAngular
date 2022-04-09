form.onclick=function(event)
{
    event.target.style.backgroundColor="orange";
    setTimeout(()=>
    {
        alert("target ="+event.target.tagName+", this= "+this.tagName);
        event.target.style.backgroundColor=' '},0);
};